//this is the derived class
public class Square extends Shape {

    public void end(){
        System.out.println("end of square details");
    }
    public void show(){
        System.out.println("*** Square ***\n");
    }
    public void calculateArea(int length) {
        area = length * length;
        //invoking method of super class
        super.shape_details();
        System.out.println("Area of square is : " + area);
    }

    public void calculatePerimeter(int length){
        perimeter = length * 4;

        System.out.println("Perimeter of square is : "+perimeter);
    }

    public static void main(String[] args) {

        //Instantiating the derived class
        Square shape = new Square();
        //Instantiating the base class from derived class
        Shape shape_0 = new Square();
        //invoking polymorphic method of base class
        shape_0.calculateArea();
        shape_0.calculatePerimeter();

        System.out.println("Given shape is square : \n");
        //invoking methods of derived class
        shape.calculateArea(shape.length);
        shape.calculatePerimeter(shape.length);

        shape.end();
        shape.end_shape();

    }
}