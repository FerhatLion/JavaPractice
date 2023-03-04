package day_37_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

    Dog dog1 = new Dog("Alex", "Husky", 'M', 1, "Small", "White");
        System.out.println(dog1);

    Cat cat1 = new Cat("Love", "Siamese", 'F', 2, "Large", "Brown");
        System.out.println(cat1);

        dog1.eat();

        dog1.bark();

    }
}
