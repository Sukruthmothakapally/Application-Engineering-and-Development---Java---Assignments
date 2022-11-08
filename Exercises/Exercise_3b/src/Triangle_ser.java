//program to serialize Triangle class

import java.io.*;
public class Triangle_ser {

    public static void main(String [] args) {
        Triangle t = new Triangle();
        t.color = "blue";
        t.size = "12 feet";
        t.shape_code = 25;
        t.length = 22;
        t.breadth = 11;

        try {
            FileOutputStream fileOut =
                    new FileOutputStream("C:\\Users\\Dell\\IdeaProjects\\Exercise_3b\\src\\Triangle.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(t);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in C:\\Users\\Dell\\IdeaProjects\\Exercise_3b\\src\\Triangle.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}