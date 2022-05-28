package com.test.first;

public class permutation {

    public static void permute(String s, String newString){

        if(s.length()==0){
            System.out.println(newString);
            return;
        }

        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            String ros = s.substring(0,i) + s.substring(i+1);
            permute(ros, newString+c);

        }
    }
    public static void main(String[] args) {
        String s = "abc";
        permute(s,"");
    }
}
