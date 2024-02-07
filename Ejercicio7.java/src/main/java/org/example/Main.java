import java.util.Scanner;

public class FactoresPrimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer un número entero desde el teclado
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Obtener los factores primos del número
        int[] factoresPrimos = descomponerEnFactoresPrimos(numero);

        // Imprimir los factores primos por pantalla
        System.out.print("Los factores primos de " + numero + " son: ");
        for (int factorPrimo : factoresPrimos) {
            System.out.print(factorPrimo + " ");
        }

        // Cerrar el scanner
        scanner.close();
    }

    // Función para descomponer un número en factores primos
    public static int[] descomponerEnFactoresPrimos(int numero) {
        int[] factoresPrimos = new int[10];  // Asumimos que no habrá más de 10 factores primos
        int indice = 0;

        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                factoresPrimos[indice] = i;
                indice++;
                numero /= i;
            }
        }

        return factoresPrimos;
    }
}
