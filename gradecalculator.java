import java.util.Scanner;

public class gradecalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your mark");
        int mark = scan.nextInt();

        if (mark >= 90) {
            System.out.println("A+");
        }
        else if (mark >= 80) {
            System.out.println("A");
        }
        else if (mark >= 70) {
            System.out.println("B");
        }
        else if (mark >= 60) {
            System.out.println("C");
        }
        else if (mark >= 50) {
            System.out.println("D");
        }
        else {
            System.out.println("Fail");
        }
    }
}
