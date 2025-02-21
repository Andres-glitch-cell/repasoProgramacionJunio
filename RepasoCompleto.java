import java.util.Scanner;

public class RepasoCompleto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n---Menu---");
        System.out.println("1. Sumar dígitos de un número");
        System.out.println("2. Sumar digitos de varios números");
        System.out.println("3. Rellenar una array");
        System.out.println("4. Jugar a los dados");
        System.out.println("5. Hacer sumas de columnas y filas");
        System.out.println("6. Hacer sumas de solamente columnas");
        System.out.println("7. Hacer sumas de solamente filassssssss");
        System.out.println("8. Separar palabras o frasesssssss");
        System.out.println("9. Poner palabras al revés o frases al revés");
        System.out.println("10. Menú de condicionales sencillos");
        System.out.println("Elige una opción; ");
        int opcion = sc.nextInt();

        // Ejercicio 1: Suma de dígitos (Fácil)
        // Escribe un programa que pida un número entero positivo y calcule la suma de sus dígitos.
        switch (opcion) {
            case 1:
                System.out.println("Dame un número entero y te calcularé la suma de los dígitos");
                int numUser = sc.nextInt();
                int suma = 0;
                while (numUser > 0) {
                    int ultimoDigito = numUser % 10;
                    suma += ultimoDigito;
                    numUser = numUser / 10;
                }
                System.out.println("La suma de los dígitos es: " + suma);
                break;

            case 2:
                int variosNumerosUsuario;
                // Le pedimos los números al usuario (de repeticiones)
                System.out.println("Cuantas veces quieres poner un número? ");
                int numeroRepeticiones = sc.nextInt();

                // Se guardan en el array numeroNumeros
                int[] numeroNumerosMasNumeroRepeticiones = new int[numeroRepeticiones];
                for (int i = 0; i < numeroNumerosMasNumeroRepeticiones.length; i++) {
                    System.out.println("Introduce un número");
                    numeroNumerosMasNumeroRepeticiones[i] = sc.nextInt();
                    System.out.println("Número " + numeroNumerosMasNumeroRepeticiones[i] + " guardado existosamente!");
                }

                for (int i = 1; i < numeroNumerosMasNumeroRepeticiones.length; i++) {
                    System.out.println("El número " + i + " tiene el valor númerico de " + "\t" + numeroNumerosMasNumeroRepeticiones[i] + "\t");
                }

                /*
                System.out.println("Dame unv");
                int numUser = sc.nextInt();
                int suma = 0;
                while (numUser > 0) {
                    int ultimoDigito = numUser % 10;
                    suma += ultimoDigito;
                    numUser = numUser / 10;
                }
                System.out.println("La suma de los dígitos es: " + suma);
                break; */

            case 10:

                int opcionCondicionales;

                System.out.println("Menu de solamente condicionales!");
                System.out.println("1. Pares Impares");
                System.out.println("2. Comprobar si un número es mayor que el otro");
                System.out.println("Elige una opcion");
                opcionCondicionales = sc.nextInt();

                switch (opcionCondicionales) {


                    case 1:
                        System.out.println("Introduce un número: ");
                        int numeroUserUno = sc.nextInt();
                        System.out.println("Introduce otro número: ");
                        int numeroUserDos = sc.nextInt();

                        if (numeroUserUno % 2 == 0) {

                            System.out.println("Es par");
                        } else {
                            System.out.println("Es impar");
                        }


                    case 2:
                }
        }
    }
}