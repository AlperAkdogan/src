package day20_Array;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;

public class ArrayPractice2 {

    public static void main(String[] args) {

        char[] letters = new char[26];

        System.out.println(Arrays.toString(letters));
        /*
        for (int i = 0, j='A'; i <letters.length ; i++, j++ ) {
           letters[i] = (char)j;
        }
        System.out.println(Arrays.toString(letters));
        */
        /*

            char  ch ='A';
        for (int i = 0; i <letters.length ; i++) {
            letters[i] = ch++;
        }
        System.out.println(Arrays.toString(letters));
*/

        System.out.println("----------------------------");

        letters[0]= 'Z';
        char ch = 'Z';
        for (int i = letters.length-1; i <0; i--, ch--) {   //sor
            letters[i] = ch;
        }
        System.out.println(Arrays.toString(letters));

    }
}
