import java.util.Scanner;

public class main {

        public static void main (String [] args){


        }
        public static int largoArreglo() { // valida el largo de un arreglo

            Scanner teclado = new Scanner(System.in);
            int numero1 = 0;
            do {
                try {
                    System.out.println("..........[Ingrese largo]..........");
                    numero1 = teclado.nextInt();
                    if (numero1 < 0) {
                        System.out.println("No se admiten numeros negativos");
                    } else if (numero1 > 10) {
                        System.out.println("No se admiten numeros mayores a 10");
                        numero1 = -1;

                    }
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Dato erroneo");
                    System.out.println("Intentelo denuevo");
                    teclado.next();

                }

            } while (numero1 <= 0);
            return numero1;

        }
    public static int validarEntrada ( ){
        Scanner teclado = new Scanner(System.in);
        int numero=0;
        do {
            try {
                System.out.println("Escriba un elemento valido");
                numero = teclado.nextInt();
                if (numero < 0) {
                    System.out.println("No se admiten numeros negativos");
                } else if (numero > 100) {
                    System.out.println("No se admiten numeros mayores a 100");
                    numero = -1;

                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Dato erroneo");
                System.out.println("Intentelo denuevo");
                teclado.next();

            }

        } while (numero <= 0);
        return numero;
    }

    }
