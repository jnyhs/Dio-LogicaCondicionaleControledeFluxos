package OperadoresRelacionais;

public class main {
    public static void main(String [] args) {

        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        char c1 = 'x';
        char c2 = 'y';
        String s1 ="Fulano";
        String s2 = "Fulano";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 15971L;
        long l2 = 8597L;
        byte y1 = 1;
        short y2 = 25;

        System.out.println("i1 == i2 " + (i1 == i2));
        System.out.println("i1 != i2 " + (i1 != i2));
        System.out.println("i1 > i2 " + (i1 > i2));
        System.out.println("i1 <= i2 " + (i1 <= i2));

        System.out.println("i1 > f1 " + (i1 > f1));

        System.out.println("f1 == f2 " + (f1 == f2));
        System.out.println("f1 != f2 " + (f1 != f2));
        System.out.println("f1 >= f2 " + (f1 >= f2));
        System.out.println("f1 < f2 " + (f1 < f2));

        System.out.println("c1 == c2 " + (c1 == c2));
        System.out.println("c1 != c2 "  + (c1 != c2));
        System.out.println("c1 > c2 " + (c1 > c2));

        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 != s2 " + (s1 != s2));
       // System.out.println("s1 >= s2" + (s1 >= s2));
        // System.out.println("ss1 < s2" + (s1 < s2));

        System.out.println("b1 == b2" + (b1 == b2));
        System.out.println("b1 != b2" + (b1 != b2));
       // System.out.println("b1 > b2" + (b1 > b2));
       // System.out.println("b1 <= i1" + (b1 <= i1));

       // System.out.println("s2 != c1" + (s2 != c1);

    }
}
