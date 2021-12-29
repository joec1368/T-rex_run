import java.awt.*;

public class enemy_middle_sky {
    int eneY = 385;
    int eneX = 750;
    int myY;
    int myX;
    meet meet = new meet();
    boolean checkFinal = true;

    public boolean move() throws InterruptedException {
        meet.getvalue(eneX,eneY);
        eneX = eneX - 10;
        meet.getvaluefrommain();
        checkFinal = meet.touch(myY,myX);
        return checkFinal;
    }

    public void createene(Graphics2D g){
        g.drawRect(eneX, eneY, 30, 30);
    }

    public void getvalueY(int y,int x){
        myY = y;
        myX = x;
    }

}
