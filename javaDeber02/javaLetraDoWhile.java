package javaDeber02;
import java.util.Scanner;

public class javaLetraDoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un Caracter: ");
        char caracterIngresado = scanner.next().charAt(0);

        System.out.println("\nImprimiendo:");

        int i = 0; 
        do {
            int j = 0; 
            do {
                if (i == 0 || i == 4 || j == 2) {
                    System.out.print(caracterIngresado);
                } else {
                    System.out.print(" ");
                }
                j++;
            } while (j < 5);

            System.out.print("   "); 

            int f = 0; 
            do {
                if (i == 0 || i == 2 || f == 0 || ((f == 4) && (i == 1))) {
                    System.out.print(caracterIngresado);
                } else {
                    System.out.print(" ");
                }
                f++;
            } while (f < 5);

            System.out.println(); 
            i++;
        } while (i < 5);
        
        scanner.close();
    }
}
