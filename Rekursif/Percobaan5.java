import java.util.*;
public class Percobaan5 {
  public static int pangkatrekursif(int x, int y){
    if (y==0)
    return 1 ;
    else return x * pangkatrekursif(x,y-1);
    }
    public static void main(String[] args) {
    System.out.println("Bilangan x pangkat y : ");
    Scanner input = new Scanner(System.in);
    System.out.println("Bilangan x : ");
    int x = input.nextInt() ;

    System.out.println("Bilangan y : ");
    int y = input.nextInt() ;
   
    System.out.println(x + " dipangkatkan " + y + " = " +
   pangkatrekursif(x,y));
    }
}
