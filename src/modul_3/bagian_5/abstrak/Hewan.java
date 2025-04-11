package modul_3.bagian_5;

public abstract class Hewan {
    public String nama;

    public void makan() {
        System.out.println(nama + " sedang makan...");
    }

    public abstract void bersuara(); // method abstrak
}
