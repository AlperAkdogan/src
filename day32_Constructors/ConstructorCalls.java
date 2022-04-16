package day32_Constructors;

public class ConstructorCalls {


    public ConstructorCalls(){
        System.out.println("Default Constructor");
    }
    public  ConstructorCalls(int a){
        this(); // must be at the first
        System.out.println("Constructor with int argument");

    }

    public ConstructorCalls(String str){
        this(10);
        System.out.println("Constructor with String argument");
    }


}
