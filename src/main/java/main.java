import java.util.Scanner;

public class main {

        public static void main (String [] args){


        }
    public static int[] pasarFilaHaciaArreglo(int[][] matriz, int fila) {
        int[] arreglo = new int[matriz[1].length];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = matriz[fila][i];
        }
        return arreglo;

    }
    public static int[] ordenarArregloMenorMayor(int[] numeros) {
        int[] ultima;
        int aux;
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j + 1] < numeros[j]) {
                    aux = numeros[j + 1];
                    numeros[j + 1] = numeros[j];
                    numeros[j] = aux;
                    // System.out.println("aux" + aux);
                }
            }
        }
        ultima = numeros;
        System.out.println("ORDENADOS MENOR-MAYOR");
        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Posicion [" + (i + 1) + "] =" + ultima[i]);

        }
        return ultima;

    }

    }
