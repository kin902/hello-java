/*
 Java Polymorphism: https://www.w3schools.com/java/java_polymorphism.asp
 */

abstract class Animal {
    public abstract void say();
    public abstract void say(String word);
    public abstract void eat();
}

abstract class AnimalRunnable extends Animal {
    public abstract void run();
}

abstract class Animal4Legs extends AnimalRunnable {
    public void say(String word) {
        System.out.println(word);
    }

    public void run() {
        System.out.println("4 legs");
    }
}

class Pig extends Animal4Legs {
    public void say() {
        System.out.println("The pig says: wee wee");
    }

    public void eat() {
        System.out.println("The pig eats: rice");
    }
}

class Dog extends Animal4Legs {
    public void say() {
        System.out.println("The dog says: bow wow");
    }

    public void eat() {
        System.out.println("The dog eats: bone");
    }

    public void run() {
        System.out.println("4 short legs");
    }
}

class Polymorphism {
    public static void main(String[] args) {
        AnimalRunnable animalRunnable;

        animalRunnable = new Pig();
        animalActions(animalRunnable);

        animalRunnable = new Dog();
        animalActions(animalRunnable);
    }

    public static void animalActions(AnimalRunnable animal) {
        animal.eat();
        animal.say();
        animal.run();
        animal.say("Hello world");
    }
}