import java.util.Scanner;
public class divisor{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
 for(int i =1; i<=n; i++ ){
 if(n%i==0){
    System.out.println(i + " ");

    }
}
 System.out.println();
scanner.close();
}
}