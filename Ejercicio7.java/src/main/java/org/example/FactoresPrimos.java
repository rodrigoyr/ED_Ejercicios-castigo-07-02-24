import java.util.Scanner;

public class FactoresPrimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer un número entero desde el teclado
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Obtener los factores primos del número
        String resultado = descomponerEnFactoresPrimos(numero);

        // Imprimir el resultado por pantalla
        System.out.println(resultado);

        // Cerrar el scanner
        scanner.close();
    }

    // Función para descomponer un número en factores primos y devolver el resultado como cadena
    public static String descomponerEnFactoresPrimos(int numero) {
        StringBuilder resultado = new StringBuilder();
        resultado.append(numero).append(" = ");

        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                resultado.append(i);
                resultado.append(" * ");
                numero /= i;
            }
        }

        // Eliminar el último "* " sobrante
        if (resultado.length() >= 3) {
            resultado.setLength(resultado.length() - 3);
        }

        return resultado.toString();
    }
}
