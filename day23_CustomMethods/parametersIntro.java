package day23_CustomMethods;

public class parametersIntro {


    public static void main(String[] args) {

        //OddOrEven();// the method demands additional info to complete its task
        OddOrEven(25);
        ageOfPerson(1996);
        printNums(10,20);
    }


    // create a func that can check if a num is odd number or even number

    public static void OddOrEven(int number){

        if (number % 2 == 0){
            System.out.println(number+" is even num");
        }else{
            System.out.println(number+" is odd number");
        }


    }

    // create a func that can display the age of the person
    public static void ageOfPerson(int birthYear){
        int age = 2021 - birthYear;

        System.out.println("Your age is: "+age);
    }

    public  static  void printNums(int x,int y){

        }
    }



