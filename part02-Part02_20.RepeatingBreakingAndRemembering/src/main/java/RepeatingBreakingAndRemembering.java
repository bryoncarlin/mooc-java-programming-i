
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int numbers = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            int bee = scanner.nextInt();
            if (bee <= -1) {
                break;
            }
            if (bee <= 0) {
                continue;

            }
            if (bee % 2 == 1) {
                odd++;
            } else if (bee % 2 == 0) {
                even++;
            }
            sum += bee;
            numbers++;

        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average " + (double) sum / numbers);
        System.out.println("Even " + even);
        System.out.println("Odd " + odd);
    }
}
