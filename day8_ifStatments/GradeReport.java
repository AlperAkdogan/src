package day8_ifStatments;

public class GradeReport {

    public static void main(String[] args) {
        /*
        90-100 excellent
        80-89 great
        70-79 good
        69-60 passed
        0-59 failed

         */

        int score = 85;

        boolean a = score >=90 && score <=100;
        boolean b = score >=80 && score <=89;
        boolean c = score >=70 && score <=79;
        boolean d = score >=69 && score <=60;
        boolean f = score <59;

        if (a){
            System.out.println("Excellent");
        }
        if (b){
            System.out.println("great");
        }
        if (c){
            System.out.println("good");
        }
        if (d){
            System.out.println("passed");
        }
        if (f){
            System.out.println("failed");
        }















    }
}
