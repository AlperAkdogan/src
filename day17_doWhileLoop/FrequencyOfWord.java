package day17_doWhileLoop;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String str = "JavaJavaJava";

        int frequency = 0;
                         //**
        for (int i = 0; i <= str.length()-4; i++) { //i: 1 2 3 4
            String eachSub = str.substring(i, i+4);
            //System.out.println(eachSub);

            if (eachSub.equals("Java")){
                frequency++;
            }
        }

        System.out.println(frequency);

    }
}
/*

	2. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";

            output: 3

 */