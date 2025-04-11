package modul_2.latihan.bagian_5;

public class Barang {
    String namaBarang;
    int Harga;

    public Barang() {
        namaBarang = "Samsung Galaxy S25 Ultra";
        Harga = 26000000;
    }

    public Barang(String namaBarang, int harga) {
        this.namaBarang = namaBarang;
        Harga = harga;
    }

    // Method
    public void tampilkanInfo() {
        System.out.println("Nama barang: " + namaBarang);
        System.out.println("Harga: " + Harga);
    }
}
