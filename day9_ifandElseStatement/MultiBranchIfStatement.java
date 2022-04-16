package day9_ifandElseStatement;
// more than 3 CONDITIONS
public class MultiBranchIfStatement {

    public static void main(String[] args) {

        int n=100;
        boolean positive = n>0;
        boolean negative = n<0;


        if (positive){
            System.out.println("positive");
        }else if (negative)
        {System.out.println("negative");
        }else{
            System.out.println("zero");
        }

        if (n>0){
            System.out.println("positive");
        }else if (n<0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }















    }
}
