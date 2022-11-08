//this is the derived class
public class Triangle extends Shape implements java.io.Serializable {

    public String color;
    public String size;
    //transient variable returns 0 after deserialization
    public transient int shape_code;
    public void end(){
        System.out.println("end of triangle details");
    }
    public void show(){
        System.out.println("*** Triangle ***\n");
    }

    public void calculateArea(int length,int breadth, int height) {
        area = length * breadth * height;
        //invoking method of super class
        super.shape_details();
        System.out.println("Area of triangle is : " + area);
    }

    public void calculatePerimeter(int length, int breadth, int height){
        perimeter = length + breadth + height;
        System.out.println("Perimeter of triangle is : "+perimeter);
    }

    public static void main(String[] args) {

        //Instantiating the derived class
        Triangle shape = new Triangle();
        //Instantiating the base class from derived class
        Shape shape_0 = new Triangle();
        //invoking polymorphic method of base class
        shape_0.calculateArea();
        shape_0.calculatePerimeter();
        System.out.println("Given shape is Triangle: \n");
        //invoking methods of derived class
        shape.calculateArea(shape.length, shape.breadth, shape.height);
        shape.calculatePerimeter(shape.length, shape.breadth, shape.height);

        shape.end();
        shape.end_shape();

    }
}