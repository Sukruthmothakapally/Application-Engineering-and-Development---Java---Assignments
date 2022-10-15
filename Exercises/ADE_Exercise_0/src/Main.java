public class Main {
    public static void main(String[] args) {

        //Laptop class objects instantiation
        Laptop snum=new Laptop(123.123);
        Laptop snum2=new Laptop(154.768);
        Laptop snum3=new Laptop(888.434);

        //nested class objects instantiation
        Laptop.Hitechlaptop snum4=snum.new Hitechlaptop();
        Laptop.Hitechlaptop snum5=snum2.new Hitechlaptop();
        Laptop.Hitechlaptop.Lowtechlaptop snum6=snum3.new Hitechlaptop().new Lowtechlaptop();

        //calling methods

        snum4.gaming();
        snum5.coding();
        snum6.general();

        System.out.println();

        //Table class objects instantiation
        Table table_type=new Table("teakwood");
        Table table_type2=new Table("forestwood");
        Table table_type3=new Table("pinewood");
        //calling methods
        table_type.desk();
        table_type2.diningtable();
        table_type3.islandtable();

        System.out.println();

        //Building class objects instantiation
        Building tower_name=new Building("4 N Sanjose");
        Building tower_name2=new Building("E S Sanjose");
        Building tower_name3=new Building("trump tower");
        //calling methods
        tower_name.residential_building();
        tower_name2.commercial_building();
        tower_name3.skyscrapper();

        System.out.println();

        //Door class objects instantiation
        Door material=new Door("Cider");
        Door material2=new Door("hard wood");
        Door material3=new Door("glass");
        //calling methods
        material.housedoor();
        material2.roomdoor();
        material3.bathroomdoor();

        System.out.println();

        //Courses class objects instantiation
        Courses name=new Courses("Application Development");
        Courses name2=new Courses("coop");
        Courses name3=new Courses("Data Science");
        //calling methods
        name.info5100();
        name2.info6100();
        name3.info6105();

        System.out.println();

        //Students class objects instantiation
        Students final_gpa=new Students(2);
        Students final_gpa2=new Students(3);
        Students final_gpa3=new Students(4);
        //calling methods
        final_gpa.Prateek();
        final_gpa2.Kevin();
        final_gpa3.Sukruth();

        System.out.println();

        //Speaker class objects instantiation
        Speaker numofspeakers=new Speaker(10);
        Speaker numofspeakers2=new Speaker(20);
        Speaker numofspeakers3=new Speaker(30);
        //calling methods
        numofspeakers.Car_speakers();
        numofspeakers2.TV_speakers();
        numofspeakers3.portable_speakers();

        System.out.println();

        //Food class objects instantiation
        Food foodbenefits=new Food("proteins");
        Food foodbenefits2=new Food("vitamins");
        Food foodbenefits3=new Food("minerals");
        //calling methods
        foodbenefits.indian();
        foodbenefits2.Italian();
        foodbenefits3.Mexican();

        System.out.println();

        //Kitchen class objects instantiation
        Kitchen area_sqft=new Kitchen(50);
        Kitchen area_sqft2=new Kitchen(70);
        Kitchen area_sqft3=new Kitchen(90);
        //calling methods
        area_sqft.residential_kitchen();
        area_sqft2.hotel_kitchen();
        area_sqft3.industrial_kitchen();

        System.out.println();

        //Chair class objects instantiation
        Chair chair_strength=new Chair(false);
        Chair chair_strength2=new Chair(false);
        Chair chair_strength3=new Chair(true);
        //calling methods
        chair_strength.bench();
        chair_strength2.sitting_chair();
        chair_strength3.workout_chair();

    }
}
