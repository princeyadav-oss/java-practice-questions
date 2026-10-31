import java.util.Scanner;

public abstract class Digit_less_than5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= scanner.nextInt();

        int count=0;
        while (n>0) {
            int digit = n%10;
            if(digit<5){
                count++;
            }
          n/=10;
        }
            scanner.close();
            System.out.println("count is:" +count);
        }
    }

