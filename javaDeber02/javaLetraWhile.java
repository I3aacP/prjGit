package javaDeber02;
import java.util.Scanner;

public class javaLetraWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un Caracter: ");
        char caracterIngresado = scanner.next().charAt(0);

        System.out.println("\nImprimiendo:");

        int i = 0; 
        while (i < 5) {

            int j = 0; 
            while (j < 5) {
                if (i == 0 || i == 4 || j == 2) {
                    System.out.print(caracterIngresado);
                } else {
                    System.out.print(" ");
                }
                j++;
            }

            System.out.print("   "); 

            int f = 0; 
            while (f < 5) {
                if (i == 0 || i == 2 || f == 0 || ((f == 4) && (i == 1))) {
                    System.out.print(caracterIngresado);
                } else {
                    System.out.print(" ");
                }
                f++;
            }

            System.out.println(); 
            i++;
        }
        scanner.close();
    }
}
