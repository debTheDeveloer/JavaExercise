package Serilalization;

import java.io.*;

public class Serilalization_1 implements Serializable {

    int i =10;
    int j = 20;

    public static void main(String args[]) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Serilalization_1 sl = new Serilalization_1();
        oos.writeObject(sl);

        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Serilalization_1 sl1 = (Serilalization_1) ois.readObject();
        System.out.println(sl1.i);
    }
}
