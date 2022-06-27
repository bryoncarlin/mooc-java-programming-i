
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Password?");
        String one = scan.nextLine();
        if (one.equals("Wattlebird")) {
            System.out.println("Off with you!");
        } else if (one.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        }

        // Write your program here 
    }
}
