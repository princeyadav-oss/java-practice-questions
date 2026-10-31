import java.util.Scanner;

public class between10and50 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        // for(int i=10; i<=50; i++){
            if(n>=10 && n<=50){
                System.out.println("lies between 10 and 50");
            }
            else{
                System.out.println("doesn't lies between 10 and 50");
            }
            scanner.close();
        }

    }

