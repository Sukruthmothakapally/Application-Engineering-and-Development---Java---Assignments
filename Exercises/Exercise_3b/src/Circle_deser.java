//program to deserialize Circle class

import java.io.*;
public class Circle_deser {

    public static void main(String [] args) {
        Circle c;
        try {
            FileInputStream fileIn = new FileInputStream("C:\\Users\\Dell\\IdeaProjects\\Exercise_3b\\src\\Circle.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            c = (Circle) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException j) {
            System.out.println("Circle class not found");
            j.printStackTrace();
            return;
        }

        System.out.println("Deserialized Circle Class");
        System.out.println("color of Circle: " + c.color);
        System.out.println("Size of Circle: " + c.size);
        System.out.println("Shape code of Circle: "+c.shape_code);
        System.out.println("radius of Circle: "+c.radius);
    }
}