//this is the derived class
public class Circle extends Shape {

    public void end(){
        System.out.println("end of circle details");
    }
    public void show(){
        System.out.println("*** Circle ***\n");
    }
    public void calculateArea(int radius , double pi) {
        area = pi * Math.pow(radius,2);
        //invoking method of super class
        super.shape_details();
        System.out.println("Area of circle is : " + area);
    }

    public void calculatePerimeter(int radius , double pi){
        perimeter = Math.floor(2 * pi * radius);
        System.out.println("Perimeter of circle is : "+perimeter);
    }

    public static void main(String[] args) {

        //Instantiating the derived class
        Circle shape = new Circle();
        //Instantiating the base class from derived class
        Shape shape_0 = new Circle();
        //invoking polymorphic method of base class
        shape_0.calculateArea();
        shape_0.calculatePerimeter();

        System.out.println("Given shape is Circle : \n");
        //invoking methods of derived class
        shape.calculateArea(shape.radius , shape.pi);
        shape.calculatePerimeter(shape.radius , shape.pi);

        shape.end();
        shape.end_shape();

    }
}