import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int number = scanner.nextInt();
        int ten = 10;

        if (number > 0 && number <= ten) {
            for (; number < number + ten; number++) {

            }
        }

    }
}
