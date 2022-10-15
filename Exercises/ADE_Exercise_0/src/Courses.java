public class Courses {

    //properties
    String coursename;
    int semester;
    int duration;
    int credits;
    int year;
    float gpa;
    String professor;
    boolean mandatory;

    //methods
    void info5100(){

        System.out.println("This is a java course");
    }
    void info6100(){

        System.out.println("This is a coop course");
    }
    void info6105(){

        System.out.println("This is a data science course");
    }

    //constructor
    public Courses(String course_name){
        coursename=course_name;
        System.out.println("I have taken "+coursename+" course");
    }
}
