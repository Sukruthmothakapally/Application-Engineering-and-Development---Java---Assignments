public class Door {

    //properties
    String doormaterial;
    String doorname;
    int height;
    int width;
    int year;
    float purpose;
    boolean firesafety;
    boolean lockandkey;

    //methods
    void housedoor(){

        System.out.println("This is the house main door");
    }
    void roomdoor(){

        System.out.println("This is a room door");
    }
    void bathroomdoor(){

        System.out.println("This is a bathroom door");
    }

    //constructor
    public Door(String door_material){
        doormaterial=door_material;
        System.out.println(doormaterial+" is used to make the door");
    }
}
