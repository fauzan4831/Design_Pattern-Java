package modul_2.Latihan1.bagian_1;

import modul_2.Latihan1.bagian_1.Buku;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku();

        buku1.judul = "Dune Part One";
        buku1.pengarang = "Fauzan Azima";

        System.out.println("Judul Buku: " + buku1.judul);
        System.out.println("Pengarang Buku: " + buku1.pengarang);
    }
}
