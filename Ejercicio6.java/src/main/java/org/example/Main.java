public class NumerosPrimos {

    public static void main(String[] args) {
        int N = 10;  // Puedes cambiar este valor según tus necesidades

        // Obtener los N primeros números primos
        int[] primos = obtenerNumerosPrimos(N);

        // Imprimir la lista de números primos por pantalla
        System.out.println("Los primeros " + N + " números primos son:");
        for (int primo : primos) {
            System.out.print(primo + " ");
        }
    }

    // Función para obtener los N primeros números primos
    public static int[] obtenerNumerosPrimos(int N) {
        int[] primos = new int[N];
        int contador = 0;
        int numero = 2;  // Comenzamos desde el primer número primo

        while (contador < N) {
            if (esPrimo(numero)) {
                primos[contador] = numero;
                contador++;
            }
            numero++;
        }

        return primos;
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
