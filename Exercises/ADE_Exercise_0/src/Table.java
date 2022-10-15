public class Table {

    //properties
    String type;
    String quality;
    int making_year;
    int capacity;
    int size;
    float durability;
    int legs;
    double strength;

    //methods
    void desk(){
        System.out.println("This table is used as a desk");
    }
    void diningtable(){
        System.out.println("This is a dining table");
    }
    void islandtable(){
        System.out.println("This is an island table");
    }

    //constructor
    public Table(String tabletype){
        type=tabletype;
        System.out.println("This is a "+type+" table");
    }
}