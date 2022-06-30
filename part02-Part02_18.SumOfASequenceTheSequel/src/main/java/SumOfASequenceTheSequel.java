
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Number?");
        int bee = scanner.nextInt();
        System.out.println("Last Number?");
        int bees = scanner.nextInt();
        int sum = 0;
        for (int i = bee; i <= bees; i++) {
            sum += i;
            

        }
       
        System.out.println("The sum is " + sum);
    }
}
