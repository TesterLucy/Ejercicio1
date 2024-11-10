package carros;

import java.util.Scanner;
public class Autos {
    private int ancho;
    private int filas=6;
    private String tabal[][];
    private Scanner teclado;
    
    //    á = \u00E1
    //    é = \u00E9
    //    í = \u00ED
    //    ó = \u00F3
    //    ú = \u00FA
    
    public Autos(int filas, int ancho){
        this.filas = filas;
        this.ancho = ancho;
        tabal = new String[filas][ancho];
        teclado = new Scanner(System.in, "ISO-8859-1");
    }
    
    public void Menu(){
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("Seleccione la tarea que desea realizar:");
            System.out.println("1. Para mostrar la tabla");
            System.out.println("2. Para Mostrar los autos más baratos de cada año");
            System.out.println("3. Para hacer un promedio de precios para un año especifico");
            System.out.println("4. Para salir");
            System.out.print("Ingrese su opción: ");

            // Leer la opción del usuario
            opcion = teclado.nextInt();

            // Realizar acciones según la opción elegida
            switch (opcion) {
                case 1:
                    System.out.println("");
                    mostrarTabla();
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    valorPequeño();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    promedio();
                    System.out.println("");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        } while (opcion != 4);
        System.out.println("Programa Finalizado...");
    }
    
    public void asignarDatos(){
        for (int i = 0; i < tabal.length; i++) {
            for (int j = 0; j < ancho; j++) {
                if (j==0) {
                    char nConTilde = 241;
                    System.out.println("Introduzca la Marca del vehículo #"+(i+1));
                }
                else{
                    System.out.println("Ingrese el valor del vehículo en el año "+(2018+j));
                }
                
                tabal[i][j] = teclado.nextLine();
                while(j>0 && Integer.parseInt(tabal[i][j])<=0){
                    System.out.println("Ingresa un número válido (mayor a 0)");
                    tabal[i][j]=teclado.nextLine();
                    }
                }
            }
        }

    public void mostrarTabla() {
        
    String [] elementos={"Marca","2019","2020","2021","2022","2023"};
    int maxLongitud = 0;
    
    
    for (int i = 0; i < tabal.length; i++) {
        for (int j = 0; j < ancho; j++) {
            int longitud = String.valueOf(tabal[i][j]).length();
            if (longitud > maxLongitud) {
                maxLongitud = longitud;
            }
        }
    }
    
    for (int i = 0; i < elementos.length; i++) {
            System.out.print(String.format("%-" + maxLongitud + "s", elementos[i]) + "\t");
        }
        System.out.println("");

    for (int i = 0; i < tabal.length; i++) {
        for (int j = 0; j < ancho; j++) {
            System.out.print(String.format("%-" + maxLongitud + "s", tabal[i][j]) + "\t");
        }
        System.out.println();
    }
}
    
    public void valorPequeño(){
        int filas1 = tabal.length;
        int columnas = tabal[0].length;
        
        for (int j = 1; j < columnas; j++) {
            int minimo = Integer.parseInt(tabal[0][j]);
            String filaMinimo = tabal[0][0];
            for (int i = 1; i < filas1; i++) {
                if (Integer.parseInt(tabal[i][j]) < minimo) {
                    minimo = Integer.parseInt(tabal[i][j]);
                    filaMinimo = tabal[i][0];
                }
            }
            System.out.println(filaMinimo +" es el auto más barato del año " + (2018 + j) + " costando: " + minimo);
        }
    }
    
    public void promedio(){
        System.out.println("Ingrese el año del cual desea sacar el promedio de los autos entre 30000000 y 50000000 ");
        int columnaSeleccionada = teclado.nextInt();
        while(columnaSeleccionada<2019||columnaSeleccionada>2023){
                System.out.println("Ingrese un valor válido (entre 2019 y 2023)");
                columnaSeleccionada=teclado.nextInt();
            }
        columnaSeleccionada=columnaSeleccionada-2017;
        
        int suma = 0;
        int contador = 0;

        for (int i = 0; i < tabal.length; i++) {
            if (Integer.parseInt(tabal[i][columnaSeleccionada]) >= 30000000 && Integer.parseInt(tabal[i][columnaSeleccionada]) <= 50000000) {
                suma += Integer.parseInt(tabal[i][columnaSeleccionada]);
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("No hay valores entre " + 30000000 + " y " + 50000000 + " en la columna seleccionada.");
        } else {
            int promedio = suma / contador;
            System.out.println("Hay un total de "+contador+" autos que valen entre " + 30000000 + " y " + 50000000 + " durante el año "+(columnaSeleccionada+2017)+", su suma total es: "+suma+" y su promedio es: " + promedio);
        }
    }
}
