
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (true) {
            System.out.println("Give a number:");
            int bee = scanner.nextInt();
            if (bee == 0) {
                System.out.println("Number of negative numbers: " + num);
                break;
            }
            if (bee < 0) {
                num = num + 1;

            }

        }
    }
}
