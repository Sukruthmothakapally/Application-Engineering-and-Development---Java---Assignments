public class Food {

    //properties
    String dishname;
    String ingrediants;
    int cookingtime;
    String benefits;
    float price;
    float quantity;
    boolean junkfood;
    boolean highcalories;

    //methods
    void indian() {

        System.out.println("This is an Indian dish");
    }
    void Italian() {

        System.out.println("He is an Italian dish");
    }
    void Mexican() {

        System.out.println("He is a mexican dish");
    }

    //constructor
    public Food(String food_benefits) {
        benefits=food_benefits;
        System.out.println("This food is good for "+benefits);
    }
}
