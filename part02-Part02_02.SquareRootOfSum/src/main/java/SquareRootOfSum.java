
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.valueOf(scanner.nextLine());
        int third = Integer.valueOf(scanner.nextLine());
        double second = Math.sqrt(first + third);
        System.out.println(second);

    }
}
