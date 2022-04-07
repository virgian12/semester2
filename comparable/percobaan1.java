import java.util.Arrays;

//ArrayString
public class percobaan1 {
 public static void main(String args[]){
 String animals[] = new String[6];
 animals[0] = "snake";
 animals[1] = "kangaroo";
 animals[2] = "wombat";
 animals[3] = "bird";
 System.out.println("\nSEBELUM DISORTING");
 for (int i = 0; i < 4; i++) {
 System.out.println("animal " + i + " : " + animals[i]);
 }
 Arrays.sort(animals,0,4);
 System.out.println("\nSETELAH DISORTING");
 for (int i = 0; i < 4; i++) {
 System.out.println("animal " + i + " : " + animals[i]);
 }
 }
} 

