package javaDeber02;

public class javaWaitingDoWhile {
    public static void main(String[] args) {
    
        System.out.println("Por favor espera mientras se carga el programa...");
        String[] wait = {"0oo", "o0o", "oo0", "o0o", "0oo"};
        
        int i = 0;
        do {
            
            int j = 0;
            do {
                System.out.print("\r" + wait[j]);
                try {                              
                    Thread.sleep(300);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                } 
                j++;
            } while (j < wait.length);
            i++;
        } while (i < 10);       

        System.out.println("\rExitoso");
        System.out.println("Programa cargado correctamente");

    }
}
