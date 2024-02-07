public class SumaMultiplosDe5 {

    public static void main(String[] args) {
        int begin = 1;
        int end = 100;

        // Obtener array de múltiplos de 5
        int[] multiplosDe5 = obtenerMultiplosDe5(begin, end);

        // Imprimir los múltiplos de 5
        System.out.println("Múltiplos de 5 entre " + begin + " y " + end + ": ");
        imprimirArray(multiplosDe5);

        // Calcular y mostrar la suma de los múltiplos de 5
        int suma = calcularSumaArray(multiplosDe5);
        System.out.println("Suma de los múltiplos de 5: " + suma);
    }

    // Función para obtener los múltiplos de 5 en un rango
    public static int[] obtenerMultiplosDe5(int begin, int end) {
        int count = 0;
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                count++;
            }
        }

        int[] multiplosDe5 = new int[count];
        int index = 0;
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                multiplosDe5[index] = i;
                index++;
            }
        }
        return multiplosDe5;
    }

    // Función para imprimir un array
    public static void imprimirArray(int[] array) {
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

    // Función para calcular la suma de los elementos de un array
    public static int calcularSumaArray(int[] array) {
        int suma = 0;
        for (int valor : array) {
            suma += valor;
        }
        return suma;
    }
}
