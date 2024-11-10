package autonomo;

public class ClaseAbs {

    public static <T> void imprimirArreglo(T[] arreglo) {
        for (T elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
 
        Integer[] arregloEnteros = {1, 2, 3, 4, 5};
        System.out.println("Arreglo de enteros:");
        imprimirArreglo(arregloEnteros);

        
        String[] arregloCadenas = {"Hola,", "Estructura de datos,", "Java"};
        System.out.println("Arreglo de cadenas:");
        imprimirArreglo(arregloCadenas);


        Double[] arregloDecimales = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println("Arreglo de decimales:");
        imprimirArreglo(arregloDecimales);
    }
   
}
