import java.util.Scanner;

public class nomor4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Jarak siswa ke tiang: ");
        double jsiswa = input.nextDouble();

        System.out.println("Tinggi mahasiswa: ");
        double hsiswa = input.nextDouble();

        System.out.println("Sudut: ");
        double sudut = input.nextDouble();
        double radian = Math.toRadians(sudut);
        double sudutjadi = Math.tan(radian);

        double y = sudutjadi * jsiswa;
        double htiang = hsiswa + y;

        System.out.println("Tinggi tiang: " +htiang);
    }
}
