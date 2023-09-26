import java.util.Scanner;

public class ifkondisi15 {
    public static void main(String[] args) {
        Scanner sc00 = new Scanner(System.in);

        System.out.println("Masukkan Suhu : ");
        int suhu = sc00.nextInt();

        if (suhu<16) {
            System.out.println("silahkan menggunakan jaket");
        }
        if (suhu<20) {
            System.out.println("silahkan pakai baju tebal");
        }
        else {
            System.out.println("Silahkan pakai topi");
        }
    }
    
}