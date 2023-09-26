import java.util.Scanner;

public class PemilihanPercobaan1_15 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        System.out.println("Masukkan Angka: ");
        int angka = input15.nextInt();


        String message = angka % 2 == 0 ? " Bilangan Genap" : " Bilangan Ganjil";

        System.out.println("angka " +angka +message);
    }
}
