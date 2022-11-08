//program to deserialize rectangle class

import java.io.*;
public class Rectangle_deser {

    public static void main(String [] args) {
        Rectangle r;
        try {
            FileInputStream fileIn = new FileInputStream("C:\\Users\\Dell\\IdeaProjects\\Exercise_3b\\src\\Rectangle.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            r = (Rectangle) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException j) {
            System.out.println("rectangle class not found");
            j.printStackTrace();
            return;
        }

        System.out.println("Deserialized rectangle Class");
        System.out.println("color of rectangle: " + r.color);
        System.out.println("Size of rectangle: " + r.size);
        System.out.println("Shape code of rectangle: "+r.shape_code);
        System.out.println("length of rectangle: "+r.length);
        System.out.println("breadth of rectangle: "+r.breadth);
    }
}