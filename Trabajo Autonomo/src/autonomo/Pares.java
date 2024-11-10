package trabajo.autonomo;

import java.util.Scanner;

public class Pares {


    public static void main(String[] args) {
      
      
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIngrese un número");
        int p=scanner.nextInt();
        System.out.println("\nIngrese un número");
        int q=scanner.nextInt();
        System.out.println("Números pares entre " + p + " y " + q + ":");
        for (int i = p; i <= q; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}