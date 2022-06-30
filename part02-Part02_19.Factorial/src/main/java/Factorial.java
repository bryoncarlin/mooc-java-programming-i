
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int bee = scanner.nextInt();
        int honey = 1;
        for (int i = 1; i <= bee; i++) {
            honey = honey * i;

        }
        System.out.println("Factorial:" + honey);

    }
}
