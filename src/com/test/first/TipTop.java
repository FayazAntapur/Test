package com.test.first;

public class TipTop {

    static final Integer i1 = 1;
    final Integer i2 = 2;
    Integer i3 = 3;

    public static void main(String[] args) {
        double d = 10.0/-0;
        if(d==Double.POSITIVE_INFINITY)
            System.out.println("po");
        else
            System.out.println("nev");

    }
}
