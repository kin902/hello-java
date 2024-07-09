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
    }

    protected void realLifeExample2() {
        int length = 4;
        int width = 6;
        int area;

        area = length * width;

        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
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

        int myNum5 = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

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
    }
}
