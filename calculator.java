import java.util.Scanner;
public class calculator{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter firt number:");
        int a=sc.nextInt();
        System.out.println("enter operator(+,-,*,/):");
        char operator=sc.next().charAt(0);
        System.out.println("enter second number:");
        int b=sc.nextInt();

        switch(operator){
            case'+':
            System.out.println("result=" +(a+b));
            break;

            case'-':
            System.out.println("result=" +(a-b));
            break;

            case'*':
            System.out.println("result=" +(a*b));
            break;

            case'/':
            System.out.println("result=" +(a/b));

            default:
                System.out.println("invalid operator");
        }
    }
}
