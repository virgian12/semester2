import java.util.Arrays;
import java.util.*;

 class Percobaan implements Comparator{
    public int compare(Object o1, Object o2) {
        Mahasiswa m1 = (Mahasiswa) o1; 
        Mahasiswa m2 = (Mahasiswa) o2;
        return m1.getNama().compareTo(m2.getNama()); 
    } 
} 

public class Percobaan5a { 
    public static void main(String[] args) { 
    Mahasiswa dataMhs[] = {new Mahasiswa("05", "Cahya"),new 
   Mahasiswa("04", "Rudi"), 
    new Mahasiswa("01", "Endah"),new Mahasiswa("03", "Rita"),new 
   Mahasiswa("02", "Tika")}; 
    
    System.out.println("SEBELUM SORTING"); 
    System.out.println(Arrays.toString(dataMhs)); 
   // Arrays.sort(dataMhs, new NamaComparator());
    System.out.println("\nSESUDAH SORTING"); 
    System.out.println(Arrays.toString(dataMhs)); 
    } 
   } 