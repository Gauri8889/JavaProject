import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");
        int number = scanner.nextInt();
        scanner.nextLine();
        if (number > 0) {

            for (int i = 1; i <= 10; i++) {
                System.out.println("Hello world");
                System.out.println("Thank you");
            }
        }

    }
}
