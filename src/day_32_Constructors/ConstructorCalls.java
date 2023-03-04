package day_32_Constructors;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(String str){
        this(10);
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        ConstructorCalls obj1 = new ConstructorCalls();
        ConstructorCalls obj2 = new ConstructorCalls(10);
        ConstructorCalls obj3 = new ConstructorCalls("Java");






    }



}
