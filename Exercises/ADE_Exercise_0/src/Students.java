public class Students {
    //properties
    String name;
    char gender;
    int semester;
    int college;
    int address;
    int dob;
    float gpa;
    boolean internship;

    //methods
    void Prateek(){

        System.out.println("He is Prateek");
    }
    void Kevin(){

        System.out.println("He is Kevin");
    }
    void Sukruth(){

        System.out.println("He is Sukruth");
    }

    //constructor
    public Students(float gpa_points){
        gpa=gpa_points;
        System.out.println("My GPA is "+gpa);
    }
}
