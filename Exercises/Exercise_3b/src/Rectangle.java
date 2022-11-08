//this is the derived class
public class Rectangle extends Shape implements java.io.Serializable{

    public String color;
    public String size;
    //transient variable returns 0 after deserialization
    public transient int shape_code;

    public void end(){
        System.out.println("end of rectangle details");
    }
    public void show(){
        System.out.println("*** Rectangle ***\n");
    }
    public void calculateArea(int length,int breadth) {
        area = length * breadth;
        //invoking method of super class
        super.shape_details();
        System.out.println("Area of rectangle is : " + area);
    }

    public void calculatePerimeter(int length, int breadth){
        perimeter = 2 * (length * breadth);
        System.out.println("Perimeter of rectangle is : "+perimeter);
    }

    public static void main(String[] args) {

        //Instantiating the derived class
        Rectangle shape = new Rectangle();
        //Instantiating the base class from derived class
        Shape shape_0 = new Rectangle();
        //invoking polymorphic method of base class
        shape_0.calculateArea();
        shape_0.calculatePerimeter();

        System.out.println("Given shape is Rectangle : \n");
        //invoking methods of derived class
        shape.calculateArea(shape.length, shape.breadth);
        shape.calculatePerimeter(shape.length, shape.breadth);

        shape.end();
        shape.end_shape();

    }
}