import java.util.Scanner;

public class LatihanIndividu215 {
    public static void main(String[] args) {
        Scanner scn15 = new Scanner(System.in);
        
        String username = "admin";
        int password = 123;

        System.out.print("Masukkan Username: ");
        String user = scn15.nextLine();
        System.out.print("Masukkan Password: ");
        int pass = scn15.nextInt();

        if (user.equals(username) && pass == password) {
            System.out.println("Selamat Datang!");
        } else {
            System.out.println("Anda tidak valid");
        }

    }
}
