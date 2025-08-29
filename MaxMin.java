
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //input value a,b,c,d
        System.out.println("Silahkan input 4 bilangan bulat");

        System.out.print("a: ");
        int a = scanner.nextInt();

        System.out.print("b: ");
        int b = scanner.nextInt();

        System.out.print("c: ");
        int c = scanner.nextInt();

        System.out.print("d: ");
        int d = scanner.nextInt();

        // inisiasi sementara
        int max = a;
        String varMax = "a";

        int min = a;
        String varMin = "a";

        // compare dengan b
        if (b < min) {
            min = b;
            varMin = "b";
        }
        if (b > max) {
            max = b;
            varMax = "b";
        }
        
        // compare dengan c
        if (c < min) {
            min = c;
            varMin = "c";
        }
        if (c > max) {
            max = c;
            varMax = "c";
        }
        
        // compare dengan d
        if (d < min) {
            min = d;
            varMin = "d";
        }
        if (d > max) {
            max = d;
            varMax = "d";
        }

        // hasil
        System.out.println("nilai terbesar adalah " + max + " yaitu variabel " + varMax);
        System.out.println("nilai terkecil adalah " + min + " yaitu variabel " + varMin);

        scanner.close();
    }
}
