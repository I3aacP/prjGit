package javaDeber02;

public class javaSpinnerFor {
    public static void main(String[] args) {
    
        System.out.println("Por favor espera mientras se carga el programa...");

        char[] spinner = {'|', '/', '-', '\\'};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < spinner.length; j++) {
                System.out.print("\r" + spinner[j]);
                try {                               //? Obligatorio try-catch para manejar la excepción InterruptedException
                    Thread.sleep(300);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                } 
            }
        }       

        System.out.println("\rExitoso");
        System.out.println("Programa cargado correctamente");

    }
}