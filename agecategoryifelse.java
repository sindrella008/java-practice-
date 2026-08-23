import java.util.Scanner;

public class agecategory {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        if (age <= 12) {
            System.out.println("Child");
        }
        else if (age <= 19) {
            System.out.println("Teenager");
        }
        else if (age <= 59) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Senior");
        }
    }
}
