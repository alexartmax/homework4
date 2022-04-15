package com.company;

public class Task2 {

    public static void main(String[] args) {

        //The overload resolution:Type or Class
        //byte-short-int-long

        byte a = 4;
        short b = a;
        int c = 400_000_345;
        long d = c;

        //int-double

        int ab = 43934;
        double ac = ab;

        //short-float-double

        short ad = 543;
        float da = ad;
        float t = 348;
        double rt = t; //if double and float thus double

        //char-int

        char dv = 'F';
        int vd = dv;


        System.out.println(a + "\t" + b + "\t" + c + "\t" + ab + "\t" + ac + "\t" + "rt" + "\n" + "dv" + "\n" + "vd");

    }
}
