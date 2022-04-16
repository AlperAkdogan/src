package day13_14_String;

import java.util.Scanner;

public class warmup1 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your age");
        int age =scan.nextInt();

        System.out.println("enter your gender");
        String gender = scan.next();

        scan.nextLine();

        System.out.println("Enter your full name");
        String fullname= scan.nextLine();

        System.out.println("enter your phone number");
        long phoneNumber= scan.nextLong();

        System.out.println("enter your zip code");
        int zip= scan.nextInt();

        scan.nextLine();

        System.out.println("enter your school name");
        String school=scan.nextLine();

        System.out.println("city name");
        String city=scan.nextLine();

        System.out.println("state name");
        String state= scan.next();

        System.out.println("building number");
        int bNum= scan.nextInt();

        scan.nextLine();

        System.out.println("enter your street name");
        String street= scan.nextLine();

        scan.close();






    }
}
/*
1. Create a class called MyInfo. Write a program that can ask the user to:
			1. Enter your age (int)
			2. Enter your gender (String- One word ONLY)
			3. Enter your full name (String- Multiple words)
			4. Enter your phone number (long)
			5. Enter your zip code (int)
			6. Enter your School name (String- Can be Multiple words)
			7. Enter your city name (String- Can be Multiple words)
			8. Enter your state name (String- One word ONLY)
			9. Enter your building number (int)
			10. Enter your Street name

		MAKE SURE USER CAN ENTER ALL THE INPUT

 */