package modul_3.latihan.latihan_4;

public class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
}
