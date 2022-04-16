package day38_OOPInheritanceContinueMethodOverriding;

public class ParkingLot {

    public static void main(String[] args) {

        toyota toyota = new toyota("camry",2020,200000,"gray",123456);

        Tesla tesla = new Tesla("Model s",2020,90440,"red",0);

        BMW bmw = new BMW("X5",2020,65434,"BLACK",1200);



        toyota.start();
        tesla.start();
        bmw.start();

    }
}
