package Perulangan;

public class DoWhile {
    public static void main(String[] args) {
        int isiGelas = 226;
        int penuh    = 225;

        // Apa yang terjadi jika sedari awal nilai int isiGelas = 225; ?
        // Akan dilakukan perulangan, karena kondisinya bernilai true.
        // Walapun kondisinya false, isiGelas akan tetap ditambah.
        // Karena DoWhile pd saat compile, dia akan eksekusi kode baru di cek kondisinya.
        // berhubung ada perintah increment, jd hasil akhir bakal ada ketambahan nilai.
        // value penuh = 225 menjadi batas nilai yg akan di increment, jika value isiGelas > value penuh
        // Maka hasilnya akan looping sebanyak ~

        System.out.println("Isi Gelas Sekarang      : "+isiGelas+"ml");
        System.out.println("Isi Gelas Ketika Penuh  : "+penuh+"ml");

        do {
            isiGelas++;
            System.out.println("Sedang mengisi gelas .... ");
            System.out.println("Isi Gelas Sekarang  : "+isiGelas+"ml");
        } while (isiGelas <= penuh);

        System.out.println("");
        System.out.println("Final : Isi Gelas Sekarang : "+isiGelas+"ml");
    }
}
