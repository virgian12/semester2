import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


class coba implements Comparator{

  public int compare(Object o1, Object o2) {
    // TODO Auto-generated method stub
    Mahasiswa m1 = (Mahasiswa) o1;
    Mahasiswa m2 = (Mahasiswa) o2;
    return m1.getNama().compareTo(m2.getNama());
  }
}

class Mahasiswa{
  private String nrp ;
  private String nama ;
  public Mahasiswa(String nrp, String nama) {
  this.nrp = nrp;
  this.nama = nama;
  }
  public String getNama() {
  return nama;
  }
  public void setNama(String nama) {
  this.nama = nama;
  }
  public String getNrp() {
  return nrp;
  }
  public void setNrp(String nrp) {
  this.nrp = nrp;
  }
  
  @Override
  public String toString() {
  return "Mahasiswa{" + "nrp=" + nrp + " nama=" + nama + '}';
  }
}
  
@SuppressWarnings("unchecked")
 public class percobaan5 {
  public static void main(String[] args) {
  Mahasiswa dataMhs[] = {new Mahasiswa("05", "Cahya"),new Mahasiswa("04", "Rudi"), new Mahasiswa("01", "Endah"),new Mahasiswa("03", "Rita"), new Mahasiswa("02", "Tika")};
 
  System.out.println("SEBELUM SORTING");
  System.out.println(Arrays.toString(dataMhs));
  Arrays.sort(dataMhs, new coba());
  System.out.println("\nSESUDAH SORTING");
  System.out.println(Arrays.toString(dataMhs));
  }
 } 
 