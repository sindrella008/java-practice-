import java.util.Scanner;

public class evennumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        }
    }
}
