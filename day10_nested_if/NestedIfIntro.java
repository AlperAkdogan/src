package day10_nested_if;

import javax.swing.*;

public class NestedIfIntro {

    public static void main(String[] args) {


        int score = 400;
        if (score>=0 && score<=100) {

            if (score > 60) {
                System.out.println("passed");
            } else {
                System.out.println("failed");
            }
        }else{
            System.out.println("Invalid score");

        }

        System.out.println("---------------------------------------");


        int age= 25;
        boolean hasId = true;

        if (hasId){

            if (age >=21){
                System.out.println("Eligible to buy alcohol");

            }else{
                System.out.println("Not eligible to buy alcohol");

        }


        }else{
            System.out.println("You must have ID to buy alcohol");
        }

        int number1=5;
        if (number1 >=1 && number1 <= 7){
            if (number1==1){
                System.out.println("Monday");
            }else if (number1==2){
                System.out.println("Tuesday");
            }else if (number1==3){
                System.out.println("wednesday");
            }else if (number1==4){
                System.out.println("Thursday");
            }else if (number1==5){
                System.out.println("Friday");
            }else if (number1==6){
                System.out.println("Saturday");
            }else{
                System.out.println("Sunday");
            }

        }else{
            System.out.println("Number is not valid");
        }

        System.out.println("---------------------------------------------");








    }
}