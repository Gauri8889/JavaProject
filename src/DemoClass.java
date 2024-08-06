import java.util.Scanner;

class DemoClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int sum = 0;
        if (number1 % 2 == 0 && number2 % 2 == 1) {
            sum = number1 + number2;
            System.out.println("sum = " + sum);
        } else if (number1 % 2 == 1 && number2 % 2 == 0) {
            sum = number1 + number2;
            System.out.println("sum = " + sum);
        } else {
            System.out.println("addition not possible");
        }
    }
}