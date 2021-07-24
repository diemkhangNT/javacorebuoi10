package vn.plusplus.example.WriteFile;

import javax.imageio.IIOException;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {
    public static void main(String[] args) {
        try{
            FileOutputStream fin = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\diemkhang\\javacorebuoi10\\data\\student.txt",true);
            BufferedOutputStream bin = new BufferedOutputStream(fin,10);
            String data = "Hey, How are you?" +
                    "\nI'm a student," +
                    "\nMy name is Khang.";
            bin.write(data.getBytes());
            bin.flush();
            bin.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
