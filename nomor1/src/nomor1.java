import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TugasAPB2 {
    public static void main(String[] args) {

        System.out.println("masukkan uang kembalian");
        Scanner scanz = new Scanner(System.in);
        int uang = scanz.nextInt();
        int uang10k = uang / 10000;
        uang %= 10000;
        int uang5k = uang / 5000;
        uang %= 5000;
        int uang2k = uang / 2000;
        uang %= 2000;
        int uang1k = uang / 1000;
        System.out.println("uang 1000: " + uang1k);
        System.out.println("uang 2000: " + uang2k);
        System.out.println("uang 5000: " + uang5k);
        System.out.println("uang 10000: " + uang10k);
    }
}
