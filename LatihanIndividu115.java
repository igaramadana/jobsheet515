import java.util.Scanner;

public class LatihanIndividu115 {

    public static void main(String[] args) {
        Scanner scn15 = new Scanner(System.in);

        int jarak;

        System.out.println("Masukkan Jarak: ");
        jarak = scn15.nextInt();

        if (jarak <=5) {
            System.out.println("gunakan senjata melee weapon");
        } else {
            System.out.println("gunakan senjata range weapon");
        }
    }
}