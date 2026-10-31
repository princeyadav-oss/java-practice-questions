import java.util.Scanner;
public class Largest {
     public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("enter a:");
int a = scanner.nextInt();
System.out.println("enter b:");
int b = scanner.nextInt();

     if(a>b){
        System.out.println("a is largest");
     }
     else{
        System.out.println("b is largest");
     }
   scanner.close();
     }
    
}
