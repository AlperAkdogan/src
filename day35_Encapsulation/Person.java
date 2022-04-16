package day35_Encapsulation;

public class Person {

    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberofHead;

    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    static{
        planet = "Earth";
        isHuman= true;
        hasNose= true;
        numberofHead=1;
        numberOfWings=0;

    }

    public static void  printPlanetName(){   // static yapmazsan consume memory
        System.out.println("planet name is = " + planet);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking = " + drink);
    }

    public void eat(String eat){
        System.out.println(name+" is eating = " + eat);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", planet='" + planet + '\'' +
                '}';
    }
}
