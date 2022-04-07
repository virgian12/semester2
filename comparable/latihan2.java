import java.util.Arrays;
import java.util.Comparator;

class IPKComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) { 
        Mahasiswa m1 = (Mahasiswa) o1;
        Mahasiswa m2 = (Mahasiswa) o2;
        return m1.getIPK().compareTo(m2.getIPK());
    }
}

class Mahasiswa implements Comparable {
    private String nrp ;
    private String nama ;
    private String IPK;
    public Mahasiswa(String nrp, String nama, String IPK) {
        this.nrp = nrp;
        this.nama = nama;
        this.IPK = IPK;
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
    public String getIPK() {
        return IPK;
    }
    public void setIPK(String IPK) {
        this.IPK = IPK;
    }
    @Override
    public String toString() {
        return "NRP\t:"+nrp+"\t\tNama\t: "+nama+"\t\tIPK\t: "+IPK+"\n";
    }
    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

@SuppressWarnings("unchecked")
class latihan2 {
    public static void main(String[] args) {
        Mahasiswa dataMhs[] = {
        new Mahasiswa("05", "Chaya","3.56"),
        new Mahasiswa("04", "Rudi","3.8"),
        new Mahasiswa("01", "Endah","3.76"),
        new Mahasiswa("03", "Rita","3.87"),
        new Mahasiswa("02", "Tika","3.88")};
        System.out.println("SEBELUM SORTING");
        System.out.println(Arrays.toString(dataMhs));
        Arrays.sort(dataMhs, new IPKComparator());
        System.out.println("\nSESUDAH SORTING");
        System.out.println(Arrays.toString(dataMhs));
    }
}
