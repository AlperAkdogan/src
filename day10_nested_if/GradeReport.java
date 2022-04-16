package day10_nested_if;

public class GradeReport {
    public static void main(String[] args) {

        /*

        90 - 100: excellent
        80 - 89: great
        70 - 79: good
        60 - 69: passed
        0 - 59: failed
         */
        int score =95;
        String result= "";

        if (score >0 && score <=100){
            if (score>=90){
                result="Excellent";
            }else if (score >=80){
                result="Great";
            }else if (score >=70){          // && sonrası gereksiz otomatik eleniyor zaten
                result="Good";
            }else if (score >=60){
                result="Passed";
            }else{
                result="Failed";
            }

        }else{
            result="Invalid Score";
        }
        System.out.println(result); // önemli


















    }
}
