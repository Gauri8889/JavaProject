import java.util.Scanner;

class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("dont check for greatest number");
        } else {
            if (num1 > num2 && num1 > num3) {
                System.out.println("num1 is greatest");
            } else if (num2 > num1 && num2 > num3) {
                System.out.println("num2 is greatest");
            } else {
                System.out.println("num3 is greatest ");
            }
        }

    }
}