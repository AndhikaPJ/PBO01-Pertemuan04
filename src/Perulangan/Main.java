package Perulangan; //Contoh Perulangan While

public class Main {
    public static void main(String[] args) {
        int isiGelas = 225;
        int penuh    = 225;

        // Apa yang terjadi jika sedari awal nilai int isiGelas = 225; ?
        // Akan Melakukan Perulangan karena kondisi isiGelas <= penuh terpenuhi.
        // Maka hasil akhir isiGelas menjadi 226 karena di increment.

        System.out.println("Isi Gelas Sekarang : "+isiGelas+"ml");
        System.out.println("Isi Gelas Ketika Penuh : "+penuh+"ml");

        while (isiGelas <= penuh) {
            isiGelas++;
            System.out.println("Sedang mengisi gelas ....");
            System.out.println("Isi gelas sekarang : "+isiGelas+"ml");
        }

        System.out.println("Final : Isi Gelas Sekarang : "+isiGelas+"ml");
    }
}
