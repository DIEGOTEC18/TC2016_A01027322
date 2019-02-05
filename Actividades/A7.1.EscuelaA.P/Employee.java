import java.util.Date;

public class Employee extends Person{

    private Job hisJob;

    //Aquí hay composición con Job
    public Employee(){

        //Hay una agregacion de Job con Date.
        hisJob = new Job(1, 1000, new Date());

    }

    public void print(){



    }

}
