package vn.plusplus.example.DemoFileImage;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOExample {
    public static void main(String[] args) throws Exception {
        String image1 = "C:\\Users\\Administrator\\Desktop\\diemkhang\\test reader\\demo_image.jpg";
        String image2 = "C:\\Users\\Administrator\\Desktop\\diemkhang\\test reader\\demo_imagefile\\image4k.jpg";
        FileInputStream fileInputStream = new FileInputStream(image1);
        FileOutputStream fileOutputStream = new FileOutputStream(image2);
        long starttime = System.currentTimeMillis();
        int i=0;
        while ((i=fileInputStream.read())!=-1){
            fileOutputStream.write(i);
        }
        fileInputStream.close();
        fileOutputStream.flush();
        fileOutputStream.close();
        long endtime = System.currentTimeMillis();
        System.out.println("Time = "+(endtime-starttime)+"ms");
    }
}
