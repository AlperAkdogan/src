package day7_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        // assignment: =

        int number = 100;

        System.out.println("number = " + number); // 100

        number = 200;

        System.out.println("number = " + number); // 200


        String word ="Java Programming"; // Java Programming

        System.out.println("word = " + word);

        word = "wooden spoon"; // wooden spoon

        System.out.println("word = " + word);

        System.out.println("-----------------------------");

        //addition assignment

        int x =100;

        System.out.println("x = " + x);

        //x = x + 200;

        x += 200; // addition assignment shorthand

        System.out.println("x = " + x);

        String word1 ="wooden";

        word1 +=" spoon";

        System.out.println("word1 = " + word1);

        double num1 = 2.5;

        System.out.println("num1 = " + num1);

        num1 += 5.5;

        System.out.println("num1 = " + num1);

        System.out.println("----------------------------------");

        int num2 = 200;
        System.out.println(num2);

        num2 -= 150;

        System.out.println("num2 = " + num2);

        num2 -=30;

        System.out.println("num2 = " + num2);

        System.out.println("----------------");

        double  salary = 50000;

        System.out.println("salary = " + salary);


        salary *=2;

        System.out.println("salary = " + salary);

        double doge = 0.000001;

        System.out.println("doge = " + doge);


        doge *=  1000000;

        System.out.println("doge = " + doge);

        System.out.println("------------------");


        double num3 = 250000.0;
        System.out.println("num3 = " + num3);

        num3 /=2;

        System.out.println("num3 = " + num3);

        System.out.println("--------------------------------------");

        double num4 =100;
        System.out.println("num4 = " + num4);

        num4 %=3;

        System.out.println("num4 = " + num4);

        System.out.println("-----------------------------------------------------");

        int amount = 127; // cents

        int quarters =amount / 25;
        int cents =amount %25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("-------------------");

        int cents2 =127;

        cents2  %= 25;

        System.out.println("cents2 = " + cents2);

        System.out.println("-----------------");

        int y= 300;

        y %=16;
        System.out.println("y = " + y);





























    }
}
