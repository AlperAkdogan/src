package day7_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        // >, < , >=, <=

        boolean result1 = 200 > 40; //true

        System.out.println("result1 = " + result1);

        boolean result2= 300 >= 150;  // true  büyük veya eşit

        System.out.println("result2 = " + result2);

        boolean result3= 100 >= 100; // true büyük veya eşit

        System.out.println("result3 = " + result3);

        boolean result4= 300 >=500; //false

        System.out.println("result4 = " + result4);

        // credit score of 720

        int Creditscore = 720;

        boolean eligibleForLoan= Creditscore >= 720;  // if credit score is 720 or greater then its eligible

        System.out.println("-----------------------------------------------------");


        boolean result5 = 100<200; // true

        System.out.println("result5 = " + result5);

        boolean result6 = 200<100; // false

        System.out.println("result6 = " + result6);

        int score3 = 75;

        boolean hasFailed = score3 <= 59;

        System.out.println("hasFailed = " + hasFailed);

        System.out.println("---------------");

        int x =100;
        int y =200;

        boolean result9= x==y;

        System.out.println("result9 = " + result9);

        boolean result11 = 100 != 200; // true

        System.out.println("result11 = " + result11);






















    }
}
