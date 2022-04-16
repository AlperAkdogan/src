package day15ForLoop;

public class ForLoop {
    public static void main(String[] args) {

        for(int i = 3; i <=5; i++){
            System.out.println("hello world");

        }

        System.out.println("-----------------------------");

        for (int i=100; i>=50; i--){
            System.out.println(i+" ");
        }

        for(int i =1; i <=55; i++){
            if (i % 2 ==0){
                System.out.println(i+" ");
            }
        }

        System.out.println("--------------------------------------");


        for(int i=2; i <=20; i += 2)
            System.out.println(i+" ");
    }
}
