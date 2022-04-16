package day24_CustomMethod_Return;

public class ReturnPractice {

    public static void main(String[] args) {

        int maxNumber=max(100,200);

        System.out.println(maxNumber);
        // find the max num between 100 & 200

        // multiply the max num by 2
        int multiplication = maxNumber * 2;

        System.out.println(multiplication);
    }


    public static int max(int a, int b){
        int result = 0;

        if (a>b){
            result = a;
        }else{
            result = b;
        }
        return result;
    }
}
