import java.util.Scanner;

public class EstadisticasArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recibir números enteros hasta que se introduzca 0
        int[] numeros = recibirNumeros(scanner);

        // Calcular y mostrar la media, el mínimo y el máximo
        double media = calcularMedia(numeros);
        int minimo = calcularMinimo(numeros);
        int maximo = calcularMaximo(numeros);

        System.out.println("Media: " + media);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Máximo: " + maximo);

        // Cerrar el scanner
        scanner.close();
    }

    // Función para recibir números enteros hasta que se introduce 0
    public static int[] recibirNumeros(Scanner scanner) {
        System.out.println("Introduce números enteros (0 para finalizar):");

        int[] numeros = new int[100]; // Asumimos que no se ingresarán más de 100 números
        int indice = 0;

        int numero;
        do {
            numero = scanner.nextInt();
            numeros[indice] = numero;
            indice++;
        } while (numero != 0);

        // Redimensionar el array al tamaño real
        int[] resultado = new int[indice];
        System.arraycopy(numeros, 0, resultado, 0, indice);

        return resultado;
    }

    // Función para calcular la media de los elementos de un array
    public static double calcularMedia(int[] numeros) {
        if (numeros.length == 0) {
            return 0;
        }

        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }

        return (double) suma / numeros.length;
    }

    // Función para calcular el mínimo de los elementos de un array
    public static int calcularMinimo(int[] numeros) {
        if (numeros.length == 0) {
            return 0;
        }

        int minimo = numeros[0];
        for (int numero : numeros) {
            if (numero < minimo) {
                minimo = numero;
            }
        }

        return minimo;
    }

    // Función para calcular el máximo de los elementos de un array
    public static int calcularMaximo(int[] numeros) {
        if (numeros.length == 0) {
            return 0;
        }

        int maximo = numeros[0];
        for (int numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
        }

        return maximo;
    }
}
