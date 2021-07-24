package vn.plusplus.example.ReadFile;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream =
                    new FileInputStream("C:\\Users\\Administrator\\Desktop\\diemkhang\\javacorebuoi10\\data\\student.txt");
            int i=0;
            while ((i = fileInputStream.read()) !=-1){
                System.out.print((char) i);
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
