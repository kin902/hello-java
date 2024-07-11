import java.util.*;

public class Main {
    protected void realLifeExample() {
        String studentName = "John Doe";
        int studentID = 15;
        int studentAge = 21;
        float studentFee = 75.25f;
        char studentGrade = 'B';

        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);
        System.out.println();
    }

    protected void realLifeExample2() {
        int length = 4;
        int width = 6;
        int area;

        area = length * width;

        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
        System.out.println();
    }

    protected void scientificNumbers(){
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);
        System.out.println();
    }

    protected void realLifeExample3(){
        // Create variables of different data types
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        // Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);
        System.out.println();
    }

    protected void realLifeExample4(){
        // Set the maximum possible score in the game to 500
        int maxScore = 500;

        // The actual score of the user
        int userScore = 423;

        /* Calculate the percantage of the user's score in relation to the maximum available score.
        Convert userScore to float to make sure that the division is accurate */
        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("User's percentage is " + percentage);
        System.out.println();
    }

    protected void realLifeExample5(){
        int myAge = 25;
        int votingAge = 18;
        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not enough to vote!");
        }
        System.out.println();
    }

    protected void realLifeExample6(){
        int countdown = 3;

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        System.out.println("Happy New Year!!");
        System.out.println();
    }

    protected void realLifeWhileLoop(int multi){
        for (int i = 2; i < 10; i++) {
            //if (i < multi || i > multi) {
            if (i < multi) {
                continue;
            } else if (i > multi) {
                break;
            }

            System.out.println("multi-chapter version of " + i);
            for (int j = 1; j < 11; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }
    }

    protected void realLifeArray() {
        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};
        float arg, sum = 0;
        int length = ages.length;

        for (int age : ages) {
            sum += age;
        }

        arg = sum / length;
        System.out.println("The average age is: " + arg);
        System.out.println();
    }

    protected int sumOf(int x) {
        if (x == 1) {
            return 1;
        }
        return x + sumOf(x - 1);
    }

    protected void realLifeOOP(){
        StringOne stringOne1 = new StringOne();
        StringOne stringOne2 = new StringOne();
        System.out.println(stringOne1.data);
        System.out.println(stringOne2.data);
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("I am learning Java.");
        System.out.println("It is awesome");

        System.out.print("Hello World! ");
        System.out.print("I will print on the same line.\n");

        /*
        Multi-lines
         */
        System.out.println(3);
        System.out.println(358);
        System.out.println(50000);

        // Sum two 3 numbers
        System.out.println(3 + 3);
        System.out.println(2 * 5);
        System.out.println("Hello World");

        String name = "John";
        System.out.println(name);

        int myNum = 15;
        System.out.println(myNum);

        final float myNumFloat;
        myNumFloat = 15;
        System.out.println(myNumFloat);
        System.out.println();

        int myNum5 = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
        System.out.println();

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        System.out.println();

        int x = 5;
        int y = 6;
        System.out.println(x + y); // Print the value of x + y

        int x1 = 5, y1 = 6, z1 = 50;
        System.out.println(x1 + y1 + z1);

        int x2, y2, z2;
        x2 = y2 = z2 = 50;
        System.out.println(x2 + y2 + z2);

        Main main = new Main();
        main.realLifeExample();
        main.realLifeExample2();
        main.scientificNumbers();

        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);
        System.out.println();

        main.realLifeExample3();

        int myInt = 9;
        String myString = "AB";

        System.out.println(myInt);
        System.out.println(Arrays.toString(myString.getBytes()));
        System.out.println();

        main.realLifeExample4();
        main.realLifeExample5();
        main.realLifeExample6();
        main.realLifeWhileLoop(5);
        main.realLifeArray();

        Vehicles.run();
        Vehicles car = new Vehicles();
        car.say();
        car.run();

        System.out.println("---------------------");
        String myStr = "Helloo";
        System.out.println(myStr);
        StringOne.myMethod(myStr);
        System.out.println(myStr);

        System.out.println("---------------------");
        StringData myData = new StringData("Helloo");
        System.out.println(myData.data);
        StringOne.myMethod(myData);
        System.out.println(myData.data);
        System.out.println();

        System.out.println(main.sumOf(5));

        System.out.println("---------------------");
        main.realLifeOOP();
    }
}

class Vehicles {
    void say() {
        System.out.println("Hello World!");
    }
    static void run() {
        System.out.println("running");
    }
}

class StringData {
    String data;

    StringData(String data) {
        this.data = data;
    }
}

class StringOne {
    String data = "This is StringOne's Data";
    static void myMethod(String s) {
        s = "hello world!";
    }

    static void myMethod(StringData s) {
        s.data = "hello world!";
    }
}

