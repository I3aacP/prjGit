package javaDeber02;

public class javaWaitingWhile {
    public static void main(String[] args) {
    
        System.out.println("Por favor espera mientras se carga el programa...");
        String[] wait = {"0oo", "o0o", "oo0", "o0o", "0oo"};
        
        int i = 0;
        while (i < 10) {
            
            int j = 0;
            while (j < wait.length) {
                System.out.print("\r" + wait[j]);
                try {                              
                    Thread.sleep(300);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                } 
                j++;
            }
            i++;
        }       

        System.out.println("\rExitoso");
        System.out.println("Programa cargado correctamente");

    }
}
