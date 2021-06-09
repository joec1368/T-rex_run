public class meet extends Move{
    //ball x myX
    //ball y myY
    //ball h myH 30/15
    //ball width 30
    int x;
    int y;
    int myX;
    int myY;
    int myH;
    public void getvalue(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void getvaluefrommain()
    {
        myX = super.myX;
       // myY = Move.classvaly;
        myH = super.myH;
    }
    public void touch(int myY){
        getvaluefrommain();
       // System.out.println(myY);
        if(myX - x <30 && myX - x > -30)
        {
            System.out.println("x ready");
            if(myY - y < myH && myY - y > -myH){
                System.exit(0);
                System.out.println("allready");
            }
        }
    }

}
