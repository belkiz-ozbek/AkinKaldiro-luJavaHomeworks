package wideningconversiondemo;

public class WideningConversionDemo {

    public static void main(String[] args) {

        byte b = 126;
        short s = 1000;
        char c = 65;
        int i = 2147483647;
        long l;
        float f = 3.14f;
        double d;
        /* compile error: possible loss of precision
        c = b;
        c = s;
        i = d;*/
        s = b;
        l = i;
        //loss of precision
        f = i;
        System.out.println(f);

        l = i + 1;
        //loss of precision
        f = l;
        System.out.println(f);

    }

}
