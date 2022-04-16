package day24_CustomMethod_Return;

public class ReturnMethodPractice2 {

    public static void main(String[] args) {


        String str=grade(79);

        if (str.equals("A")){
            System.out.println("excellent");
        }else if(str.equals("B")){
            System.out.println("Great");
        }else if(str.equals("C")){
            System.out.println("good");
        }


    }

    // create a fun that can calculate the grade


    /*
    check the grade:
    'A' -- -Excellent
    'B' -- GREAT
     */

    public static String grade(int score){
        String result = "";

        if (score <0 || score >100){
            System.out.println("Invalid");

        }else{

            result= (score>=90)? "A" :(score>=80)? "B" :(score >= 70)? "C" :(score >=60)? "D" : "F";
        }

        return result;
    }
}
