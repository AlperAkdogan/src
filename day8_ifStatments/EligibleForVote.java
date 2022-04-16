package day8_ifStatments;

public class EligibleForVote {

    public static void main(String[] args) {

        String name = "Alper";

        int age = 25;

        String citizen = "TR";

        boolean isEligible = age >= 18 && citizen == "TR";

        if (isEligible){
            System.out.println("Eligible");

        }

        if (!isEligible){
            System.out.println("is not eligible");

        }






    }
}
