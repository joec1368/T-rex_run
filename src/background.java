import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Line2D;
import java.awt.image.BufferStrategy;

public class background extends Move implements Runnable {
    JFrame frame;
    Canvas canvas;
    BufferStrategy bufferStrategy;
    enemy_ground[] enemy_grounds = new enemy_ground[2000];
    enemy_middle_sky[] enemy_middle_skies = new enemy_middle_sky[2000];
    enemy_top_sky[] enemy_top_skies = new enemy_top_sky[2000];
    int numberGroundEnemy = 0;
    int numberMiddleSkyEnemy = 0;
    int numberTopSkyEnemy = 0;
    boolean running = true;
    timer timerBackground = new timer();
    int lag = 25;
    RandomNum RandomNum = new RandomNum();
    long returnTime;

    public background() {
        timerBackground.setTime();
        frame = new JFrame("T-rex?");
        JPanel panel = (JPanel) frame.getContentPane();
        panel.setPreferredSize(new Dimension(500, 500));
        panel.setLayout(null);
        canvas = new Canvas();
        canvas.setBounds(0, 0, 500, 500);
        canvas.setIgnoreRepaint(true);
        panel.add(canvas);
        canvas.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                try {
                    if(canJump) moveIt(evt);
                    else {
                       if(evt.getKeyCode()==KeyEvent.VK_DOWN){
                           instanceDown();

                       }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
        canvas.createBufferStrategy(2);
        bufferStrategy = canvas.getBufferStrategy();
        canvas.requestFocus();
    }

    public void run() {
        while (true) {
            Paint();
            try {
                if(!canJump) jumpnow();
                lagTime();
                enemy();
                if(!running)
                {
                   returnTime = timerBackground.time();
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

        public Graphics2D Paint () {
            Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
            g.clearRect(0, 0, 500, 500);
            Paint(g);
            g.setFont(new Font("TimesRoman", Font.PLAIN, 30));
            g.drawString("Survive Time : " + timerBackground.time() + "s",150,200);
            bufferStrategy.show();
            return g;
        }

        protected void Paint (Graphics2D g){
            g.fillOval(myX, myY, 30, myH);
            Line2D lin = new Line2D.Float(0, 430, 500,430);
            g.draw(lin);
            PaintEnemy(g);
        }
        protected void PaintEnemy(Graphics2D g){
            int temp = 0;
            int temp1 = 0;
            int temp2 = 0;
            while (enemy_grounds[temp] != null) {
                enemy_grounds[temp].createEne(g);
                temp ++;
            }while (enemy_middle_skies[temp1] != null) {
                enemy_middle_skies[temp1].createene(g);
                temp1 ++;
            }
            while (enemy_top_skies[temp2] != null) {
                 enemy_top_skies[temp2].createene(g);
                temp2 ++;
            }
        }

        protected void enemy() throws InterruptedException {
            switch(RandomNum.randomNumber(timerBackground.originTime())){
                case 0:
                    enemy_grounds[numberGroundEnemy++] = new enemy_ground();
                    break;
                case 1:
                    enemy_middle_skies[numberMiddleSkyEnemy++] = new enemy_middle_sky();
                    break;
                case 2:
                    enemy_top_skies[numberTopSkyEnemy++] = new enemy_top_sky();
                    break;
            }
            enemyMove();
        }

        protected void enemyMove() throws InterruptedException {
            int temp = 0;
            int temp1 = 0;
            int temp2 = 2;
            while (enemy_grounds[temp] != null && running) {
                running = enemy_grounds[temp].move();
                enemy_grounds[temp].getValue(myY,myX);
                temp ++;
            }
            while (enemy_middle_skies[temp1] != null && running) {
               running =  enemy_middle_skies[temp1].move();
                enemy_middle_skies[temp1].getvalueY(myY,myX);
                temp1 ++;
            }
            while (enemy_top_skies[temp2] != null && running) {
               running = enemy_top_skies[temp2].move();
                enemy_top_skies[temp2].getvaluY(myY,myX);
                temp2 ++;
            }
        }

        public void lagTime() throws InterruptedException {
            if(timerBackground.time() <30){
                Thread.sleep(lag);
            }
            else if( timerBackground.time() >= 30 && timerBackground.time() < 60) {
                Thread.sleep(lag - 3);
            }
            else if (timerBackground.time() >= 60 && timerBackground.time() <90)
            {
                Thread.sleep(lag - 6);
            }
            else if(timerBackground.time() >= 90)
            {
                Thread.sleep(lag - 9);
            }
        }
        public void close(){
        frame.dispose();
        }
    }
