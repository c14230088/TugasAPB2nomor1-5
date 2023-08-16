import java.util.Scanner;

public class nomor3 {
    public static void main(String[] args) {
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
    }
}
