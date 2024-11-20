public class Produk {
    private String nama;
    private double harga;

    // Constructor untuk menginisialisasi nama dan harga produk
    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Getter untuk nama produk
    public String getNama() {
        return nama;
    }

    // Getter untuk harga produk
    public double getHarga() {
        return harga;
    }

    // Method untuk menghitung total pendapatan berdasarkan jumlah yang terjual
    public double hitungPendapatan(int jumlahTerjual) {
        return harga * jumlahTerjual; // Operator Aritmatika
    }

    // Method untuk memeriksa apakah produk layak mendapat diskon
    public boolean layakDiskon(int jumlahTerjual) {
        return jumlahTerjual > 50 && harga > 10000; // Operator Logika
    }
}
