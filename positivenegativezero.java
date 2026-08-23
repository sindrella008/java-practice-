import java.util.Scanner;
public class positivenegativezero{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your number:");
        int num=scan.nextInt();
        if(num>0){
            System.out.println("positive");
        }
        else if(num<0){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }

    }
}
