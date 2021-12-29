import java.awt.*;

public class enemy_top_sky {
    int eneY = 345;
    int eneX = 800;
    int myY;
    int myX;
    meet meet = new meet();
    boolean checkFinal = true;

    public boolean move() throws InterruptedException {
        meet.getvalue(eneX,eneY);
        eneX = eneX - 10;
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
