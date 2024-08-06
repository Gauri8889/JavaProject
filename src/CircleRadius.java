import java.util.Scanner;

public class CircleRadius {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter circumference of circle");
        double circumference = scanner.nextDouble();
        //2 * pi * r
        // r = c / (2 *.14)

        double radius = circumference / (2 * 3.14);


        System.out.println("radius = " + radius);
    }
}

