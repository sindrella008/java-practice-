import java.util.Scanner;

public class drivingeligibility {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        System.out.print("Do you have a valid license? (true/false): ");
        boolean license = scan.nextBoolean();

        if (age >= 18) {

            if (license) {
                System.out.println("Eligible to drive");
            } else {
                System.out.println("Not eligible - Valid license required");
            }

        } else {
            System.out.println("Not eligible - Age must be 18 or above");
        }
    }
}
