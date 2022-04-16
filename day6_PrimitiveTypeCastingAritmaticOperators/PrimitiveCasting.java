package day6_PrimitiveTypeCastingAritmaticOperators;

public class PrimitiveCasting {

    public static void main(String[] args) {


        byte a = 100;
        short b = a;
        //short b = (short)a;

        //smaller primitives can be directly assigned to larger primitive type
        // largers CANNOT

        int x = 55;
        short y = (short)x; // explicit casting

        System.out.println(x + " : " + y);

        long j = 1000000;
        short k = (short)j;

        System.out.println(j + ":" + k);

        double l = 2.5;
        float m = (float)l;

        System.out.println(l + " : " + m);

        double n = 10.9;
        int s =(int)n;

        System.out.println(n+ " : "+ s);

        double d1 = 20.5;
        short s1 = (short) d1;

        System.out.println(d1+ " : " + s1);
        System.out.println("a = " + (1+2));




    }
}
