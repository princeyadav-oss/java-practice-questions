import java.util.Scanner;
public class DigitOccurence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n=scanner.nextInt();

        System.out.println("Enter target digit: ");
        int target = scanner.nextInt();

        int count = 0;

        while (n>0) {
            int curr_digit=n%10;
            if(curr_digit == target){
                count++;
            }
            n/=10;
        }
        System.out.println("Occurrence: "+count);
       scanner.close();

    }
}
