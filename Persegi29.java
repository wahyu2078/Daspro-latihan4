import java.util.Scanner;

public class Persegi29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sisi, luas, keliling;

        System.out.println();
        System.out.println("*** PERSEGI ***");
        System.out.println();
        System.out.print("masukan sisi = ");
        sisi = input.nextInt();

        System.out.print("Luas = ");
        luas = sisi * sisi;
        System.out.println(luas);

        System.out.print("Keliling = ");
        keliling = 4 * sisi;
        System.out.println(keliling);

    }
}