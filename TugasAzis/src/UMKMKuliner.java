public class UMKMKuliner extends UMKM {
    private String jenisMakanan;

    // Constructor yang memanggil constructor superclass
    public UMKMKuliner(String namaUMKM, String jenisMakanan) {
        super(namaUMKM);
        this.jenisMakanan = jenisMakanan;
    }

    // Method untuk menjual makanan
    public void jualMakanan() {
        System.out.println("Menjual: " + jenisMakanan);
    }
}
