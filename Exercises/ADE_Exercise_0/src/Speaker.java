public class Speaker {

    //properties
    String brand;
    char stereo;
    int numberofspeakers;
    String purpose;
    float quality;
    float decibals;
    boolean dolby;
    boolean woofer;

    //methods
    void Car_speakers() {
        System.out.println("This is a car speaker");
    }
    void TV_speakers() {
        System.out.println("He is a TV speaker");
    }
    void portable_speakers() {
        System.out.println("He is portable speaker");
    }

    //constructor
    public Speaker(int quantity) {
        numberofspeakers = quantity;
        System.out.println("There are " + numberofspeakers + " speakers in the class");
    }
}
