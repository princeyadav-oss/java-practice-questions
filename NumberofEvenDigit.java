import java.util.Scanner;

public class NumberofEvenDigit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        int count=0;
        while (n>0) {
            int digit=n%10;
            if(digit%2==0){
                count++;
                System.out.println(digit);
            }
            n/=10;
        }
     System.out.println("number of even digits: " +count);
        scanner.close();
    }
}
