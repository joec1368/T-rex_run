import javax.sound.sampled.Line;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferStrategy;

public class background extends Move implements Runnable {
    JFrame frame;
    Canvas canvas;
    BufferStrategy bufferStrategy;
    enemy_ground ene = new enemy_ground();
    enemy_middle_sky eneMidSky = new enemy_middle_sky();
    enemy_top_sky eneTopSky = new enemy_top_sky();
    boolean running = true;

    public background() {
        frame = new JFrame("Basic Game");
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
                    if(canjump) moveIt(evt);
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
        while (running = true) {
            Paint();
            try {
                if(!canjump) jumpnow();
                Thread.sleep(25);
               enemy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
        public Graphics2D Paint () {
            Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
            g.clearRect(0, 0, 500, 500);
            Paint(g);
            bufferStrategy.show();
            return g;
        }


        protected void Paint (Graphics2D g){
            g.fillOval(myX, myY, 30, myH);
            Line2D lin = new Line2D.Float(0, 430, 500,430);
            g.draw(lin);
            Paintenemy(g);

        }
        protected void Paintenemy(Graphics2D g){
             ene.createene(g);
             eneTopSky.createene(g);
            eneMidSky.createene(g);
        }
        protected void enemy() throws InterruptedException {
            ene.move();
             ene.getvalue(myY);
             eneTopSky.getvaluY(myY);
             eneTopSky.move();
            eneMidSky.move();
            eneMidSky.getvalueY(myY);
        }



    }
