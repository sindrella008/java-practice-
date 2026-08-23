import java.util.Scanner;
public class electricityusage{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your units:");
        int units=scan.nextInt();
        if(units<=100){
            System.out.println("low usage");

        }
        else if(units<=200){
            System.out.println("medium usage");

        }
        else if(units<=300){
            System.out.println("high usage");
        }
        else{
            System.out.println(" very high usage");
        }
    }
}
    

