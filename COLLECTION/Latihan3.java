import java.util.*;

@SuppressWarnings("unchecked")
class Latihan3{
    public static void main(String[] args) {
        ArrayList nama=new ArrayList();
        nama.add(new nama("Budi ", "1312421310"));
        nama.add(new nama("Lia ", "1312421311"));
        nama.add(new nama("Laras ", "1312421312"));
        nama.add(new nama("Putr ", "1312421313"));

        class MahasiswaComparator implements Comparator<nama> {
            public int compare(nama satu, nama dua) {
                return satu.getNrp().compareTo(dua.getNrp());
            }
        }
        System.out.println("Data Mahasiswa : \n"+nama);
        Collections.reverse(nama);
        System.out.println("Data Mahasiswa Reverse : \n"+nama);
        Collections.shuffle(nama,new Random());
        System.out.println("Data Mahasiswa Random : \n"+nama);
        Collections.sort(nama,new MahasiswaComparator());
        System.out.println("Data Mahasiswa Sort : \n"+nama);
    }
}
class nama{
    public String nama,nrp;
    public nama (String nama, String nrp){
        this.nama=nama;
        this.nrp=nrp;
    }
    public String getNrp() {
        return nrp;
    }
    public String toString() {
        return ("Nama : "+nama+  "\tNrp : "+nrp+"\n");
    }
}