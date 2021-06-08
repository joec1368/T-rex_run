import java.awt.*;

public class enemy_ground{
    int eneY = 410;
    int eneX = 400;
    public void move() throws InterruptedException {
      if(eneX > -30){
          eneX = eneX - 10;
      }

    }

    public void createene(Graphics2D g){
        g.drawRect(eneX, eneY, 20, 20);
        g.drawRect(300,300,20,20);
    }

}
