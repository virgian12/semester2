import java.util.*;

@SuppressWarnings("unchecked")
public class Latihan1{
  public static void main(String[] args) {
    Set A = new HashSet();
    A.add(1);
    A.add(2);
    A.add(3);
    A.add(4);
    A.add(5);

    Set B = new HashSet();
    B.add(5);
    B.add(6);
    B.add(7);
    B.add(8);
    B.add(9);
    B.add(10);

    Set notduplicate = new TreeSet(A);
    notduplicate.removeAll(B);
    print("A - B: ",notduplicate);

    Set irisan = new TreeSet(A);
    irisan.retainAll(B); //irisan
    print("Irisan : ",irisan);

    Set gabungan = new TreeSet(A);
    gabungan.addAll(B);
    print("Gabungan: ",irisan);

    Set complement = new TreeSet(A);
    System.out.print("Complement " + A.containsAll(B));
  }

  private static void print(String label, Collection c) {
    System.out.println(label);
    Iterator it = c.iterator();
    while (it.hasNext()){
      System.out.println(it.next());
    }    
  }
}