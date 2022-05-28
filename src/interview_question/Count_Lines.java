package interview_question;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Count_Lines {

    public static void main(String[] args) throws IOException {

        Map<String ,Integer> hm = new HashMap<String ,Integer>();
        BufferedReader br = new BufferedReader(new FileReader("E:\\New_Java\\src\\interview_question\\test"));
        String currentLine = br.readLine();
        while (currentLine!=null){
            String[] s1 = currentLine.toLowerCase().split(" ");

            for(String s:s1){
                if(!String.valueOf(s).isBlank()) {
                    if (hm.containsKey(s)) {
                        hm.put(s, hm.get(s) + 1);
                    } else {
                        hm.put(s, 1);
                    }
                }
            }
            currentLine = br.readLine();
        }
        System.out.println(hm);

        hm.forEach((k,v) -> System.out.println(k +":"+v));

        Map<String ,Integer> maxMap= new HashMap<String ,Integer>();

        hm.entrySet().stream().filter(e ->e.getValue()== Collections.max(hm.values()))
                .forEach(e -> maxMap.put(e.getKey(), e.getValue()));
        System.out.println("********************");
        System.out.println(maxMap);
        System.out.println("*********************");

        hm.entrySet().stream().filter(e -> e.getValue()==Collections.max(hm.values()))
                .forEach(e->maxMap.put(e.getKey(),e.getValue()));
        System.out.println(maxMap);
    }

}
