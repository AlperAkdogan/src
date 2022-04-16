package day10_nested_if;

public class TernariesWithNestedIf {

    public static void main(String[] args) {

        int s = 10000;
        /*
        if (s>=0 && s<=100){
            if(s>=60){
            System.out.println("passed")
            }else{
            System.out.println("failed")
          }



        }else{
            System.out.println("Invalid score");
        }
        */
        String result =(s>=0 && s<=100)? (s>=60)? "Passed" : "Failed" :"Invalid ";

        System.out.println(result);

    }
}
