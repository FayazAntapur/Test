package interview_question;

import java.util.Random;

public class GenerateRamdomNumbers {

    public static void main(String[] args) {

        Random ran = new Random();
        System.out.println(ran.nextInt());
        System.out.println(ran.nextInt(9)+ ""+ran.nextInt(9)+""+ran.nextInt(9)+""+ran.nextInt(9));

    }


}
