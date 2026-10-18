package javaDeber02;

public class javaSpinnerDoWhile {
    public static void main(String[] args) {
    
        System.out.println("Por favor espera mientras se carga el programa...");

        char[] spinner = {'|', '/', '-', '\\'};
        int i = 0;
        do {
            for (int j = 0; j < spinner.length; j++) {
                System.out.print("\r" + spinner[j]);
                try {                              
                    Thread.sleep(300);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                } 
            }
            i++;
        } while (i < 10);       

        System.out.println("\rExitoso");
        System.out.println("Programa cargado correctamente");

    }
}
