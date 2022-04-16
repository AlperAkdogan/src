package day24_CustomMethod_Return;

import java.util.Locale;

public class BreakfastTask {

    public static void main(String[] args) {

        initials("Alper", "akdogan");

        System.out.println("------------------------------------");

        domain("Cydeo.School@gmail.com");

        System.out.println("------------------------------------------");

        String[] emails = { "josh@gmail.com","jim@yahoo.com","elminur@cydeo.com","gulsen@gmail.com"};

        //domain(emails[0]); // we can get only josh's domain
        for (String email:emails){
            domain(email);

            nameOfMonth(7);


        }


        //1. Create a method that can display the initials of the person(String firstName, String LastName)

    }
    public static void initials(String firstName, String lastname){
        String initial = firstName.charAt(0)+"."+lastname.charAt(0);
        initial = initial.toUpperCase(Locale.ROOT);
        System.out.println("initial = " + initial);

    }

    //2. Create a method that can display the domain of the email. domain(String)

    public static void domain(String email){ // Cydeo@gmail.com

        String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }

//3. Create a method that can display the name of the month based on
//the given number to the method

    public static void nameOfMonth(int number){

        String name = "";

        if (number >= 1 && number <= 12){

            name = (number==1)? "jan" :(number==2)? "feb" :(number==3)? "mar" :(number==4)? "apr" :(number==5)? "may"
                    :(number==6)? "jun" :(number==7)? "july" :(number==8)? "aug" :(number==9)? "sep" :(number==10)? "oct" :(number==11)? "nov"
                    : "dec";


        }else{
            name = "Invalid";
        }
        System.out.println("Month name = " + name);
    }

}

/*
Warmup tasks:
1. Create a method that can display the initials of the person
2. Create a method that can display the domain of the email
3. Create a method that can display the name of the month based on
the given number to the method
4. Create a method that can print the name of the day based on the
given number to the method
5. Create a method that can print how many days a month has
 */