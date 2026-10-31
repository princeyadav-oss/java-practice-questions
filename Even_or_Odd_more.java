import java.util.Scanner;

public class Even_or_Odd_more {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();

        int even=0;
        int odd=0;
        while (n>0) {
            int digit=n%10;
            if(digit%2==0){
                even++;
               
            }
            else{
                odd++;                
            }
            n/=10;
        }
            if (even>odd) {
                System.out.println("more even");
                
            }
            else if(odd>even){
                System.out.println("odd is more");
            }
            else{
                System.out.println("equal");
            }
             scanner.close();
        }
      

    }

