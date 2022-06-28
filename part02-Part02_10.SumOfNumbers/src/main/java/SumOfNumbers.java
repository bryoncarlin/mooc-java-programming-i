
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.println("Give a number:");
            int bee = scanner.nextInt();
            if (bee == 0) {
                System.out.println("Sum of the numbers: " + num);
                break;
            }
            num = num + bee;

        }

    }
}
