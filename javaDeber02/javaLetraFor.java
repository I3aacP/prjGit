package javaDeber02;
import java.util.Scanner;

public class javaLetraFor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un Caracter: ");
        char caracterIngresado = scanner.next().charAt(0);

        System.out.println("\nImprimiendo:");

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4 || j == 2) {
                    System.out.print(caracterIngresado);
                } else {
                    System.out.print(" ");
                }
            }

            System.out.print("   ");


            for (int f = 0; f < 5; f++) {
                if (i == 0 || i == 2 || f == 0 || ((f == 4) && (i == 1))) {
                    System.out.print(caracterIngresado);
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        scanner.close();
    }
}