import java.util.Scanner;

public class Sum_even_odd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;
        while (n>0) {
            int digit=n%10;
            sum+=digit;
            n/=10;
            }
            System.out.println("sum of digits:" +sum);

            if(sum%2==0){
                System.out.println("sum is even");
            }else{
                System.out.println("odd");
            }
            scanner.close();
            
        }
        
    }

