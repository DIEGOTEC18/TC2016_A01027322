
import java.util.Random;

public class Latency {

    public static void simulateLatency(int initialValue, int finalValue){

        Random r = new Random();
        int time = r.nextInt(finalValue - initialValue) + initialValue;

        long start = System.currentTimeMillis();

        System.out.print("Sending Data...");

        //Infinite Loop:
        while(true){

            long current = System.currentTimeMillis();

            if(current - start >= time*1000){break;}

        }

    }

    public static void sendData(byte[] data){

        simulateLatency(2, 15);

        System.out.println("\n" + new String(data));

    }

}