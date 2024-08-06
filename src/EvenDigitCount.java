import java.util.Scanner;

public class EvenDigitCount {
    //count the even digits in the number given by user
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("number = " + number);
        int digitCount = 0;
        while (number != 0) {
            //digit nikalni hai
            int digit = number % 10;
            //last digit ko discard karna hai
            number = number / 10;
            // check karna hai digit even hai ki nahi
            if (digit % 2 == 0) {
                digitCount++;
            }
        }
        System.out.println("digitCount = " + digitCount);
    }

}
