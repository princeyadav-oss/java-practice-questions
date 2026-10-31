import java.util.Scanner;
public class Alternate_evenOdd {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();

        boolean isAlternating = true;
        int last = -1;

        int temp = n;
        while (temp>0) {
            int digit = temp%10;
            int current = digit % 2;

            if(last !=-1 && current == last){
                isAlternating = false;
                break;
            }         
            last = current;
            temp = temp/10;   
        }
        if(isAlternating){
            System.out.println("digits are alternating");

        }
        else{
            System.out.println("digits are not alternating");
        }
        scanner.close();
        
    }
}
