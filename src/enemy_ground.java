import java.awt.*;

public class enemy_ground {
    int eneY = 400;
    int eneX = 550;
    int myY;
    int myX;
    boolean checkFinal = true;
    meet meet = new meet();

    public boolean move() throws InterruptedException {
        meet.getvalue(eneX,eneY);
        eneX = eneX - 10;
        meet.getvaluefrommain();
        checkFinal = meet.touch(myY,myX);
        return checkFinal;
    }

    public void createEne(Graphics2D g){
        g.drawRect(eneX, eneY, 30, 30);
    }

    public void getValue(int y,int x){
        myY = y;
        myX = x;
    }

}
