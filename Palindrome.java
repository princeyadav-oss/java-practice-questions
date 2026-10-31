import java.util.Scanner;

public class Palindrome{

   public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        
        int original = n;
        int reversed = 0;

        while (n>0) {
            int digit = n%10;
            reversed = reversed*10+digit;
            n/=10;
            
        }
        scanner.close();
       
if(original == reversed){
    System.out.println("number is palindrome");
}
else{
    System.out.println("not a palindrome");
}
    }
    
}




// public class PalindromeNumber {
//     public static boolean isPalindrome(int number) {
//         // Negative numbers are not palindromes (e.g., -121 reversed is 121-)
//         if (number < 0) {
//             return false;
//         }

//         int original = number;
//         int reversed = 0;

//         while (number != 0) {
//             int digit = number % 10;
//             reversed = reversed * 10 + digit;
//             number /= 10;
//         }

//         return original == reversed;
//     }