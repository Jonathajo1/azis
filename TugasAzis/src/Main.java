import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Fitur Login
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan Password: ");
        String password = scanner.nextLine();

        // Validasi login
        Login login = new Login(username, password);
        if (!login.validate()) {
            System.out.println("Login Gagal! Program Berhenti.");
            return; // Menghentikan program jika login gagal
        }

        System.out.println("Login Berhasil!");

        // Daftar Produk
        Produk[] daftarProduk = new Produk[2];
        daftarProduk[0] = new Produk("Keripik Singkong", 15000.0);
        daftarProduk[1] = new Produk("Keripik Pisang", 12000.0);

        // Menampilkan Daftar Produk
        System.out.println("\n=== Daftar Produk ===");
        for (Produk p : daftarProduk) {
            System.out.println("Nama: " + p.getNama() + " | Harga: Rp " + p.getHarga());
        }

        // Perhitungan Pendapatan
        System.out.print("\nMasukkan jumlah terjual untuk Keripik Singkong: ");
        int jumlahTerjualSingkong = scanner.nextInt();
        double pendapatanSingkong = daftarProduk[0].hitungPendapatan(jumlahTerjualSingkong);
        System.out.println("Pendapatan dari Keripik Singkong: Rp " + pendapatanSingkong);

        // Validasi Diskon
        if (daftarProduk[1].layakDiskon(jumlahTerjualSingkong)) {
            System.out.println("Keripik Pisang memenuhi syarat untuk diskon!");
        } else {
            System.out.println("Keripik Pisang tidak memenuhi syarat untuk diskon.");
        }

        // Contoh penggunaan Inheritance: UMKMKuliner
        UMKMKuliner umkmKuliner = new UMKMKuliner("UMKM Makmur", "Bakso");
        umkmKuliner.displayInfo(); // Menampilkan informasi UMKM
        umkmKuliner.jualMakanan(); // Menampilkan jenis makanan yang dijual

        scanner.close();
    }
}
