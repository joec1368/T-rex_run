import java.awt.*;

public class ene_nightmare_top_sky extends enemy_top_sky{
    int eneY = 345;
    int eneX = -50;
    int myY;
    int myX;
    boolean checkFinal = true;

    public boolean move() throws InterruptedException {
        meet.getvalue(eneX,eneY);
        eneX = eneX + 10;
        System.out.println(eneX);
        meet.getvaluefrommain();
        checkFinal = meet.touch(myY,myX);
        return checkFinal;
    }

    public void createene(Graphics2D g){
        g.drawRect(eneX, eneY, 30, 30);
    }

    public void getvaluY(int y,int x){
        myY = y;
        myX = x;
    }

}
