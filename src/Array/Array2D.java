package Array;

public class Array2D {
    public static void main(String[] args) {
        double[] bobot = new double[4];
        double[][] nilaiMhs = new double [5][30];

        bobot[0] = 10;
        bobot[1] = 10;
        bobot[2] = 10;
        bobot[3] = 10;

        nilaiMhs[0][0] = 80;
        nilaiMhs[1][0] = 90;
        nilaiMhs[2][0] = 75;
        nilaiMhs[3][0] = 70;

        nilaiMhs[4][0] = nilaiMhs[0][0] * bobot[0] + nilaiMhs[1][0] * bobot[1] + nilaiMhs[2][0] * bobot[2] + nilaiMhs[3][0] * bobot[3];

        System.out.println("Nilai Mhs 1 : "+nilaiMhs[4][0]); // Hasilnya 3150. Karena dia akan mengkalkulasi nilaimhs dgn bobot. (80+90+75+70)*10

        nilaiMhs[0][1] = 80;
        nilaiMhs[1][1] = 90;
        nilaiMhs[2][1] = 75;
        nilaiMhs[3][1] = 70;

        nilaiMhs[4][1] = 0;
        for (int i=0; i<3; i++) {
            nilaiMhs[4][1] += nilaiMhs[i][1] * bobot[i];
        }

        System.out.println("Nilai Mhs 2 : "+nilaiMhs[4][1]); // Hasilnya 2450. Karena dia akan melakukan operasi nilaimhs * bobot. dilooping sebanyak 3x. (80+90+75)*10

        double jumlahNA = 0;
        for (int i=0; i<=3; i++) {
            jumlahNA += nilaiMhs[4][1];
        }

        System.out.println("");
        System.out.println("Jumlah Nilai Akhir : "+jumlahNA);
    }
}
