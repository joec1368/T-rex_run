public class timer {
    long setTime;
    long nowTime;
    public void setTime(){
        setTime = System.currentTimeMillis();
    }
    public long time(){
        nowTime = System.currentTimeMillis();
        return (nowTime-setTime)/1000;
    }
    public long originTime(){
        nowTime = System.currentTimeMillis();
        return nowTime - setTime;
    }
}
