import java.util.Arrays;
import java.util.List;

public class Latihan2 {
  public static void main(String[] args) {
    List<Integer> num = Arrays.asList(1,2,3,4,5,6,7);
    System.out.println(num);
    System.out.println("Max = " + max(num, 0, 6));
  }

  public static <T extends Object & Comparable<? super T>>
    T max (List<? extends T> list, int begin, int end){
      T nilai = list.get(0);
      for (int i =  begin; i<=end; i++){
        if (list.get(i).compareTo(nilai)>0){
          nilai = list.get(i);
        }
      }
      return (T) nilai;
    }
}
