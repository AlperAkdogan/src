package day5_StringConcatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name= "Sherlock",
                buildingNumber = "221B",
                streetName = "Baker Street",
                city = "London",
                state= "England",
                zipCode= "123312A";

        System.out.println(name + "\n" + buildingNumber + " "+ streetName + "\n" + city +", " + state +" " + zipCode );

    }
}
