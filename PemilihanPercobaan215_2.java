import java.util.Scanner;

public class PemilihanPercobaan215_2 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        System.out.print("Nilau UAS   : ");
        float uas = input15.nextFloat();
        System.out.print("Nilai UTS   : ");
        float uts = input15.nextFloat();
        System.out.print("Nilai Kuis  : ");
        float kuis = input15.nextFloat();
        System.out.print("Nilai Tugas : ");
        float tugas = input15.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak Remidi";

        System.out.println("Nilai Akhir = "+ total + " Sehingga " + message);
        
        String nilaiHuruf;
        String kualifikasi;

        if (total > 80) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat baik";
        }else if (total > 73) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        }else if (total > 65) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        }else if (total > 60) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        }else if (total > 50) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        }else if (total > 39) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        }else {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }

        System.out.println("Nilai Huruf = " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
}
