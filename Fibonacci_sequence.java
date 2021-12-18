import java.util.Scanner;

public class Fibbonacci_sequence{
    
    // F(0) = 0; F(1) = 1; F(n) = F(n-1) + F(n-2) where n>1

     public static void main(String []args){
          Scanner scan = new Scanner(System.in);
          
        while(true) {
            System.out.println("n: ");
            String input = scan.nextLine();
            int n = Integer.parseInt(input);
            System.out.println(fib(n));
        }
        
     }
     
     public static  int fib (int n) {
         if(n==0) {
             return 0;
         }
         
         else if(n==1) {
             return 1;
         }
         
         else {
             return fib(n-1) + fib(n-2);
         }
     }
}
