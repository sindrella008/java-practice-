import java.util.Scanner;

public class greaterthan100{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num > 100) {
            System.out.println("Greater than 100");
        }
    }
}
