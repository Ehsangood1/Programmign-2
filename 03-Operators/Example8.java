class Animal {
    // Some fields and methods
}

class Dog extends Animal {
    // Some fields and methods specific to Dog
}

class Cat extends Animal {
    // Some fields and methods specific to Cat
}

public class InstanceofOperatorExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myAnimal = new Animal();

        // Checking the type of objects using instanceof
        if (myDog instanceof Dog) {
            System.out.println("myDog is an instance of Dog");
        }

        if (myDog instanceof Animal) {
            System.out.println("myDog is an instance of Animal");
        }

        if (myCat instanceof Cat) {
            System.out.println("myCat is an instance of Cat");
        }

        if (myCat instanceof Animal) {
            System.out.println("myCat is an instance of Animal");
        }

        if (myAnimal instanceof Dog) {
            System.out.println("myAnimal is an instance of Dog");
        } else {
            System.out.println("myAnimal is NOT an instance of Dog");
        }

        if (myAnimal instanceof Animal) {
            System.out.println("myAnimal is an instance of Animal");
        }

        // Using instanceof with interface
        if (myDog instanceof Object) {
            System.out.println("myDog is an instance of Object");
        }
    }
}
