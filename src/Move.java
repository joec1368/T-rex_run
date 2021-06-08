import java.awt.event.KeyEvent;

public class Move{
    int myX = 100;
    int myY = 400;
    boolean canjump = true;
    public void moveIt(KeyEvent evt) throws InterruptedException {
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_DOWN:
                ;
                break;
            case KeyEvent.VK_UP:
                if(canjump){
                    canjump = false;
                    jumpnow();
                }
                break;
            case KeyEvent.VK_LEFT:
                myX -= 5;
                break;
            case KeyEvent.VK_RIGHT:
                myX += 5;
                break;
        }
    }
    public void jumpnow() throws InterruptedException {
        for(int i = 10 ; i >= 0 ; i--){
            myY -= i;
            System.out.println(myY);
            Thread.sleep(20);
        }
        Thread.sleep(15);
        for(int i = 0; i<=10 ;i++)
        {
            myY += i;
            System.out.println(myY);
            Thread.sleep(20);
        }
        canjump = true;

    }

}
