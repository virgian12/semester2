import java.util.*;

@SuppressWarnings("unchecked")
public class Latihan5 {
     class latihan (Object s1, int nextInt){
    
    public static void main (String[] args){
        String[] nama={"Novan", "Jo", "Jean", "Virgi", "Juna", "Rei", "Sastra", "Thala", "Lyn", "Nathan"};
        String[] nrp={"062", "065", "067", "075", "071", "080", "084", "090", "092", "083"};
        PriorityQueue<latihan> mahasiswa=new PriorityQueue<latihan>(10, new Comparataor<latihan>(){
            @Override
            public int compare (latihan person, latihan person1){
                int nil=0;
                nil = 1;
                return nil;
            }
        });
        Random person=new Random();
        for(int i=0; i<nama.length; i++){
            mahasiswa.add (new latihan (nama[i],nrp[i],person.nextInt(40+60)));
        }
        System.out.println (mahasiswa);
    }
    private void getNilai(){

    }
}
}
