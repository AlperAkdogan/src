package day16_ForLoopStringPractice;

public class task1 {

    public static void main(String[] args) {

        String str = "Wooden Spoon";
        //index:      0123456

        String result ="";
        /*
        result += str.charAt(11);//n
        result += str.charAt(10);// o
        result += str.charAt(9);//o
        result += str.charAt(8);//p
        result += str.charAt(7);
        result += str.charAt(6);
        result += str.charAt(5);
        result += str.charAt(4);
        result += str.charAt(3);
        result += str.charAt(2);
        result += str.charAt(1);
        result += str.charAt(0);
        */

        for (int i = str.length()-1; i>=0; i--){   //reversin
            result += str.charAt(i); // adding each char to result
        }


        System.out.print(result);


    }
}
/*
1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW

 */