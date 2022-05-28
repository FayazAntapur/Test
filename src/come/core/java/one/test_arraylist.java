package come.core.java.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class test_arraylist {

    public static void main(String[] args) {

        //int a[] =new int[4];

        ArrayList<Object> ar = new ArrayList<>();
        ar.add(34);
        ar.add("sfdf");
        ar.add(34.54);
        ar.add(34);
        System.out.println(ar);

        //System.out.println(ar.get(3)); //IndexOutOfBoundsException
        System.out.println(ar.get(2));
        System.out.println(ar.size());

        //change initial virtual capacity
        ArrayList ar1 =  new ArrayList<>(23);
        ArrayList<Integer> ari = new ArrayList<>();

        //ari.add("453");

        /*for(Object a: ar){
            System.out.println(a);
        }*/

        Iterator<Object> a1 = ar.iterator();

        while (a1.hasNext()){
            System.out.println(a1.next());
        }

        System.out.println("using stream");
        ar.forEach(System.out::println);

        System.out.println("using new texh");
        ar.forEach(System.out::println);

        System.out.println(ar);

        int ab[] = {4,456,67,89};

        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(34,56));

        CopyOnWriteArrayList<Integer> cal =  new CopyOnWriteArrayList<>();
        cal.add(234);
        System.out.println(cal);


    }
}
