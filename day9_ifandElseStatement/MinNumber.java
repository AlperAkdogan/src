package day9_ifandElseStatement;
/*
Warmup tasks:
	1. Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				100 is the minimum number


			n1 & n2

			possibility #1: n1 is Min
			possibility #2: n2 is Min
			possibility #3: equal
 */
public class MinNumber {

    public static void main(String[] args) {

        int n1 =100;
        int n2 = 200;

        boolean N1minNumber = n1 <n2;
        boolean N2minNumber = n2 < n1;
        boolean equal = n1 == n2;

        if (n1<n2){
            System.out.println(n1 +" is the min number");
        }
        if (n2<n1){
            System.out.println(n2+ " is the min number");
        }





    }
}
