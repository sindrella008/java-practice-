public class Typecasting {
    public static void main(String[]args){
        //widening
        int a=10;
        double b=a;

        System.out.println("Widening:");
        System.out.println(a);
        System.out.println(b);
        //narrowing
        double x=20.75;
        int y=(int)x;
        System.out.println("Narrowing:");
        System.out.println(x);
        System.out.println(y);
    }
    
}
 
