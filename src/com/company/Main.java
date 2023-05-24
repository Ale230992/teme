package com.company;

import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello");
        System.out.println("Alexandra Abramov");

        int a = 74;
        int b = 36;
        System.out.println(a+b);

        int c = 50;
        int d = 3;
        System.out.println(c/d);

        System.out.println(-5+8*6);
        System.out.println((55+9)%9);
        System.out.println(20+-3*5/8);
        System.out.println(5+15/3*2-8%3);

        int e = 25;
        int f = 5;
        System.out.println(e+"x"+f+"="+e*f);

        int g = 125;
        int h = 24;
        System.out.println(g+"+"+h+"="+(g+h));

        int i = 125;
        int j = 24;
        System.out.println(i+"-"+j+"="+(i-j));

        int k = 125;
        int l = 24;
        System.out.println(k+"x"+l+"="+(k*l));

        int m = 125;
        int n = 24;
        System.out.println(m+"/"+n+"="+(m/n));

        int p = 125;
        int r = 24;
        System.out.println(p+"mod"+r+"="+(p%r));


        int x = 8;
        for (int q=0; q<10; q++){
            System.out.println(x + "x" + (q+1) + "=" + (x*(q+1)));
        }

        System.out.println("    J   a  v     v   a");
        System.out.println("    J  a a  v   v   a a");
        System.out.println(" J  J aaaaa  V V   aaaaa");
        System.out.println("  JJ a     a  V   a     a");

        System.out.println((25.5*3.5-3.5*3.5)/(40.5-4.5));

        System.out.println(4.0*(1-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11)));

        double radius = 7.5;
        double perimeter = 2*Math.PI*radius;
        double area = Math.PI*radius*radius;
        System.out.println("Perimeter is =" + perimeter);
        System.out.println("Area is =" + area);







    }
}
