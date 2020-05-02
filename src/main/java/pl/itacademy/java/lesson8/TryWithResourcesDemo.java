package pl.itacademy.java.lesson8;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourcesDemo {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            fileInputStream = new FileInputStream("/tmp/test.txt");
            bufferedInputStream = new BufferedInputStream(fileInputStream);
//            byte[] bytes = bufferedInputStream.readAllBytes();
//            for (byte aByte : bytes) {
//                System.out.print((char) aByte);
//            }
            int value = bufferedInputStream.read();
            while (value != -1) {
                System.out.print((char) value);
                value = bufferedInputStream.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("FNFException");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException");
            System.out.println(e.getMessage());
        } finally {
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        try (FileInputStream fis = new FileInputStream("/tmp/test.txt");
             BufferedInputStream bis = new BufferedInputStream(fis)) {
            int value = bis.read();
            while (value != -1) {
                System.out.print((char) value);
                value = bis.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
    }
}
