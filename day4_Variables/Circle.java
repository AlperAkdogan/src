package day4_Variables;

public class Circle {

    public static void main(String[] args) {

        /*
        3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
			PI, radius, diameter, area, perimeter

					Hints: 	PI = 3.14
							area = radius * radius * PI
							Perimeter = 2 * radius * PI

         */

        double  PI =3.14;
        int radius = 9;

        double area = radius * radius * PI;
        double perimeter= 2 * radius * PI;

        System.out.println("PI = " + PI);
        System.out.println("radius = " + radius);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        int a = 3, b =2;
        long c = (a+b)* 2/ 3%2;

        System.out.println(c);

        System.out.println((int)10.0/3);

    }
}
