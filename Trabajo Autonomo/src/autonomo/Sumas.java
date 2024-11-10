package trabajo.autonomo;

import java.util.Scanner;


public class Sumas {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite un numero");
        int m = scanner.nextInt(); 
        System.out.println("Digite un numero");
        int n = scanner.nextInt(); 

        int suma = 0;

        System.out.println("Suma de los primeros " + m + " múltiplos de 7 más los primeros " + n + " múltiplos de 9:");
        for (int i = 1; i <= m + n; i++) {
            if (i <= m) {
                suma += 7 * i;
            }
            if (i <= n) {
                suma += 9 * i;
            }
        }

        System.out.println("La suma es: " + suma);
    }
}



