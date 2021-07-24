package vn.plusplus.example.ReadFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {
    public static void main(String[] args) {
        FileReader fin = null;
        BufferedReader bin = null;
        try{
            fin = new FileReader("C:\\Users\\Administrator\\Desktop\\diemkhang\\javacorebuoi10\\data\\student.txt");
            bin = new BufferedReader(fin,10);
            String line = " ";
            while ((line=bin.readLine())!=null){
                System.out.println(line);
            }
            fin.close();
            bin.close();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                fin.close();
                bin.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
