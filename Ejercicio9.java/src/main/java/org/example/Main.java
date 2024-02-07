import java.util.Scanner;

public class ProductoEscalar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario las dimensiones de los vectores
        System.out.print("Ingrese la dimensión de los vectores: ");
        int dimension = scanner.nextInt();

        // Crear los dos vectores y solicitar al usuario sus elementos
        int[] vector1 = new int[dimension];
        int[] vector2 = new int[dimension];

        System.out.println("Ingrese los elementos del primer vector:");
        ingresarVector(scanner, vector1);

        System.out.println("Ingrese los elementos del segundo vector:");
        ingresarVector(scanner, vector2);

        // Calcular y mostrar el producto escalar
        int resultado = calcularProductoEscalar(vector1, vector2);
        System.out.println("El producto escalar de los dos vectores es: " + resultado);

        // Cerrar el scanner
        scanner.close();
    }

    // Función para ingresar los elementos de un vector desde el teclado
    public static void ingresarVector(Scanner scanner, int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }
    }

    // Función para calcular el producto escalar de dos vectores
    public static int calcularProductoEscalar(int[] vector1, int[] vector2) {
        if (vector1.length != vector2.length) {
            System.out.println("Los vectores deben tener la misma dimensión.");
            return 0;
        }

        int productoEscalar = 0;
        for (int i = 0; i < vector1.length; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }

        return productoEscalar;
    }
}
