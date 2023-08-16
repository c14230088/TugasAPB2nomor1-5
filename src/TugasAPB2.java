import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TugasAPB2 {
    public static void main(String[] args) {
// nomor 1//
        /*
        System.out.println("masukkan uang kembalian");
        Scanner scanz = new Scanner(System.in);
        int uang = scanz.nextInt();
        int uang10k = uang/10000;
        uang %=10000;
        int uang5k = uang/5000;
        uang %= 5000;
        int uang2k = uang/2000;
        uang %= 2000;
        int uang1k = uang/1000;
        System.out.println("uang 1000: " +uang1k);
        System.out.println("uang 2000: " +uang2k);
        System.out.println("uang 5000: " +uang5k);
        System.out.println("uang 10000: " +uang10k);
*/

//nomor 2//
/*
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
*/

//nomor3//
/*
        Scanner input = new Scanner(System.in);
        System.out.println("jam awal: ");
        int jamwal = input.nextInt() * 60;
        System.out.println("menit awal : ");
        int menwal = input.nextInt();
        System.out.println("jam akhir : ");
        int jamkir = input.nextInt() * 60;
        System.out.println("menit akhir: ");
        int menkir = input.nextInt();

        double menitlalu = (jamkir + menkir)-(jamwal + menwal);
        int jamlalu = (int) (menitlalu/60);
        int waktulalu =(int) menitlalu%60;
        System.out.println(jamlalu +":" +waktulalu);

*/

//nomor4//
/*
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
*/

        //nomor 5//
/*
        Scanner input = new Scanner(System.in);
        double X = input.nextDouble();
        double ln = Math.log(X);
        double C = 0.1*0.1*0.1 * X * X -5 * ln + 60;
        System.out.println("C=" +C);

*/
    }
}
