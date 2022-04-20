import java.util.*;

public class rata_rata{
  public static void main(String[] args) {
    int number[] = {23,6,47,35,2,14};
    int l = number.length;
    int i;
    float total=0,rata=0;
    System.out.print("Given number : ");
    for (i=0;i<l;i++) {
      total = total + number[i];
      System.out.print(" " + number[i]);
    }
    System.out.print("\n");
    rata = total/l;
    System.out.println("Hasil total adalah : " + total);
    System.out.println("Hasil rata-rata adalah : " + rata);
}
}
