public class Overriding_shapes {
    public static void main(String[] args) {

        Shape override = new Triangle();   // Base class reference but Triangle class object
        override.show();   // runs the method in triangle class

        Shape override_2 = new Rectangle();   // Base class reference but Rectangle class object
        override_2.show();   // runs the method in rectangle class

        Shape override_3 = new Square();   // Base class reference but Square class object
        override_3.show();   // runs the method in square class

        Shape override_4 = new Circle();   // Base class reference but Circle class object
        override_4.show();   // runs the method in circle class
            }
        }


