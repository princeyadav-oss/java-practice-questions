// import java.util.Scanner;
// public class largestDigit {
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Ente a number: ");
//         int n = scanner.nextInt();

//         int largest = -1;
//         while (n>0) {
//             int digit = n%10;
           
//             if( digit > largest ){
//                 largest= digit;
//             }
//             n/=10;
//         }
//         System.out.println("Largest Digit: " + largest);
//         scanner.close();
//     }
// }

import java.util.Scanner;
public class largestDigit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ente a number: ");
        int n = scanner.nextInt();

        int smallest = 9;
        while (n>0) {
            int digit = n%10;
           
            if( digit < smallest ){
                smallest= digit;
            }
            n/=10;
        }
        System.out.println("Smallest Digit: " + smallest);
        scanner.close();
    }
}
