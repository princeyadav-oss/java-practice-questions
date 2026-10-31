import java.util.Scanner;

public class Digitsum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int sum=0;
        int digit;
        while(n>0){
        digit = n%10;
        sum+=digit;
        // or sum+=n%10
        n/=10;
        }
        System.out.println(sum);
        scanner.close();
    }
}
