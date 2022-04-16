package day17_doWhileLoop;

public class FrequencyOfChar {

    public static void main(String[] args) {

        String str = "AAABBBC";

        char ch = 'A';

        int frequency = 0; //1+1+1

        for (int i = 0; i < str.length() ; i++) { //i: indexes of str
            char eachChar= str.charAt(i); // eachChar each char of str

            // 'A' == 'B'
            if (ch==eachChar) { //if given ch is matching with the eachChar then ch is appeared in the string
                frequency++;
            }

        }

        System.out.println(frequency);
    }
}
/*
1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
 */