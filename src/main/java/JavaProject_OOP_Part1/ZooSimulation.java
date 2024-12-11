package JavaProject_OOP_Part1;

public class ZooSimulation {
    public static void main(String[] args) {
        // Instantiate specific animals
        Animal lion = new Lion("Simba", 5);
        Animal elephant = new Elephant("Dumbo", 10);
        Animal parrot = new Parrot("Polly", 2);
        Animal eagle = new Eagle("Rex", 7);

        // Call methods to demonstrate behaviors
        lion.eat();
//        lion.sleep();
        lion.makeSound();
        lion.displayInformation();
        System.out.println();

        elephant.eat();
//        elephant.sleep();
        elephant.makeSound();
        elephant.displayInformation();
        System.out.println();

        parrot.eat();
//        parrot.sleep();
        parrot.makeSound();
        parrot.displayInformation();
        System.out.println();

        eagle.eat();
//        eagle.sleep();
        eagle.makeSound();
        eagle.displayInformation();
        System.out.println();
    }
}

interface AnimalBehavior {
    void eat();         // Abstract method for eating behavior
    void sleep();       // Abstract method for sleeping behavior
    void makeSound();   // Abstract method for sound-making behavior
}

// Abstract class implementing common behaviors and defining abstract methods
abstract class Animal implements AnimalBehavior {
    protected String name; // Name of the animal
    protected int age;     // Age of the animal

    // Constructor for common properties
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Common implementation of sleep behavior
    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // Abstract method to display information about the animal
    public abstract void displayInformation();
}

class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " (a mammal) is eating.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " (a mammal) is making a sound.");
    }

    @Override
    public void displayInformation() {
        System.out.println("Mammal Name: " + name + ", Age: " + age);
    }
}

// Bird class
class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " (a bird) is pecking at food.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " (a bird) is chirping.");
    }

    @Override
    public void displayInformation() {
        System.out.println("Bird Name: " + name + ", Age: " + age);
    }
}

// Specific animals
class Lion extends Mammal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " roars!");
    }
}

class Elephant extends Mammal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " pawoo!");
    }
}

class Parrot extends Bird {
    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " squawks!");
    }
}

class Eagle extends Bird {
    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " screech!");
    }
}

