package day7_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = 25;
        int num2 = -25;

        System.out.println(num1 < 0); //false
        System.out.println(num2 < 0 ); // true

        System.out.println("---------------------");

        int a = 5;
        ++a; // pre increment: increases the value by 1 right away

        System.out.println(a);

        --a;   //pre decrement: decreases the value by 1 right away

        System.out.println(a);

        System.out.println("---------------------");

        int b = 100;

        System.out.println(b++); //100 post increment not right away but at the second step
        System.out.println(b);//101 second step

        int z = 47;

        System.out.println(++z); // 48
        System.out.println(z++); //48 z = 49
        System.out.println(z); // 49

        int x = 50;

        System.out.println(--x);
        System.out.println(x--);
        System.out.println(x);

















    }
}
