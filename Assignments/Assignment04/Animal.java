package Assigment04;

public class Animal {
        void makeSound() {
            System.out.println("The animal makes a sound.");
        }
    }
    class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("The dog barks.");
        }
    }
    class Cat extends Animal {
        @Override
        void makeSound() {
            System.out.println("The cat meows.");
        }
    }


     class x {
        public static void main(String[] args) {
            Animal genericAnimal = new Animal();
            Dog dog = new Dog();
            Cat cat = new Cat();

            System.out.println("Sound of generic animal:");
            genericAnimal.makeSound();
            System.out.println();

            System.out.println("Sound of a dog:");
            dog.makeSound();
            System.out.println();

            System.out.println("Sound of a cat:");
            cat.makeSound();
        }
    }

