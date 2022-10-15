public class Kitchen {

    //properties
    String style;
    String purpose;
    int utenzilsquantity;
    int drawersquantity;
    String features;
    float area;
    boolean island;
    boolean luxurious;

    //methods
    void residential_kitchen() {

        System.out.println("This is a normal household kitchen");
    }
    void hotel_kitchen() {

        System.out.println("He is a kitchen in a hotel");
    }
    void industrial_kitchen() {

        System.out.println("He is an industry standard kitchen");
    }

    //constructor
    public Kitchen(float size) {
        area=size;
        System.out.println("This kitchen has "+area+ " square feet area");
    }
}
