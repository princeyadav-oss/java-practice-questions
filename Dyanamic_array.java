import java.util.ArrayList;

public class Dyanamic_array {
public static void main(String[] args){
    ArrayList<Integer> arr=new ArrayList<>();
    arr.add(10);
    arr.add(11);
    arr.add(12);
    System.out.println("Element at index 1:" + arr.get(1));
    arr.remove(0);
      System.out.println("size after removal: "+ arr.size());
      System.out.println("Elements" + arr);
}
}


