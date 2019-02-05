public class Institution {

    private int contTeachers, contStudents;
    private String name;
    private Student[]studentLits;
    private Teacher[]teacherList;

    //Constructor default:
    public Institution(){

        this.name = "School with no name";
        contTeachers = 0;
        contStudents = 0;
        studentLits = new Student[100];
        teacherList = new Teacher[100];

    }

    //Constructor con parámetros:
    public Institution(String name){

        this.name = name;
        contTeachers = 0;
        contStudents = 0;
        studentLits = new Student[100];
        teacherList = new Teacher[100];

    }

    //Asociación:
    public void receivesVisits(Visitor visitor){

        visitor.visit();

    }

    //Agregación:
    public void hiresTeacher(Teacher theTeacher){

        if(contTeachers < 100) {
            teacherList[contTeachers] = theTeacher;
            contTeachers++;
        } else{

            System.out.println("No more teachers for hire.");

        }

    }

    public int getNumberOfTeachers(){

        return contTeachers -1;

    }

    public void enrollStudent(Student theStudent){

        if(contStudents < 100){

            studentLits[contStudents] = theStudent;

            contStudents++;

        } else {

            System.out.println("No more space for students");
            
        }

    }

}
