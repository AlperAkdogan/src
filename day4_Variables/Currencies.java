package day4_Variables;

public class Currencies {

    public static void main(String[] args) {

        int dollar= 1000;

        double lira= dollar*13.45;
        double euro= dollar*0.88;
        double pound= dollar*0.73   ;
        double ruble= dollar*76.34;

        System.out.println("\t1000 dollar");
        System.out.println("");
        System.out.println("ruble =  " + ruble);
        System.out.println("pound =  " + pound);
        System.out.println("euro =  " + euro);
        System.out.println("lira =  " + lira);
    }
}
