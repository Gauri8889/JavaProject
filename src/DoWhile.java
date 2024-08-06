import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("press 1 to continue");
            System.out.println("press 0 to exit");
            option = scanner.nextInt();
        } while (option != 0);
    }
}