package day13_14_String;
import java.util.Scanner;
public class deneme {


    public static class Reverse {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String word = scan.next();
            //WRITE YOUR CODE HERE


            int length = word.length();





            if (length> 5) {
                System.out.println("Too long!");
            }else if (length < 5) {
                System.out.println("Too short!");
            } else{

                char reverse2 = word.charAt(4);
                char reverse3 = word.charAt(3);
                char reverse4 = word.charAt(2);
                char reverse5 = word.charAt(1);
                char reverse6 = word.charAt(0);
                word = "" + reverse2 + reverse3 + reverse4 + reverse5 + reverse6;
                System.out.println(word);
            }
        }
    }
}
/*
(word.length()>4 && word.length()<6){
      for(int i= word.length()-1; i >=0; i--){
       result += word.charAt(i);
 */
