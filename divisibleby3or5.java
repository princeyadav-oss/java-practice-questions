import java.util.Scanner;
public class divisibleby3or5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

      System.out.println("enter n: ");
      int n = scanner.nextInt();
      if(n%3 ==0){
        System.out.println("divisible by 3");
      }
      else if(n%5 ==  0){
        System.out.println("divisible by 5");
      }
      else{
        System.out.println("not divisible by both");
      }
          scanner.close();

    }
}
