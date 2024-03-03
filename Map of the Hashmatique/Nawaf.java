import java.util.Scanner;

public class Nawaf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name);
        System.out.print("Enter a number: ");
        int nb = scanner.nextInt();

        if (nb > 0) {
            System.out.println("Positive");
        } else if (nb < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        scanner.close();
    }
}
