import java.util.Random;

public class RandomNum {
    long times = 1;
    public int randomNumber(long time) throws InterruptedException {
        if(time - times*1000 >= 0 ){
            times++;
            System.out.println(times);
            return new Random().nextInt(3);
        }

        return 5;
    }

}
