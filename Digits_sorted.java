import java.util.Scanner;

public class Digits_sorted {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=scanner.nextInt();
 int next=10;
 boolean isSorted=true;
 while (n>0) {
    int current=n%10;
    if (current>next) {
        isSorted=false;
        break;
        
    }
    next=current;
    n/=10;
 }
if(isSorted){
    System.out.println("Sorted");
}
else{
    System.out.println("Not sorted");
}
scanner.close();
    }
}
