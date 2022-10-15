public class Building {

    //properties
    String buildingname;
    String buildingtype;
    int floors;
    int capacity;
    int year;
    float strength;
    boolean firesafety;
    boolean earthquakeproof;

    //methods
    void residential_building(){

        System.out.println("This is a residential building");
    }
    void commercial_building(){

        System.out.println("This is a commercial building");
    }
    void skyscrapper(){

        System.out.println("This is a skyscrapper");
    }

    //constructor
    public Building(String name){
        buildingname=name;
        System.out.println("The building name is "+buildingname);
    }
}
