package day9_ifandElseStatement;

public class medianNumber {
    public static void main(String[] args) {


        short a = 10,
                b =15,
                c =20;

        boolean aIsMedian = b < a && a > c  || (c < a  && a > b);
        boolean bIsMedian = a < b && b > c || c< b && b >a;
        boolean cIsMedian = a < c && c > b || b < c && c > a;

        if (aIsMedian){
            System.out.println(a+ " is median");
        }
        if (bIsMedian){
            System.out.println(b+ " is median");
        }
        if (cIsMedian){
            System.out.println(c+ " is median");
        }





    }
}
//2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers
//
//			Ex:
//				a = 10, b= 15, c = 20;
//
//			Output:
//				15 is the median number
//
//
//			Posibility #1: a could be median number
//			Posibility #2: b could be median number
//			Posibility #3: c could be median number