import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int number = scanner.nextInt();
        int ten = 10;
        // Checks if user entered a number between 1 and 10
        if (number > 0 && number <= ten) {
            // Loop creates a 10x10 multiplication table
            for (int i = 1; i <= ten; i++) {
                for (int j = 1; j <= ten; j++) {
                    System.out.print(number * j + "\t");
                }
                number += 1;
                System.out.println();
            }
        }
    }
}
