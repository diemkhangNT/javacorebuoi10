package vn.plusplus.example.DemoFileImage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BuferedIOExample {
    public static void main(String[] args) throws Exception {
        String image1 = "C:\\Users\\Administrator\\Desktop\\diemkhang\\test reader\\demo_image.jpg";
        String image2 = "C:\\Users\\Administrator\\Desktop\\diemkhang\\test reader\\demo_imagefile\\image4k.jpg";
        FileInputStream fileInputStream = new FileInputStream(image1);
        BufferedInputStream bufIn = new BufferedInputStream(fileInputStream,100);
        FileOutputStream fileOutputStream = new FileOutputStream(image2);
        BufferedOutputStream bufOut = new BufferedOutputStream(fileOutputStream,100);
        long starttime = System.currentTimeMillis();
        int i=0;
        while ((i=bufIn.read())!=-1){
            bufOut.write(i);
        }
        bufIn.close();
        bufOut.flush();
        bufOut.close();
        fileInputStream.close();
        fileOutputStream.close();
        long endtime = System.currentTimeMillis();
        System.out.println("Time = "+(endtime-starttime)+"ms");
    }
}
