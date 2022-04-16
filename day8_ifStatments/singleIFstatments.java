package day8_ifStatments;

public class singleIFstatments {
/*
single if = can be used creating for 1 posible output

if & else:

multi-branch if:

nested if:
 */
    public static void main(String[] args) {

        int number = 101;

        boolean evenNumber = number%2 ==0;

        if (evenNumber){

            System.out.println(number+ " is even number ");

        }

        if (!evenNumber){
            System.out.println(number+ " is odd number ");
        }

        int n = 30;

        //positive

        if (n>0){
            System.out.println(n+ " is positive ");
        }
        if (n<0){
            System.out.println(n+ " is negative ");
        }

        if (n==0){
            System.out.println(n + " is zero ");

        }










    }
}
