package vn.plusplus.example.WriteFile;

import jdk.nashorn.internal.ir.WhileNode;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\diemkhang\\javacorebuoi10\\data\\student.txt",true);
            String data = "Test javacore";
            fileOutputStream.write(data.getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
