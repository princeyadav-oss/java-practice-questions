import java.util.Scanner;
public class Average_Digit{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number:");

    int n = scanner.nextInt();
    int count=0;
    int sum = 0;
    while (n>0) {
        int digit=n%10;
        sum+=digit;
        count++;
        n/=10;
        
    }
   double Average = (double) sum/count;
   System.out.println("Average is: "+Average);
   scanner.close();
}
}

