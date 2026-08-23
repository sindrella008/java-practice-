import java.util.Scanner;
public class Login{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String correctUsername="admin";
        String correctPassword="1234";
        System.out.println("enter username:");
           String Username=sc.nextLine();
           if(Username.equals(correctUsername)){
            System.out.println("enter password:");
            String Password=sc.nextLine();
            if(Password.equals(correctPassword)){
                System.out.println("Login successful");
            }
            else{
                System.out.println("wrong password");
            }
        }
            else{
                System.out.println("Wrong Username");
            }


           }
        }
    
