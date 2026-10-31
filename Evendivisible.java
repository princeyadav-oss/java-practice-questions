import java.util.Scanner;
public class Evendivisible {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a number: ");
        int n = scanner.nextInt();
int count =0;
        for(int i = 2; i<=n; i+=2){
            if(i%3==0){
                System.out.println(i);
               count++;
            }
        }
        System.out.println("count: " +count);
        scanner.close();
    }
    
}
