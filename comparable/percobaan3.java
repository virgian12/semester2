import java.util.*;
import java.io.*;

//Mahasiswa


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
 
 public class percobaan3 {
  public static void main(String[] args) throws Exception{
    Mahasiswa dataMhs[] = {new Mahasiswa("05", "Cahya"),new Mahasiswa("04", "Rudi"), 
    new Mahasiswa("01", "Endah"),new Mahasiswa("03", "Rita"),new Mahasiswa("02", "Tika")};
    System.out.println("SEBELUM SORTING");
    System.out.println(Arrays.toString(dataMhs));
    
    Arrays.sort(dataMhs);
    System.out.println("\nSESUDAH SORTING");
    System.out.println(Arrays.toString(dataMhs));
 }
} 
 