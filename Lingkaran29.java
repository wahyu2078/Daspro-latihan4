import java.util.Scanner;
public class Lingkaran29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        double jari, luas, keliling, phi=3.14;

        System.out.println();
        System.out.println("*** LINGKARAN ***");
        
        System.out.println();
        System.out.print("masukan Jari-Jari = ");
        jari = input.nextDouble();
        
        System.out.print("Luas = ");
        luas = phi * jari * jari;
        System.out.println(luas);

        System.out.print("Keliling = ");
        keliling = 2 * phi*jari ;
        System.out.println(keliling);


    }
}
