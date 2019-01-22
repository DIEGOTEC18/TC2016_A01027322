import java.util.Arrays;

public class Hour {

    private int hours, minutes, seconds;

    public void setHours(int hours){

        this.hours = hours;

    }

    public void setMinutes(int minutes){

        this.minutes = minutes;

    }

    public void setSeconds(int seconds){

        this.seconds = seconds;

    }

    public void setTime(String time){

        if(time.length() != 8){

            System.out.println("Formato incorrecto. Ingrese una en el formato hh:mm.ss");
            return;
        }

        String[] stringHour = time.split(":");
        String[] stringMinutes = stringHour[1].split("\\.");

        //System.out.println(stringHour[1]);
        //System.out.println(Arrays.toString(stringHour));
        //System.out.println(Arrays.toString(stringMinutes));

        this.hours = Integer.parseInt(stringHour[0]);
        this.minutes = Integer.parseInt(stringMinutes[0]);
        this.seconds = Integer.parseInt(stringMinutes[1]);

    }

    public int getData(int position){

        switch (position){

            case 1:

                return hours;

            case 2:

                return minutes;

            case 3:

                return seconds;
        }

        return -1;
    }

    public String getTime(){

        return hours + ":" + minutes + "." + seconds;

    }

}
