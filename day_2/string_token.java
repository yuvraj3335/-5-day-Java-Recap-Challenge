import java.util.Scanner;

public class string_token {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter some numbers :");
        double sum = 0;

        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();
                sum += number;
            } else if (!scanner.hasNext()) {
               System.out.println("hello");
                break;
            } else {
                // If the input is not a number or 'quit', skip it
                scanner.next();
            }
        }

        System.out.println("Sum of the numbers: " + sum);
        scanner.close();
    }
}
