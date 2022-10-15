public class Chair {

    //properties
    String material;
    String chair_quality;
    int manufacturing_year;
    int lifespan;
    int num_of_legs;
    int size;
    String purpose;
    boolean durability;

    //methods
    void bench(){

        System.out.println("This chair is used as a bench");
    }
    void sitting_chair(){

        System.out.println("This is a sitting chair");
    }
    void workout_chair(){

        System.out.println("This chair is used for work out");
    }

    //constructor
    public Chair(boolean strength){
        durability=strength;
        System.out.println("This is a strongly built chair (true or false) : "+durability);
    }
}
