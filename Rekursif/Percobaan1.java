import java.util.*;
public class Percobaan1 {
  public static int faktorial(int x){
    if (x==1)
    return x ;
    else
    return x * faktorial(x-1);
    }
   
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("N = ");
    int n = input.nextInt();
    System.out.println("Hasil = " + faktorial(n));
    }
}
