package interview_question;


import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JoinTwoarrys {

    public static void main(String[] args) {

        String bat[] = {
                "Rohit","Virat", "Rishab", "Shreays", "Dhavan"
        };

        String bowl[] = {"Bhumra", "Shami", "Jadeja", "Ashwin", "Iyer"};

        Stream<String > sbat = Arrays.stream(bat);
        Stream<String> sbowl = Arrays.stream(bowl);
        String con[] = Stream.concat(sbat, sbowl).toArray(size -> new String[size]);
        for(String s:con){
            System.out.println(s);
        }

        //String s3 [] = ObjectArrays.concat(bat,bowl, String.class);

        //for(String s8:s3){
        //    System.out.println(s8);
        //}

        Integer i[] = {1,2,3,5,6,7};
        Integer i2[] = {4,5,6,8,9};

        Stream<Integer> i3 = Arrays.stream(i);
        Stream<Integer> i4 = Arrays.stream(i2);

        Integer a[] = Stream.concat(i3,i4).toArray(size -> new Integer[size]);
        for(int i7 :a){
            System.out.println(i7);
        }

    }
}
