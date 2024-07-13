import java.io.*;
import java.util.Scanner;

public class IOFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String do_again = "y";

        while (do_again.equals("y")) {
            StringBuilder choice = new StringBuilder("w");
            System.out.println("What do you want to do( r for read and w for write )?: ");
            choice = new StringBuilder(scanner.nextLine());

            if (choice.toString().equals("w")) {
                try {
                    FileReader fileReader = new FileReader("/Users/kin/Java/hello-java/filename.txt");
                    Scanner myReader = new Scanner(fileReader);

                    choice.delete(0, choice.length());
                    while (myReader.hasNextLine()) {
                        choice.append(myReader.nextLine()).append("\n");
                    }

                    FileWriter fileWriter = new FileWriter("/Users/kin/Java/hello-java/filename.txt");

                    System.out.println("What do you want to write on the next line?: ");
                    fileWriter.append(choice.toString()).append("\n").append(scanner.nextLine());
                    fileWriter.close();
                } catch (FileNotFoundException e) {
                    java.io.File file = new java.io.File("/Users/kin/Java/hello-java/filename.txt");
                }
            } else {
                FileReader fileReader = new FileReader("/Users/kin/Java/hello-java/filename.txt");
                Scanner myReader = new Scanner(fileReader);
                while (myReader.hasNextLine()) {
                    System.out.println(myReader.nextLine());
                }
            }

            System.out.println();
            System.out.print("Enter do you want to do again?: ");
            do_again = scanner.nextLine();
        }
    }
}
