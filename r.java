import java.util.Scanner;

public class BisiestoChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un año: ");
        int año = scanner.nextInt();

        if (esBisiesto(año)) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }

        scanner.close();
    }

    public static boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
}
