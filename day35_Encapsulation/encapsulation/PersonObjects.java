package day35_Encapsulation.encapsulation;

import day35_Encapsulation.Person;

public class PersonObjects {

    public static void main(String[] args) {

        person p1 =new person();

        p1.setName("Alper");
        p1.setAge(25);

        System.out.println(p1.getName()+" : "+p1.getAge());
    }
}
