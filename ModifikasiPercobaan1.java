import java.util.Scanner;
public class ModifikasiPercobaan1 {
     public static void main(String[] args) {
        Scanner input25 = new Scanner(System.in);
        System.out.println("Masukkan tahun");
        int tahun = input25.nextInt();

        if (tahun % 4 == 0) {
            if (tahun % 100 == 0) {
                if (tahun % 400 == 0) {
                    System.out.println("Tahun kabisat");
                } else {
                    System.out.println("Bukan tahun kabisat");
                }
            } else {
                System.out.println("Tahun kabisat");
            }
        } else {
            System.out.println("Bukan tahun kabisat");
        }

        input25.close();
     }
}