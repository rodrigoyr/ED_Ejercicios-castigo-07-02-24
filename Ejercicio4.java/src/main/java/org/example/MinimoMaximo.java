import java.util.Scanner;

public class MinimoMaximo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        System.out.println("Ingresa una lista de números (termina con un número negativo):");

        while (true) {
            int numero = solicitarNumero();

            // Verificar si se ingresó un número negativo para terminar el bucle
            if (numero < 0) {
                break;
            }

            // Actualizar máximo y mínimo
            maximo = Math.max(maximo, numero);
            minimo = Math.min(minimo, numero);
        }

        // Imprimir resultados
        if (maximo != Integer.MIN_VALUE && minimo != Integer.MAX_VALUE) {
            System.out.println("El número máximo es: " + maximo);
            System.out.println("El número mínimo es: " + minimo);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        // Cerrar el scanner
        scanner.close();
    }

    // Función para solicitar un número al usuario
    public static int solicitarNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        return scanner.nextInt();
    }
}
