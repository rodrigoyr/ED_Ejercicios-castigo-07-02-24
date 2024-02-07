package org.example;

public class SumaMultiplosDe5 {

    public static void main(String[] args) {
        int begin = 1;
        int end = 100;
        
        int[] multiplosDe5 = obtenerMultiplosDe5(begin, end);
        
        System.out.println("Múltiplos de 5 entre " + begin + " y " + end + ": ");
        imprimirArray(multiplosDe5);
        
        int suma = calcularSumaArray(multiplosDe5);
        System.out.println("Suma de los múltiplos de 5: " + suma);
    }
    
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
    
    public static void imprimirArray(int[] array) {
        for (int valor : array) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
    
    public static int calcularSumaArray(int[] array) {
        int suma = 0;
        for (int valor : array) {
            suma += valor;
        }
        return suma;
    }
}
