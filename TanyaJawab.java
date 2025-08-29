import java.util.Random;
import java.util.Scanner;

public class TanyaJawab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // input kalimat
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = scanner.nextLine();

        // hitung panjang dari kalimat
        int length = kalimat.length();

        // generate random indeks
        int startIndex = random.nextInt(length);
        int endIndex = random.nextInt(length - startIndex) + startIndex + 1;

        // simpan jawaban benar 
        String correct = kalimat.substring(startIndex, endIndex);

        // pertanyaan 
        System.out.print("Apa substring dari indeks " + startIndex + " hingga " + (endIndex-1) + "? ");
        String answer = scanner.nextLine();

        // check jawaban
        if (answer.equals(correct)) {
            System.out.println("\u2714 Benar! Keren, kamu jago string!");
        } else {
            System.out.println("\u2718 Kurang tepat. Jawaban yang benar: " + correct);
        }

        scanner.close();
    }
}
