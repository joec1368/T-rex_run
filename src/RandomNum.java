import java.util.Random;

public class RandomNum {
    long times = 1;
    int constant = 1000;

    public int randomNumber(long time) throws InterruptedException {
        if(time >= 15000 && time < 30000) {
            constant = 950;
        }
        else if(time >= 30000 && time < 45000) {
            constant = 900;
        }
        else if(time >= 45000 && time < 60000) {
            constant = 850;
        }
        else if(time >= 60000) {
            constant = 800;
        }
        else {
            constant = 1000;
        }
        if(time - times*constant>= 0 ){
            times++;
            System.out.println(times);
            return new Random().nextInt(3);
        }
        return 10;
    }

    public int randomNumberNightmare(long time) throws InterruptedException {
        if(time >= 15000 && time < 30000) {
            constant = 950;
        }
        else if(time >= 30000 && time < 45000) {
            constant = 900;
        }
        else if(time >= 45000 && time < 60000) {
            constant = 850;
        }
        else if(time >= 60000) {
            constant = 800;
        }
        else {
            constant = 1000;
        }
        if(time - times*constant>= 0 ){
            times++;
            System.out.println(times);
            return new Random().nextInt(6);
        }
        return 10;
    }
}
