import java.util.Scanner;

public class MinimoMaximo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializar minimo y maximo con el primer número ingresado
        int numero = solicitarNumero();
        int minimo = numero;
        int maximo = numero;

        // Continuar ingresando números hasta que se introduzca un número negativo
        while (numero >= 0) {
            // Actualizar minimo y maximo si es necesario
            if (numero < minimo) {
                minimo = numero;
            }
            if (numero > maximo) {
                maximo = numero;
            }

            // Solicitar otro número
            numero = solicitarNumero();
        }

        // Imprimir resultados
        System.out.println("El mínimo es: " + minimo);
        System.out.println("El máximo es: " + maximo);

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
