package day36_OopInheritanceIntro;

public class Animal {

    public String name, breed;
    public char gender;
    public String zie;
    public int age;
    public String colour;

    public void setInfo(String name, String breed, char gender, String zie, int age, String colour) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.zie = zie;
        this.age = age;
        this.colour = colour;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }
    public void drink(){
        System.out.println(name + " is drinking");

    }
    public void move(){
        System.out.println(name+" is moving");
    }
    public void  sleep(){
        System.out.println(name+" is sleeping");
    }



    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", zie='" + zie + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                '}';
    }
}
