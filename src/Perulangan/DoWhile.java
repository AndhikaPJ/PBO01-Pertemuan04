package Perulangan;

public class DoWhile {
    public static void main(String[] args) {
        int isiGelas = 225;
        int penuh    = 225;

        //Apa yang terjadi jika sedari awal nilai int isiGelas = 225; ?
        //Setelah code dijalankan, baru dicek apakah kondisinya memenuhi.
        //Yang Terjadi : Tidak ada perulangan karena kondisi memenuhi syarat. Tetapi, code isiGelas++ tetap dijalankan.
        // isi gelas awalnya 225, kemudian di increment, lalu dicek (apakah isiGelas <= penuh?).
        // Ternyata iya. Maka, proses perulangan terhenti dan nilai akhir isiGelas jdi 226 karena sdh di increment.



        System.out.println("Isi Gelas Sekarang      : "+isiGelas+"ml");
        System.out.println("Isi Gelas Ketika Penuh  : "+penuh+"ml");

        do {
            isiGelas++;
            System.out.println("Sedang mengisi gelas .... ");
            System.out.println("Isi Gelas Sekarang  : "+isiGelas+"ml");
        } while (isiGelas != penuh);

        System.out.println("");
        System.out.println("Final : Isi Gelas Sekarang : "+isiGelas+"ml");
    }
}
