package edu.umg;

import edu.umg.ClaseTarea.MatrizVentasClientes;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de MatrizVentasClientes
        MatrizVentasClientes matriz = new MatrizVentasClientes(5, 12); // 5 filas, 12 columnas

        // Imprimir la matriz por filas
        matriz.imprimirMatrizPorFilas();

        // Ordenar los elementos de la matriz por una columna (por ejemplo, la primera columna)
        matriz.ordenarMatrizPorColumna(0);

        // Imprimir la matriz ordenada por la primera columna
        System.out.println("\nMatriz ordenada por la primera columna:");
        matriz.imprimirMatrizPorFilas();

        // Filtrar elementos de la matriz por un criterio (por ejemplo, mayores que 500)
        System.out.println("\nElementos de la matriz mayores que 500:");
        matriz.filtrarMatriz(500);
    }
}
