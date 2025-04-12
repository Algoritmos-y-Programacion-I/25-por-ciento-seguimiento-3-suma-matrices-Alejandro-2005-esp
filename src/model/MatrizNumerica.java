package model;

public class MatrizNumerica {

    private int[][] matriz; // Declaro
    private int cantFilas;
    private int cantColumnas;

    public MatrizNumerica(int filas, int columnas) {
        cantFilas = filas;
        cantColumnas = columnas;
        this.matriz = new int[filas][columnas]; // Inicializo
    }

    public void insertarValor(int i, int j, int valor) {
        matriz[i][j] = valor;
    }

    public int[][] getMatriz() {
        return matriz;
    }
    public MatrizNumerica sumar(MatrizNumerica otra) {
    if (this.cantFilas != otra.cantFilas || this.cantColumnas != otra.cantColumnas) {
        throw new IllegalArgumentException("Las matrices deben tener el mismo tamaño.");
    }

    MatrizNumerica resultado = new MatrizNumerica(cantFilas, cantColumnas);
    for (int i = 0; i < cantFilas; i++) {
        for (int j = 0; j < cantColumnas; j++) {
            int suma = this.matriz[i][j] + otra.matriz[i][j];
            resultado.insertarValor(i, j, suma);
        }
    }
    return resultado;
}


}