package ui;

import java.util.Scanner; // Importar Scanner
import model.Controller;


public class Executable {

    //private Scanner reader;
    private Controller cont;
    private Scanner escaner; // Ponner Scanner como atributo

    /**
     * Constructor de la clase Executable para inicializar el lector de entrada y el
     * controlador.
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Executable y se inicializan el lector de
     *       entrada y el controlador.
     */
    public Executable() {
        //reader = new Scanner(System.in);
        cont = new Controller();
        escaner = new Scanner(System.in); // Inicializar Scanner
    }

    /**
     * Ejecuta el programa principal de gestión de colegios.
     *
     * @pre El método debe ser llamado dentro de un contexto válido.
     * @post El programa se ejecuta y permite al usuario interactuar con las
     *       opciones disponibles.
     * @return void Este método no retorna ningún valor.
     */

    public void run() {

         System.out.println("Bienvenido. Vamos a crear dos matrices.");
    System.out.print("Ingrese la cantidad de filas: ");
    int filas = escaner.nextInt();
    escaner.nextLine();

    System.out.print("Ingrese la cantidad de columnas: ");
    int columnas = escaner.nextInt();
    escaner.nextLine();

    cont.inicializarMatrices(filas, columnas); // <--- lo agregaremos en Controller

    System.out.println("\nInserte los números de la matriz 1:");
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            System.out.print("Fila " + i + ", Columna " + j + ": ");
            int valor = escaner.nextInt();
            escaner.nextLine();
            cont.getMatriz1().insertarValor(i, j, valor);
        }
    }

    System.out.println("\nInserte los números de la matriz 2:");
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            System.out.print("Fila " + i + ", Columna " + j + ": ");
            int valor = escaner.nextInt();
            escaner.nextLine();
            cont.getMatriz2().insertarValor(i, j, valor);
        }
    }

    System.out.println("\nResultado de la suma de ambas matrices:");
    int[][] suma = cont.sumarMatrices().getMatriz();
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            System.out.print(suma[i][j] + " ");
        }
        System.out.println();
    }


    }

    /**
     * Método principal (main) para iniciar la ejecución del programa.
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Executable y se ejecuta el programa principal.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este
     *             caso).
     */
    public static void main(String[] args) {

        Executable mainApp = new Executable();
        mainApp.run();

    }

}