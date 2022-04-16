package day11_SwitchStatements;

public class DaysInWeek {

    public static void main(String[] args) {

        int number = 3;

        /*
        if (number==1){
            System.out.println("Monday");
        }
        */
        switch (number){ //1 2 3 4 5 6 7

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");


            case 3:
                System.out.println("Wednesday");

            //defult:
            //        System.out.println("Invalid");         ortadaysa break lazım

            case 4:
                System.out.println("thursday");


            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("ınvalid");

    }



    }



    }

