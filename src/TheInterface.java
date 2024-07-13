
interface IAnimal {
    void say();
    void say(String word);
    void eat();
}

abstract class AAnimalRunnable implements IAnimal {
    public void say(String word) {
        System.out.println(word);
    }

    abstract void run();
}

abstract class AAnimal4Legs extends AAnimalRunnable {
    public void run() {
        System.out.println("4 legs");
    }
}

class APig extends AAnimal4Legs {
    public void say() {
        System.out.println("The pig says: wee wee");
    }

    public void eat() {
        System.out.println("The pig eats: rice");
    }
}

class ADog extends AAnimal4Legs {
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

public class TheInterface {
    public static void main(String[] args) {
        AAnimalRunnable animalRunnable;

        animalRunnable = new APig();
        animalActions(animalRunnable);

        animalRunnable = new ADog();
        animalActions(animalRunnable);
    }

    public static void animalActions(AAnimalRunnable animal) {
        animal.eat();
        animal.say();
        animal.run();
        animal.say("Hello world");
    }
}
