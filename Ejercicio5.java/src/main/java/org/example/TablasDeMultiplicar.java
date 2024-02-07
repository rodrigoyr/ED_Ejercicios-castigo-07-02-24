public class TablasDeMultiplicar {

    public static void main(String[] args) {
        int n = 10;

        // Obtener las tablas de multiplicar para los primeros n números
        int[][] tablas = obtenerTablasDeMultiplicar(n);

        // Visualizar las tablas por pantalla
        visualizarTablas(tablas);
    }

    // Función para obtener las tablas de multiplicar para los primeros N números
    public static int[][] obtenerTablasDeMultiplicar(int n) {
        int[][] tablas = new int[n][10];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                tablas[i][j] = (i + 1) * j;
            }
        }

        return tablas;
    }

    // Función para visualizar las tablas por pantalla
    public static void visualizarTablas(int[][] tablas) {
        for (int i = 0; i < tablas.length; i++) {
            System.out.println("Tabla de multiplicar del número " + (i + 1) + ":");
            for (int j = 0; j < tablas[i].length; j++) {
                System.out.println((i + 1) + " x " + j + " = " + tablas[i][j]);
            }
            System.out.println();
        }
    }
}
