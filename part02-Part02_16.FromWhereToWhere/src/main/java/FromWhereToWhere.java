
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Where to? " + "\n");
        int bee = scanner.nextInt();
        System.out.println("Where from?" + "\n");
        int bees = scanner.nextInt();
        for (int i = bees; i <= bee; i++) {
            System.out.print(i + "\n");
        }

    }
}
