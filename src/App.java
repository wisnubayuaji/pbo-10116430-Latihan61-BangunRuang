/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */

public class App {
    public static void main(String[] args) throws Exception {

        Bola b = new Bola();
        //b.jari = 7;
        b.volume();
        b.bola();
        
        Tabung t = new Tabung();
        //t.jari = 10;
        //t.tinggi = 21;
        t.volume();
        t.tabung();

        Kerucut k = new Kerucut();
        //k.jari = 14;
        //k.tinggi = 9;
        k.volume();
        k.kerucut();
    }
}
