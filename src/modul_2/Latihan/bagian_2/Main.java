package modul_2.Latihan1.bagian_2;

import modul_2.latihan.bagian_2.Lingkaran;

public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.jarijari1 = 180;
        lingkaran.jarijari2 = 180;

        System.out.println("Jari jari lingkaran tersebut= " + lingkaran.luas());
    }
}
