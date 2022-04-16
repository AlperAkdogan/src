package day24_CustomMethod_Return;

public class ReturnMethodPractice4Duplicated {

    public static void main(String[] args) {

        String str = "aaaaccccdadaaabbbbbcf";

        str= removeDuplicates(str);

        System.out.println(str);


    }

    public static String removeDuplicates(String str){

        String result = "";

        for (int i = 0; i <str.length() ; i++) {
            char each = str.charAt(i);

            if (!result.contains(each+"")){
                result +=each;
            }
        }

        return result;
    }
}
