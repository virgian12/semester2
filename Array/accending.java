import java.util.*;

public class accending{
  public static void main(String[] args) {
    int number[] = {23,6,47,35,2,14};
    int l = number.length;
    int i,j,t;
    System.out.print("Given number : ");
    for (i=0;i<l;i++) {
      System.out.print(" " + number[i]);
    }
  System.out.println("\n");
  System.out.print("Accending order number : ");
  Arrays.sort(number);
  for (i=0;i<l;i++) {
    System.out.print(" " + number[i]);
  }
  }
}
