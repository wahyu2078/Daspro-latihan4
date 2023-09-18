import java.util.Scanner;

public class Segitiga29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // a = Alas
        // c = Tinggi


        double a, b, c, luas, keliling;

        System.out.println();
        System.out.println("*** SEGITIGA ***");

        System.out.println();
        System.out.print("masukan a = ");
        a = input.nextDouble();
        System.out.print("masukan b = ");
        b = input.nextDouble();
        System.out.print("masukan c = ");
        c = input.nextDouble();


        System.out.print("Luas = ");
        luas = a * c /2;
        System.out.println(luas);

        System.out.print("Keliling = ");
        keliling = a+b+c;
        System.out.println(keliling);

    }
}
