//program to serialize square class

import java.io.*;
public class Square_ser {

    public static void main(String [] args) {
        Square s = new Square();
        s.color = "orange";
        s.size = "26 feet";
        s.shape_code = 15;
        s.length = 25;
        s.breadth = 20;

        try {
            FileOutputStream fileOut =
                    new FileOutputStream("C:\\Users\\Dell\\IdeaProjects\\Exercise_3b\\src\\Square.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(s);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in C:\\Users\\Dell\\IdeaProjects\\Exercise_3b\\src\\Square.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}