import java.awt.*;

public class ene_nightmare_ground extends enemy_ground {
    int eneX = -50;

    public boolean move() throws InterruptedException {
        meet.getvalue(eneX,eneY);
        eneX = eneX + 10;
        meet.getvaluefrommain();
        checkFinal = meet.touch(myY,myX);
        return checkFinal;
    }

    public void createEne(Graphics2D g){
        g.drawRect(eneX, eneY, 30, 30);
    }

    public void getvaluY(int y,int x){
        myY = y;
        myX = x;
    }

}
