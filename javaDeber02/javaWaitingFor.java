package javaDeber02;

public class javaWaitingFor {
    public static void main(String[] args) {

        System.out.println("Por favor espera mientras se carga el programa...");

        String[] wait = {"0oo", "o0o", "oo0", "o0o", "0oo"};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < wait.length; j++) {
                System.out.print("\r" + wait[j]);
                try {                                   //? Obligatorio try-catch para manejar la excepción InterruptedException
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
