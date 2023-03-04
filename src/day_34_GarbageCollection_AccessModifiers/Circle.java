package day_34_GarbageCollection_AccessModifiers;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;

    public Circle(double radius){
        this.radius = radius;

    }

    static{
                pi = 3.14;
                name = "Circle";

    }



}
