package modul_3.bagian_5.abstrak;

public class Main {
    public  static void main(String[] args) {
        Hewan kucing = new Kucing();
        kucing.nama = "Muhammad Sumbul";
        kucing.makan(); // Method konkret dari abstract class
        kucing.bersuara(); // Method abstrak yang di-override

        Hewan anjing = new Anjing();
        anjing.nama = "Doggy";
        anjing.makan(); // Method konkret dari abstract class
        anjing.bersuara(); // Method abstrak yang di-override
    }
}
