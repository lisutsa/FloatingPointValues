package credentials;
import java.util.Scanner;
public class FloatingPointValues {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double total = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        int count = 0;
        while (count < 5) {
            System.out.print("Enter a floating-point value: ");
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                total += value;
                if (value > max) {
                    max = value;
                }
                if (value < min) {
                    min = value;
                }
                count++;
            } else {
                System.out.println("Invalid input. Please enter a floating-point number.");
                scanner.next(); 
            }
        }

        double average = total / count;
        double interest = total * 0.20;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Interest on total at 20%: " + interest);

        scanner.close();

	}

}
