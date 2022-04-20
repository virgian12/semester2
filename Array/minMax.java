import java.util.*;

public class minMax{
  public static void main(String[] args) {
    int number[] = {23,6,47,35,2,14};
    int l = number.length;
    int i;

    System.out.print("Given number : ");
    for (i=0;i<l;i++) {
      System.out.print(" " + number[i]);
    }

    minMax m = new minMax();
    System.out.println("\n");
    System.out.println("Nila terbesar adalah: " + m.max(number));
    System.out.println("Nila terkecil adalah: " + m.min(number));
  }

  public int max(int [] number){
    int max = 0;
    for(int i=0;i<number.length;i++){
      if(number[i]>max){
        max = number[i];
      }
    }
    return max;
  }

  public int min(int[] number){
    int min = number[0];

    for (int i=0;i<number.length;i++) {
      if(number[i]<min){
        min=number[i];
      }
    }
    return min;
  }
}
