package day17_doWhileLoop;

public class frequencyOfWordWhileLoop {

    public static void main(String[] args) {


        String sentence ="cat cat cat cat dog dog dog dog cat";
        int countCat =0;

        while (sentence.contains("cat")){
            sentence = sentence.replaceFirst("cat","");
            countCat++;

        }
        System.out.println(countCat);

    }
}
