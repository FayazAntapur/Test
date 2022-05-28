package interview_question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Count_L_w_c {

    public static void main(String[] args) throws IOException {
        int lines =0;
        int words = 0;
        int chars = 0;
        BufferedReader bf = new BufferedReader(new FileReader("E:\\New_Java\\src\\interview_question\\test"));
        String s = bf.readLine();
        while (s !=null){
            String[] s1 = s.split(" ");
            for (String s3:s1){
                chars = chars+s3.length();
            }
            lines++;
            words = words+s1.length;
            s = bf.readLine();
        }
        System.out.println(lines + " "+ words+" "+chars);
    }
}
