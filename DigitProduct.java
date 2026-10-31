import java.util.Scanner;

public class DigitProduct {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int product = 1;
        while(n>0) {
            product*=n%10;
            n/=10;
        }
        System.out.println(product);
        scanner.close();
    }
}
