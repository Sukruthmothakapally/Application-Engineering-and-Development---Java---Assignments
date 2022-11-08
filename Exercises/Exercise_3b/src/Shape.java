import org.w3c.dom.ls.LSOutput;

//this is the base class (inheritance)
//abstraction
public abstract class Shape {
    // Abstract method (does not have a body)
    public abstract void end();

    //regular method
    public void end_shape() {
        System.out.println("end of shape details");
    }

    double area;
    double perimeter;
    int length = 10;
    int breadth = 20;
    int height = 30;
    int radius = 10;
    double pi = 3.14;

    //static field
    static int number_of_shapes = 4;

    public void shape_details() {
        System.out.println("Shape details are : \n");
    }

    //overriding method
    public void show() {
        System.out.println("The Shape is : ");
    }

    //polymorphism methods
    public void calculateArea() {
        System.out.println("The area formula is product of its sides");
    }

    public void calculatePerimeter() {
        System.out.println("The perimeter formula is sum of its sides\n");
    }

}

