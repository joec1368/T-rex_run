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
                    moveIt(evt);
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
                Thread.sleep(25);
            } catch (InterruptedException e) {
            }
        }
    }
        public void Paint () {
            Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
            g.clearRect(0, 0, 500, 500);
            Paint(g);
            bufferStrategy.show();
        }


        protected void Paint (Graphics2D g){
            g.fillOval(myX, myY, 30, 30);
            Line2D lin = new Line2D.Float(0, 430, 500,430);
            Line2D lin2 = new Line2D.Float(0, 400, 500,400);
            Line2D lin3 = new Line2D.Float(0, 345, 500,345);
            g.draw(lin);
            g.draw(lin2);
            g.draw(lin3);

        }
    }
