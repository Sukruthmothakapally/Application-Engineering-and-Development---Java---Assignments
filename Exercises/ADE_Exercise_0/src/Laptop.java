public class Laptop {
    //properties
    String brand;
    String model;
    int year;
    int dimensions;
    int weight;
    float batterylife;
    Boolean touchscreen;
    Boolean fingerprint;
    double snum;

    //nested class - 1
    class Hitechlaptop {

        //methods
        void gaming() {

            System.out.println("This laptop is used for gaming");
        }

        void coding() {

            System.out.println("This laptop is used for coding and building software");
        }

        //nested class - 2
        class Lowtechlaptop {

            void general() {

                System.out.println("This laptop is used for general everyday purposes");
            }
        }
    }
    //constructor
    public Laptop(double serialnum){
        snum=serialnum;
        System.out.println("Serial number of the laptop is : "+serialnum);
    }
}
