package org.example;

public class CalculoSegundos {

    public static void main(String[] args) {
        // Definir variables
        int diasEnUnAno = 365;
        int horasEnUnDia = 24;
        int minutosEnUnaHora = 60;
        int segundosEnUnMinuto = 60;

        // Calcular el número total de segundos en un año
        int segundosEnUnAno = calcularSegundosEnUnAno(diasEnUnAno, horasEnUnDia, minutosEnUnaHora, segundosEnUnMinuto);

        // Imprimir el resultado
        System.out.println("El número de segundos en un año es: " + segundosEnUnAno);
    }

    // Función para calcular el número de segundos en un año
    public static int calcularSegundosEnUnAno(int dias, int horas, int minutos, int segundos) {
        return dias * horas * minutos * segundos;
    }
}
