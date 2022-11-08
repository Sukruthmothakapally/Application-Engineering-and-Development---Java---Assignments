//program to serialize Circle class

import java.io.*;
public class Circle_ser {

    public static void main(String [] args) {
        Circle c = new Circle();
        c.color = "red";
        c.size = "10 feet";
        c.shape_code = 15;
        c.radius = 12;

        try {
            FileOutputStream fileOut =
                    new FileOutputStream("C:\\Users\\Dell\\IdeaProjects\\Exercise_3b\\src\\Circle.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(c);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in C:\\Users\\Dell\\IdeaProjects\\Exercise_3b\\src\\Circle.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}