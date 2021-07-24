package vn.plusplus.example.ReadFile;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamEx {
    public static void main(String[] args) {
        FileInputStream fin = null;
        BufferedInputStream bin = null;
        try {
            fin = new FileInputStream("C:\\Users\\Administrator\\Desktop\\diemkhang\\javacorebuoi10\\data\\student.txt");
            bin=new BufferedInputStream(fin,10);
            int i=0;
            while ((i=bin.read())!=-1){
                System.out.print((char) i);
            }
            fin.close();
            bin.close();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fin.close();
                bin.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
