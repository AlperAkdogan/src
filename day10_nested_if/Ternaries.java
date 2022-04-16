package day10_nested_if;

public class Ternaries {

    public static void main(String[] args) {

        int n =100;

        if (n%2 == 0){
            System.out.println("Even"); //String
        }else{
            System.out.println("odd"); //String
        }

        System.out.println("--------------------------");

       String result1  = (n%2 == 0)?"Even" : "odd";

        System.out.println(result1);

        System.out.println("------------------------------------------------");

        int age =23;
        /*
        if (age >=21){
            System.out.println("Eligible"); //String
        }else{
            System.out.println("Not Eligible");//String
        }
        */

        //System.out.println(age >=21) ? "Eligible" : "Not eligible";
        String result2= (age >=21) ? "Eligible" : "Not eligbile";
        System.out.println(result2);

        System.out.println("---------------------------------------------------------------");
        int number6 = 50;
        /*
        if(number>0){
        sout("positive);
        }else if(number<0){
        sout("negative");
        }else{
        sout ("ZERO");
         */
                String result5 =(number6>0)? "Positive" :(number6<0)? "Negative" : "Zero";

        System.out.println(result5);


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

        String result = (number1==1)? "Monday" :(number1==2)? "Tuesday" :(number1==3)? "Wednesday" :(number1==4)? "Thursday"
                :(number1==5)? "Friday" :(number1==6)? "Saturday" : "Sunday";

        System.out.println(result);








    }
}
