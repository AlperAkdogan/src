package day13_14_String;

import java.util.Scanner;

public class    StringMethods1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        if (!email.contains("_")){
            System.out.println(email);;

        }else {


            //mike_tyson@gmail.com->tyson_mike@gmail.com
            //FirstName
            //start from index 0and
            // end right before _
            //last name
            //start from index right after _
            //end right before @

            // index of (someStr) -->> return location of that String
            // substring (startingIndex, endingIndex)
            //last name + "_"+firstName +@gmail.com

            String firstName, LastName;
            int underscoreIndex, atSignIndex;
            underscoreIndex = email.indexOf("_");
            atSignIndex = email.indexOf("@");
            firstName = email.substring(0, underscoreIndex);
            LastName = email.substring(underscoreIndex + 1, atSignIndex);

            System.out.println(LastName + "_" + firstName + "@gmail.com");
        }
    }
}
