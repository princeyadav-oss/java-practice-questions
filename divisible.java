import java.util.Scanner;
public class divisible {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter n: ");
        int n = scanner.nextInt();

        if(n%15==0){
            System.out.println("Divisible by 3 && 5");
        }
        else{
            System.out.println(" not divisible by 3 && 5");
        }
        scanner.close();
    }
    
}
