package day18NestedLoop;

import java.util.Scanner;

public class Additional2numbers {

    public static void main(String[] args) {


        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("ENTER FİRST NUM");
            int num1 = scan.nextInt();
            System.out.println("enter secnd num");
            int num2 = scan.nextInt();

            System.out.println("Addition: " + (num1 + num2));

            System.out.println("Would you like to continue");
            String answer= scan.next().toLowerCase();

            while (!(answer.equals("yes")|| answer.equals("no"))){
                System.err.println("Inlaid Entry, please re enter");
                answer = scan.next().toLowerCase();



            }

            if (answer.equals("no")){
                break;

            }


            scan.close();
        }


    }
}
