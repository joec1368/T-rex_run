import java.awt.*;

public class enemy_ground {
    meet meet = new meet();
    int eneY = 400;
    int eneX = 550;
    int myY;
    public void move() throws InterruptedException {
        meet.getvalue(eneX,eneY);
      if(eneX > -30){
          eneX = eneX - 10;
          System.out.println(eneX);
          meet.getvaluefrommain();
          meet.touch(myY);

      }

      else{
          eneX = 10000;
      }

    }

    public void createEne(Graphics2D g){
        g.drawRect(eneX, eneY, 30, 30);

    }
    public void getValue(int y){
        myY = y;
    }


}
