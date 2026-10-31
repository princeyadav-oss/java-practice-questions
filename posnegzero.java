import java.util.Scanner;

public class posnegzero {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         System.out.println("enter a number: ");

         int n = scanner.nextInt();
         if(n>0){
   System.out.println("positive");
         }
         else if(n<0){
            System.out.println("Negative");
         }
         else {
            System.out.println("Zero");
         }
         System.out.println(n);
    scanner.close();
    }
}
