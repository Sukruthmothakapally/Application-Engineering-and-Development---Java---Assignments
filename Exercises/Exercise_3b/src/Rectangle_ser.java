//program to serialize rectangle class

import java.io.*;
public class Rectangle_ser {

    public static void main(String [] args) {
        Rectangle r = new Rectangle();
        r.color = "green";
        r.size = "20 feet";
        r.shape_code = 15;
        r.length = 18;
        r.breadth = 22;

        try {
            FileOutputStream fileOut =
                    new FileOutputStream("C:\\Users\\Dell\\IdeaProjects\\Exercise_3b\\src\\Rectangle.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(r);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in C:\\Users\\Dell\\IdeaProjects\\Exercise_3b\\src\\Rectangle.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}