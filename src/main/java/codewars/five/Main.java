package codewars.five;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Dog dog = (Dog) animal;
        System.out.println(animal);
        System.out.println(dog);
    }

    static void print(Collection<?> collection) {
        System.out.println("Collection");
    }

    static void print(List<?> collection) {
        System.out.println("List");
    }

    static void print(ArrayList<?> collection) {
        System.out.println("ArrayList");
    }

    static class Animal {
        void say() {
            System.out.println("lala");
        }
    }

    static class Dog extends Animal {
    }
}


