public class meet extends Move{
    int x;
    int y;
    int myX;
    int myH;

    public void getvalue(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void getvaluefrommain()
    {
        myX = super.myX;
        myH = super.myH;
    }

    public boolean touch(int myY,int myX){
        getvaluefrommain();
        if(myX - x <30 && myX - x > -30)
        {
            System.out.println("x ready");
            if(myY - y < myH && myY - y > -myH){
                return false;
            }
        }
        return true;
    }
}
