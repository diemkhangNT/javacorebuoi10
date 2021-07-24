package vn.plusplus.example.WriteFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter = new FileWriter("C:\\Users\\Administrator\\Desktop\\diemkhang\\javacorebuoi10\\data\\student.txt",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter,10);
            bufferedWriter.write("6. Nguyen Thi Diem Khang");
            bufferedWriter.newLine();
            bufferedWriter.write("7. Dao Thi Thuy Tien");
            bufferedWriter.newLine();
            bufferedWriter.write("8. Nguyen Vu Phuong Tran");
            bufferedWriter.newLine();
            bufferedWriter.flush();
            bufferedWriter.close();
            System.out.println("Success...");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
