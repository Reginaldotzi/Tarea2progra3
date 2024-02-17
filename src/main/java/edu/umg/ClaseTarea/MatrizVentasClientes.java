package edu.umg.ClaseTarea;

import java.util.Arrays;
import java.util.Random;

public class MatrizVentasClientes {
    private int[][] matrizVentas;



    // Constructor para inicializar la matriz con números aleatorios
    public MatrizVentasClientes(int filas, int columnas) {
        matrizVentas = new int[filas][columnas];
        Random rand = new Random();

        // Llenar la matriz con números aleatorios
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizVentas[i][j] = rand.nextInt(1000); // Números aleatorios hasta 999
            }
        }
    }



    // Método para imprimir la matriz por filas usando forEach
    public void imprimirMatrizPorFilas() {
        System.out.println("Matriz de Ventas:");
        Arrays.stream(matrizVentas)
                .forEach(row -> System.out.println(Arrays.toString(row)));
    }

    // Método para ordenar los elementos de la matriz por columna
    public void ordenarMatrizPorColumna(int columna) {
        Arrays.sort(matrizVentas, (a, b) -> Integer.compare(a[columna], b[columna]));
    }

    // Método para filtrar elementos de la matriz por un criterio
    public void filtrarMatriz(int criterio) {
        Arrays.stream(matrizVentas)
                .flatMapToInt(Arrays::stream)
                .filter(elemento -> elemento > criterio) // Cambia el criterio según lo que necesites
                .forEach(System.out::println);
    }

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
