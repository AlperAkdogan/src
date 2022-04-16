package day36_OopInheritanceIntro;

public class zoo {

    public static void main(String[] args) {


        dog dog = new dog();
        dog.setInfo("max","husky",'M',"Small",2,"white");
        dog.eat();
        dog.sleep();
        dog.move();
        dog.bark();
        System.out.println(dog);

        cat cat = new cat();
        cat.setInfo("Tarcin","british",'f',"small",2,"gray");

        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        cat.scratch();
        System.out.println(cat);

        tiger tiger = new tiger();
        tiger.setInfo("sherr","bengal",'M',"LARGE",5,"ORANGE");

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();
        tiger.roar();
        tiger.hunt();
    }

}
