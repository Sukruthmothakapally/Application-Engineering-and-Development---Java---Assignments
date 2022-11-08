//program to deserialize rectangle class

import java.io.*;
public class Square_deser {

    public static void main(String [] args) {
        Square s;
        try {
            FileInputStream fileIn = new FileInputStream("C:\\Users\\Dell\\IdeaProjects\\Exercise_3b\\src\\Square.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            s = (Square) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException j) {
            System.out.println("Square class not found");
            j.printStackTrace();
            return;
        }

        System.out.println("Deserialized Square Class");
        System.out.println("color of Square: " + s.color);
        System.out.println("Size of Square: " + s.size);
        System.out.println("Shape code of Square: "+s.shape_code);
        System.out.println("length of Square: "+s.length);
        System.out.println("breadth of Square: "+s.breadth);
    }
}