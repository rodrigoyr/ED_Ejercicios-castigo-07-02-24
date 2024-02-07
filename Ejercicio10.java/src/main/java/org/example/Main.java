import java.util.Random;
import java.util.Scanner;

public class MatrizSimetrica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la dimensión de la matriz cuadrada
        System.out.print("Ingrese la dimensión de la matriz cuadrada: ");
        int dimension = scanner.nextInt();

        // Crear y llenar la matriz simétrica
        int[][] matriz = generarMatrizSimetrica(dimension);

        // Imprimir la matriz por pantalla
        imprimirMatriz(matriz);

        // Cerrar el scanner
        scanner.close();
    }

    // Función para generar una matriz cuadrada simétrica con números aleatorios
    public static int[][] generarMatrizSimetrica(int dimension) {
        int[][] matriz = new int[dimension][dimension];
        Random random = new Random();

        for (int i = 0; i < dimension; i++) {
            for (int j = i; j < dimension; j++) {
                int numeroAleatorio = random.nextInt(100);  // Rango de números aleatorios, ajusta según tus necesidades
                matriz[i][j] = numeroAleatorio;
                matriz[j][i] = numeroAleatorio;  // Simetría respecto a la diagonal principal
            }
        }

        return matriz;
    }

    // Función para imprimir una matriz por pantalla
    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz Generada:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
