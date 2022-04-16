package day21_ForEachLoop;

public class forEachLoopIntro {

    public static void main(String[] args) {

        int[] numbers = {3,6,9,12,16,21,24};

        for (int i = 0; i < numbers.length; i++) {
            int eachElement = numbers[i];
            System.out.println(eachElement);
        }
        System.out.println();


        for(int each : numbers){
            System.out.println(each);
        }
    }
}
