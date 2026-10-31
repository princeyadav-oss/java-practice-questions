import java.util.Scanner;

public class Alleven {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
boolean alleven=true;
        while (n>0) {
            int digit=n%10;
            if(digit%2 !=0){
                alleven = false;
                break;
            }
            n/=10;
        }
        if (alleven) {
            System.out.println("all even");
        }
        else{
            System.out.println("not all even");
        }
        scanner.close();
    }
}
