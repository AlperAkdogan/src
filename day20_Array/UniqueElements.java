package day20_Array;

public class UniqueElements {

    public static void main(String[] args) {


        String[] word = {"Java", "Java", "C#", "Pyhton", "Pyhton"};


        for (int j = 0; j < word.length; j++) {
            String element = word[j];
            int frequency = 0;

            for (int i = 0; i < word.length; i++) { // finds the frequency of the element from array
                if (word[i].equals(element)) {
                    frequency++;

                }
            }

            if (frequency == 1) {
                System.out.println(element);
            }
        }


    }
}
