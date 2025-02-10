//Question 3:-Explain the difference between method overloading and method overriding in Java.
//Provide code examples to illustrate both concepts.
//
//Method Overloading
//
//Method overloading is a concept where multiple methods with the same name can be defined, but with different parameter lists. The method to be invoked is determined by the number and types of arguments passed to it.
//
//Example:
//
//public class Calculator {
//    public int add(int a, int b) {
//        return a + b;
//    }
//
//    public double add(double a, double b) {
//        return a + b;
//    }
//
//    public int add(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        System.out.println(calculator.add(1, 2));
//        System.out.println(calculator.add(1.5, 2.5));
//        System.out.println(calculator.add(1, 2, 3));
//    }
//}
//
//
//Method Overriding
//
//Method overriding is a concept where a subclass provides a different implementation of a method that is already defined in its superclass. The method in the subclass has the same name, return type, and parameter list as the method in the superclass.
//
//Example:
//
//public class Animal {
//    public void sound() {
//        System.out.println("The animal makes a sound.");
//    }
//}
//
//public class Dog extends Animal {
//    @Override
//    public void sound() {
//        System.out.println("The dog barks.");
//    }
//}
//
//public class Cat extends Animal {
//    @Override
//    public void sound() {
//        System.out.println("The cat meows.");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.sound(); // Output: The animal makes a sound.
//
//        Dog dog = new Dog();
//        dog.sound(); // Output: The dog barks.
//
//        Cat cat = new Cat();
//        cat.sound(); // Output: The cat meows.
//    }
//}



