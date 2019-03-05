
import java.util.Random;

public class Latency {

    public static void simulateLatency(int initialValue, int finalValue){

        Random r = new Random();
        int time = r.nextInt(finalValue - initialValue) + initialValue;

        long start = System.currentTimeMillis();

        //Infinite Loop:
        while(true){

            System.out.print(".");
            long current = System.currentTimeMillis();

            if(current - start >= time*1000){break;}

        }

    }

}
