package modul_3.bagian_3.latihan.bagian_2;

public class Main {
    public static void main(String[] args) {
        Motor motor1 = new Motor();
        motor1.setMerk("Toyota");
        motor1.setTahun(2020);

        System.out.println("Nama : " + motor1.getMerk());
        System.out.println("Tahun terbit : " + motor1.getTahun());
    }
}
