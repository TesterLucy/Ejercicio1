package trabajo.autonomo;

public class Matriz10 {
    
    public static void main(String[] args) {
        
        int[] arreglo = new int[100];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i + 1;
        }
        
        for (int i = arreglo.length - 1; i >= 0; i--) {
            System.out.print(arreglo[i] + " ");

            
            if ((i + 1) % 10 == 0) {
                System.out.println(" - Conteo: " + (i + 1));
            }
        }
    }
}
