
public class main {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            long time = 1;
            start st = new start();
            st.background();
            while (st.temp == 0) {
                Thread.sleep(500);
            }
            st.close();
                switch (st.temp) {
                    case 1:
                        background ex = new background();
                        Thread first = new Thread(ex);
                        first.start();
                        first.join();
                        time = ex.returnTime;
                        ex.close();
                        break;
                    case 2:
                        nightmare_background exni = new nightmare_background();
                        Thread nightmare = new Thread(exni);
                        nightmare.start();
                        nightmare.join();
                        time = exni.returnTime;
                        exni.close();
                        break;
                }
            finish finish = new finish();
            finish.background(time);
            while (finish.temp == 0) {
                Thread.sleep(500);
            }
            finish.close();
        }
    }
}

