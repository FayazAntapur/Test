package com.test.first;

public class rev_srt_space {

    public static void main(String[] args) {

        String s = "abc de";
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            if(!String.valueOf(s.charAt(i)).isBlank()) {
                rev += s.charAt(i);
            }
        }
        System.out.println(rev);
        String sarr[] = s.split(" ");
        int len = sarr[0].length();
        String  newstr = rev.substring(0,len) + " "+ rev.substring(len);
        System.out.println(newstr);
    }
}
