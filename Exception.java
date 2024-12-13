import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the value of num1: ");
        int num1 = s.nextInt();

        System.out.print("Enter the value of num2: ");
        int num2 = s.nextInt();

        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
    }
}