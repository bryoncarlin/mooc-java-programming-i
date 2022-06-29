
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bee = scanner.nextInt();

        int sum = 0;
        int number = 0;

        while (bee != 0) {
            if (bee > 0) {
                number++;
                sum += bee;

            }
            bee = scanner.nextInt();
        }
        double average = (double) sum / number;

        if (sum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(average);
        }
    }
}
