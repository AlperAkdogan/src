package day16_ForLoopStringPractice;

public class task2 {

    public static void main(String[] args) {
        
        String word= "Level";
        
        String reversed= "";

        for (int i = word.length()-1; i >=0 ; i--) {
            reversed += word.charAt(i);

        }
        boolean isPlaindrome = word.equalsIgnoreCase(reversed);

        System.out.println("isPlaindrome = " + isPlaindrome);
        
    }
} 

/*
"Java ==> avaJ ===> false / not palindrome /
Anna ==> annA ==> true
"level"
"dad"

 */