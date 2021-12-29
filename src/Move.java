import java.awt.event.KeyEvent;

public class Move{
    int myX = 100;
    int myY = 400;
    int myH = 30;
    int i = 10;
    int storageY;
    boolean canJump = true;

    public void moveIt(KeyEvent evt) throws InterruptedException {
        if(!canJump){
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
                if(canJump){
                    canJump = false;
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
        else canJump = true;
        i--;
        if(canJump)
        {
            i = 10;
            storageY = myY;
        }
    }

    public void instanceDown() {
        if (myY > 400) {
            myY = myY - 5;
        }
        if (myY <= 400) {
            myY = 400;
            canJump = true;
            i = 10;
        }
    }
}
