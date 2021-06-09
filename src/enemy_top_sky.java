import java.awt.*;

public class enemy_top_sky {
    int eneY = 345;
    int eneX = 800;
    int myY;
    meet meet = new meet();

    public void move() throws InterruptedException {
        meet.getvalue(eneX,eneY);
        if(eneX > -30){
            eneX = eneX - 10;
          //  System.out.println(eneX);
            meet.getvaluefrommain();
            meet.touch(myY);
          // Thread.sleep(1000);

        }
        else{
            eneX = 550;
        }

    }

    public void createene(Graphics2D g){
        g.drawRect(eneX, eneY, 30, 30);
    }

    public void getvaluY(int y){
        myY = y;
    }
}
