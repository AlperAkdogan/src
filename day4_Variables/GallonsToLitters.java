package day4_Variables;

public class GallonsToLitters {

    public static void main(String[] args) {

        /*
        5. Create a class named GallonsToLitters, Write a program that can convert gallon (int) to litter (double)
					Hints: 1 gallon = 3.79 litters
							1000
							10000
         */

        int gallon =1000;
        double litter=gallon * 3.79 ;

        System.out.println("litter = " + litter +"L");

        int ivar = 100;
        double dvar = 123;
        float fvar = 200;

        fvar = (float) dvar;

        System.out.println(ivar);
    }
}
