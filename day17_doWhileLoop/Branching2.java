package day17_doWhileLoop;

public class Branching2 {

    public static void main(String[] args) {

        for (char i = 'A'; i <='E'; i++) {
            if(i == 'C'){
                continue;  // continue // break stops
            }
            System.out.println(i);

        }


        System.out.println("------------------------------------------------------");

        for (int i = 1; i <=10; i++) {     // print only even nums beetween 1-10
            if(i%2 != 0){ // if its odd
                continue; // skip the odd numbers
            }
            System.out.println(i);

        }

        System.out.println("--------------------");

        for (int i = 1; i <=10 ; i++) {
            if (i%2==0){ // if its even
                continue; // skip the even
            }

            System.out.println(i);
        }
    }

}
