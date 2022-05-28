package com.test.first;

public class String_permute {

    public static void main(String[] args) {

        String  s = "abc";
        permute(s, "");
    }
    public static void permute(String s, String ssf){

        if(s.length() ==0){
            System.out.println(ssf);
        }

        for (int i=0;i <s.length();i++){
            char c = s.charAt(i);

            String left_str = s.substring(0,i);
            String right_str = s.substring(i+1);
            String rest_of_string = left_str + right_str;
            permute(rest_of_string, ssf+c);
        }
    }
}
