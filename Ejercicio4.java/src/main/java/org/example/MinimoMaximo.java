import java.util.Scanner;

public class MinimoMaximo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializar variables para el mayor y el menor
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        // Solicitar números al usuario hasta que se ingrese un número negativo
        int numero;
        do {
            numero = solicitarNumero();

            // Actualizar mayor y menor si es necesario
            if (numero >= 0) {
                mayor = Math.max(mayor, numero);
                menor = Math.min(menor, numero);
            }
        } while (numero >= 0);

        // Imprimir resultados
        if (mayor != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
            System.out.println("El número mayor es: " + mayor);
            System.out.println("El número menor es: " + menor);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        // Cerrar el scanner
        scanner.close();
    }

    // Función para solicitar un número al usuario
    public static int solicitarNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número (negativo para finalizar): ");
        return scanner.nextInt();
    }
}
