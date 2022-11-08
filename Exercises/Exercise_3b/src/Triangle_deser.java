//program to deserialize triangle class

import java.io.*;
public class Triangle_deser {

    public static void main(String [] args) {
        Triangle t;
        try {
            FileInputStream fileIn = new FileInputStream("C:\\Users\\Dell\\IdeaProjects\\Exercise_3b\\src\\Triangle.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            t = (Triangle) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException j) {
            System.out.println("Triangle class not found");
            j.printStackTrace();
            return;
        }

        System.out.println("Deserialized Triangle Class");
        System.out.println("color of Triangle: " + t.color);
        System.out.println("Size of Triangle: " + t.size);
        System.out.println("Shape code of Triangle: "+t.shape_code);
        System.out.println("length of Triangle: "+t.length);
        System.out.println("breadth code of Triangle: "+t.breadth);
    }
}