import java.util.Scanner;

public class nomor5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double X = input.nextDouble();
        double ln = Math.log(X);
        double C = 0.1*0.1*0.1 * X * X -5 * ln + 60;
        System.out.println(C);
    }
}
