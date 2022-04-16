package day23_CustomMethods;

public class CustomMethodPractice {

    // creat a func that can print hello world 5 times

    // creat a func that can print hello cydeo 5 times

    public static void main(String[] args) {
        helloCydeo5times();
        System.out.println("--------------------");
        helloWorld5times();
        System.out.println("--------------------");
        evenNums();

    }

    public static void helloWorld5times(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("HelloWorld");
        }
        /*
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
         */
    }

    public static void helloCydeo5times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("HelloCydeo");
        }
        /*
        System.out.println("HelloCydeo");
        System.out.println("HelloCydeo");
        System.out.println("HelloCydeo");
        System.out.println("HelloCydeo");
        System.out.println("HelloCydeo");
         */

    }

    public static void evenNums(){
        for (int i = 0; i <=10 ; i+=2) {
            System.out.println(i);
        }
    }
}
