package day15ForLoop;

import java.util.Scanner;

public class warmup {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter a word");
        String word=scan.nextLine();

        if (word.charAt(0)=='x'){
            word=word.replaceFirst("x","a");
        }
        System.out.println(word);
        scan.close();


    }
}
/*
1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */