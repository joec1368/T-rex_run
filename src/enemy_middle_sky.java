import java.awt.*;

public class enemy_middle_sky {
        int eneY = 385;
        int eneX = 750;
        int myY;
        meet meet = new meet();
        public void move() throws InterruptedException {
            meet.getvalue(eneX,eneY);
            if(eneX > -30){
                eneX = eneX - 10;
                //System.out.println(eneX);
                meet.getvaluefrommain();
                meet.touch(myY);
            }
            else{
                eneX = 10000;
            }

        }

        public void createene(Graphics2D g){
            g.drawRect(eneX, eneY, 30, 30);
        }
        public void getvalueY(int y){
            myY = y;
        }


}
