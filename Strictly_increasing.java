import java.util.Scanner;
public class Strictly_increasing {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n = scanner.nextInt();

        boolean isIncreasing = true;
        int nextDigit=10;

        int temp = n;
        while(temp > 0){
            int currentDigit = temp % 10;

            if(currentDigit >= nextDigit){
                isIncreasing = false;
                break;
            }

            nextDigit = currentDigit;
            temp = temp / 10;
        }
        if(isIncreasing){
            System.out.println("strictly increasing");
        }
        else{
            System.out.println("not increasing");

        }
       
 scanner.close();
    }
    
}



