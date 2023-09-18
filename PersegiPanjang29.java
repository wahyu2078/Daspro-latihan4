import java.util.Scanner;

public class PersegiPanjang29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int panjang, lebar, luas, keliling;

        System.out.println();
        System.out.println("*** PERSEGI PANJANG ***");

        System.out.println();
        System.out.print("masukan panjang = ");
        panjang = input.nextInt();
        System.out.print("masukan lebar = ");
        lebar = input.nextInt();

        System.out.print("Luas = ");
        luas = panjang * lebar;
        System.out.println(luas);

        System.out.print("Keliling = ");
        keliling = 2 * (panjang + lebar);
        System.out.println(keliling);

    }
}