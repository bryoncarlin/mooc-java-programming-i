
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bee= scanner.nextInt();
        int bees = scanner.nextInt();
        divisibleByThreeInRange(bee, bees);
        

    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.print(i + "\n");
            }

        }

    }
}
