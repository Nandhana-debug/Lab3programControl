
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {

        Random random = new Random();

        int i = 0;
        int min = 101;
        int max = 0;
        int number;

        while (i < 10) {
            number = random.nextInt(100) + 1;

            System.out.println("Number " + (i + 1) + ": " + number);

            if (number < min) min = number;
            if (number > max) max = number;

            i++;
        }

        System.out.println("");
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
    }
}
