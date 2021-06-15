
public class main {
    public static void main(String[] args) throws InterruptedException {
        long time;
        start st = new start();
        st.background();
        while(st.temp == 0)
        {
            Thread.sleep(500);
        }
        st.close();
        while(true) {
            background ex = new background();
            Thread first = new Thread(ex);
            first.start();
            first.join();
            time = ex.returnTime;
            ex.close();
            finish finish = new finish();
            finish.background(time);
            while(finish.temp == 0){
                Thread.sleep(500);
            }
                finish.close();
        }






    }

}
