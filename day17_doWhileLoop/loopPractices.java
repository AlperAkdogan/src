package day17_doWhileLoop;

public class loopPractices {

    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {   // end point is certain
            System.out.println(i);
        }

        System.out.println("-------------------------"); // we dont know how many time repeat
        int j=1;
        while(j<=10){
            System.out.println(j);
            j++;

        }

        System.out.println("-----------------------");

        int k =1;
        do {
            System.out.println(k);
            k++;
        }while (k <= 10);
    }
}
