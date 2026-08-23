import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter temperature:");
        int temperature = scan.nextInt();

        if (temperature > 35) {
            System.out.println("Hot");
        }
        else if (temperature >= 25) {
            System.out.println("Warm");
        }
        else if (temperature >= 15) {
            System.out.println("Cool");
        }
        else {
            System.out.println("Cold");
        }
    }
}
    

