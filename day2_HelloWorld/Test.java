package day2_HelloWorld;
import utilities.StringUtility;
public class Test {

    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.reverse(str);

        System.out.println("----------------------");

        String word = "Civic";

        boolean isPalidrome =StringUtility.isPalidrome(word);

        System.out.println("isPalidrome = " + isPalidrome);

        System.out.println("-----------------------");

        String[] names = {"Anna", "Java","Pyhton","racecar","Mom"};

        int count = 0;
        for (String each:names) {
            if (StringUtility.isPalidrome(each)){
                count++;
        }

        }
        System.out.println(count);

        System.out.println("---------------------");

        String s2 ="aaaabbcccccdddd";



        String noDup =StringUtility.removeDuplicates(s2);

        System.out.println(noDup);
    }




}
