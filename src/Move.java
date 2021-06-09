import java.awt.event.KeyEvent;

public class Move{
    int myX = 100;
    int myY = 400;
    int myH = 30;
    int i = 10;
    int storageY;
    boolean canjump = true;
    public void moveIt(KeyEvent evt) throws InterruptedException {
        if(!canjump){
            jumpnow();
        }
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_DOWN:
                myH = 15;
                if(myY != 415) {
                    myY = myY + 15;
                }
                break;
            case KeyEvent.VK_UP:
                if(canjump){
                    canjump = false;
                    if(myH == 15){
                        myH = 30;
                        myY = myY-15;
                    }
                    jumpnow();
                }
                break;
            case KeyEvent.VK_LEFT:
                myX -= 5;
                break;
            case KeyEvent.VK_RIGHT:
                myX += 5;
                System.out.println(myX);
                break;
        }
       // switch (evt.)

    }
    public void jumpnow() throws InterruptedException {

        if(i >= 0){
            myY -= i;
            storageY = myY;
        }
        else if (i < 0 && i >= -10){
            myY -= i;
            storageY = myY;
        }
        else canjump = true;
        i--;
        if(canjump)
        {
            i = 10;
            storageY = myY;
        }

        /*for(int i = 10 ; i >= 0 ; i--){
            myY -= i;

          //  System.out.println(myY);
            Thread.sleep(25);
        }
        Thread.sleep(15);
        for(int i = 0; i<=10 ;i++)
        {
            myY += i;
           // System.out.println(myY);
            Thread.sleep(25);
        }
        canjump = true;*/

    }

}
