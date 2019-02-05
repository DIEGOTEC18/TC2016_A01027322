import java.util.Date;

public class Job {

    private int jobId;
    private int salary;
    Date startDate;
    Date endDate;

    public Job(){



    }

    public Job(int jobId, int salary, Date startDate){

        this.jobId = jobId;
        this.salary = salary;
        this.startDate = startDate;

    }

    public void doTheJob(){

        System.out.println("Doing the job.");

    }

    public void print(){

        System.out.println("The job id is: " + jobId);

    }

}
