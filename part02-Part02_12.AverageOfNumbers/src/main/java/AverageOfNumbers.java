
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = 0;
        double rift = 0;
        double average = 0;
        while (true) {
            System.out.println("Give a number:");
            int bee = scanner.nextInt();
            if (bee == 0) {
                System.out.println("Average of the numbers: " + average);
                break;
            }
            num = num + bee;
            rift = rift + 1;
            average = num / rift;

        }
    }
}
