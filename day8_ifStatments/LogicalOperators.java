package day8_ifStatments;

public class LogicalOperators {

    public static void main(String[] args) {

        String name = "Alper";
        int age = 25;
        String citizen = "TR";

        boolean iseligible = age >18 && citizen == "TR";

        System.out.println(name+ " is eligible for vote: "+ iseligible);

        String name2 ="Oğuz";

        int damage = 31;
        int tdscore = 0;

        boolean isEligibleForbeingSt2Player = damage >= 500 && tdscore >= 5;

        System.out.println(name2 + " is eligible for being st2 player: "+ isEligibleForbeingSt2Player);

        String name3 = "Shay";
        int age3 = 25;
        char gender = 'F';

        boolean isEligible3 =   age3 >18 && (gender =='F' || gender =='M');

        System.out.println(name3 + "is eligible to register: "+ isEligible3);

        System.out.println("-----------------------------------------------------------------");

        String name5 = "josh";

        String countryOfBrith = "USA";
        boolean marriedToUSCitizen = false;

        boolean isEligbile4 = countryOfBrith =="USA" ||  marriedToUSCitizen == true;

        System.out.println(name5+ "is eligible to apply for US citizenship: "+ isEligbile4);

        System.out.println("-----------------------------------------------------------------------");

        String student = "Anna";

        double gpa =3.5;
        int familyIncome = 100000;

        boolean isEligible6 = gpa>= 3.5 || familyIncome <= 60000;

        System.out.println(student+ "is eligible for scholarship: "+ isEligible6);
        







    }
}
