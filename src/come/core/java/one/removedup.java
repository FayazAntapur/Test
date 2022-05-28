package come.core.java.one;

import java.util.*;
import java.util.stream.Collectors;

public class removedup {

    public static void main(String[] args) {

        ArrayList<Integer> al =  new ArrayList<>(Arrays.asList(3,5,97,4,4,78,4,4,4,422,3,4,6,6767,90));

        LinkedHashSet<Integer> hs = new LinkedHashSet<>(al);
        //System.out.println(hs);
        ArrayList<Integer> als = new ArrayList<>(hs);
        System.out.println(als);

        //stream
        ArrayList<Integer> marks =  new ArrayList<>(Arrays.asList(3,5,97,4,4,78,4,4,4,422,3,4,6,6767,90));
        List<Integer> mu = marks.stream().distinct().toList();
        System.out.println(mu);
        mu.stream().forEach(ele -> System.out.println(ele));

    }
}
