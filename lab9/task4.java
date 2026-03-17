class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Lion extends Animal {
    Lion(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println(name + " roars");
    }
}

class Elephant extends Animal {
    Elephant(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println(name + " trumpets");
    }
}

class Monkey extends Animal {
    Monkey(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println(name + " chatters");
    }
}

public class task4 {
    public static void main(String[] args) {
        Lion lion = new Lion("Simba");
        Elephant elephant = new Elephant("Dumbo");
        Monkey monkey = new Monkey("George");

        lion.makeSound();
        elephant.makeSound();
        monkey.makeSound();
    }
}