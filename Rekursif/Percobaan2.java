import java.util.*;
public class Percobaan2 {
  public static int fibbon(int x){
    if (x<=0 || x<=1)
    return x ;
    else
    return fibbon(x-2) + fibbon(x-1);
    }
    public static void main(String[] args) {
    int n = 10 ;
    for(int i=0;i<n;i++)
    System.out.println("f" + i + "=" + fibbon(i));
    }
}
