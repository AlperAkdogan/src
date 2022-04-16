package day20_Array;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {


        // Z - A

        char[] alphabet = new char[26];
/*
                 i     ch
        alphabet[0] = 'Z'; //90  ASCİİ TABLE
        alphabet[1] = 'Y';//89
        alphabet[2] = 'X';//88
  */
        /*
        char ch = 'Z';
        for (int i = 0; i <alphabet.length ; i++, ch--){
            alphabet[i] = ch;
         */

        for (char i = 0, j='Z'; i <alphabet.length;  i++, j--) {
            alphabet[i]=j;
        }

        System.out.println(Arrays.toString(alphabet));//print the whole array
      //  System.out.println(alphabet[0]);//spesific  element of array





    }
}
