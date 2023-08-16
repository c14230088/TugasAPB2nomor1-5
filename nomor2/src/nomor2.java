import java.util.Scanner;

public class nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("percepatan: ");
        int percepatan = input.nextInt();
        System.out.println("waktu : ");
        int waktu = input.nextInt();
        System.out.println("jumlah bensin tiap meter: ");
        int bensinmeter = input.nextInt();

        double jarak =0 * waktu + 1.0/2.0 * percepatan * waktu * waktu;
        System.out.println("jarak: " +jarak);

        double konsumsi = jarak * bensinmeter;
        System.out.println("konsumsi: " +konsumsi);
    }
}
