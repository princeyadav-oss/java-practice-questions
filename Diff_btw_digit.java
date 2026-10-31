import java.util.Scanner;
public class Diff_btw_digit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();

       int largest = -1;
       int smallest = 9;
       int Diff_btw_digit=0;
       while (n>0) {
        int digit = n%10;
        n/=10;
        if(digit>largest){
            largest=digit;
        }
        else if(digit<smallest){
            smallest=digit;
        }
        Diff_btw_digit=largest-smallest;
       }
       System.out.println("Difference is: "+Diff_btw_digit);
       scanner.close();

    }
}
