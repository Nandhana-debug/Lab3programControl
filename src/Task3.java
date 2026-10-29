
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The program calculates the roots of the equation ax^2+bx+c = 0.");

        System.out.println("Enter the value of a (and press Enter):");
        double a = scanner.nextDouble();

        System.out.println("Enter the value of b (and press Enter):");
        double b = scanner.nextDouble();

        System.out.println("Enter the value of c (and press Enter):");
        double c = scanner.nextDouble();

        System.out.printf("For a = %.2f, b = %.2f, c = %.2f,%n", a, b, c);

        if (a == 0) {
            System.out.println("Not a quadratic equation.");
        } else {
            double delta = b * b - 4 * a * c;
            int roots;

            if (delta > 0) {
                roots = 2;
            } else if (delta == 0) {
                roots = 1;
            } else {
                roots = 0;
            }

            switch (roots) {
                case 2:
                    double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b + Math.sqrt(delta)) / (2 * a);

                    System.out.printf("x1 = %.2f%n", x1);
                    System.out.printf("x2 = %.2f%n", x2);
                    break;

                case 1:
                    double x = -b / (2 * a);
                    System.out.printf("x1 = %.2f%n", x);
                    break;

                case 0:
                    System.out.println("No real roots.");
                    break;
            }
        }

        scanner.close();
    }
}
