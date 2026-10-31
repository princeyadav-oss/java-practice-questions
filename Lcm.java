import java.util.Scanner;

public class Lcm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
  while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        System.out.print("Enter a: ");
     

        System.out.print("Enter b: ");
    }
         scanner.close();
}
}
