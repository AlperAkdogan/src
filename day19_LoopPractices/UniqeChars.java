package day19_LoopPractices;

public class UniqeChars {

    public static void main(String[] args) {

        String str ="aabccdeef";

        String result ="";

        for (int j = 0; j <str.length() ; j++) {
            char ch = str.charAt(j);
            int count = 0; // represents the frequency of the ch

            for (int i = 0; i <str.length() ; i++) { // compares the car that outer loop picked with each char
                char each = str.charAt(i);// each char of str
                if (ch==each){
                    count++;
                }
            }
            if(count ==1){
                result +=ch;
            }

        }

        System.out.println(result);
    }
}
/*
find uniqe chars

str := aabccdeef

out
bdf
 */