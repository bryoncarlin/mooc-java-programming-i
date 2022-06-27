
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();
            int numbs = 0;
            if (number > 0 && number < 0) {
                numbs = (number * number);
                     
                continue;
            }
            if (number == 0) {

                break;
            }
            System.out.println(numbs);
            System.out.println("Unsuitable number");
        }
        

    }
}
