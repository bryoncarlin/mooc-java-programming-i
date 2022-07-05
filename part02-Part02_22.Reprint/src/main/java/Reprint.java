
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many times?");
        int bee = scan.nextInt();
        for (int i = 0; i < bee; i++) {
            printText();
        }

    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
