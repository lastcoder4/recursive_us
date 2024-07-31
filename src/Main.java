import java.util.Scanner;

public class Main {
    // Recursive metot tanımı
    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1; // Üs sıfır ise, sonuç 1'dir.
        }
        return base * power(base, exponent - 1); // Recursive çağrı
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan taban ve üs değerlerini alma
        System.out.print("Taban değerini giriniz: ");
        int base = scanner.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int exponent = scanner.nextInt();

        // Sonucu hesaplama ve ekrana yazdırma
        int result = power(base, exponent);
        System.out.println(base + " üzeri " + exponent + " = " + result);
    }
}
