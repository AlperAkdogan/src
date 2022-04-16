package day18NestedLoop;


import java.util.Locale;
import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");

        while (true){
            int num = scan.nextInt();

            if (num%2 == 0){
                System.out.println(num+"is even number");
            }else{
                System.out.println(num+ " is odd number");
            }

            System.out.println("Would you like to enter another number?");
            String a = scan.next().toLowerCase(); // No

            while (!(a.equals("yes") || a.equals("no") )){
                System.err.println("invalid answer Would you like to enter another number?");
                a = scan.next().toLowerCase();
            }

            if (a.equals("no")){
                break;
            }
        }




    }
}
