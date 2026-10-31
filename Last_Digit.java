import java.util.Scanner;
public class Last_Digit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        while (n>0) {
            n = n%10;
        
        }
        System.out.println(n);
 scanner.close();
    }
}