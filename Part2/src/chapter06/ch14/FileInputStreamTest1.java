package chapter06.ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {

    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("input2.txt");
            System.out.println((char) fis.read());
            System.out.println((char) fis.read());
            System.out.println((char) fis.read());
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        System.out.println("end");
    }
}
