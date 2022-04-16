package day15ForLoop;

import java.util.Scanner;

public class warmup2 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter a word");
        String str = scan.nextLine();

        String result= str.replace("x","a").replace("X","a");

        System.out.println(result);

        scan.close();


    }
}
/*
2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */