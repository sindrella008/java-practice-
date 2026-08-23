import java.util.Scanner;

public class exameligibility {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter attendance: ");
        int attendance = scan.nextInt();

        System.out.print("Enter mark: ");
        int mark = scan.nextInt();

        if (attendance >= 75) {

            if (mark >= 40) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not Eligible");
            }

        } else {
            System.out.println("Not Eligible");
        }
    }
}
    

