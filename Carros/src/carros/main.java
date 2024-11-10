package carros;

import java.util.Scanner;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a;
        System.out.println("Cuantos autos desea ingresar: ");
        a = teclado.nextInt();
        Autos test1 = new Autos(a,6);
        test1.asignarDatos();
        test1.Menu();
    }
}