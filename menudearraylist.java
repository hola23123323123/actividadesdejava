import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        int n = 0;
        int[] lista = null;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Definir tamaño de la lista");
            System.out.println("2 - Cargar valores");
            System.out.println("3 - Mostrar desde posición 0 hasta n-1");
            System.out.println("4 - Mostrar desde n-1 hasta 0");
            System.out.println("5 - Salir");
            System.out.print("Elegí opción: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Ingresar tamaño: ");
                    n = sc.nextInt();
                    lista = new int[n];
                    break;

                case 2:
                    if (lista == null) {
                        System.out.println("Primero definí el tamaño.");
                    } else {
                        for (int i = 0; i < n; i++) {
                            System.out.print("Valor [" + i + "]: ");
                            lista[i] = sc.nextInt();
                        }
                    }
                    break;

                case 3:
                    if (lista == null) {
                        System.out.println("Lista vacía.");
                    } else {
                        for (int i = 0; i < n; i++) {
                            System.out.print(lista[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    if (lista == null) {
                        System.out.println("Lista vacía.");
                    } else {
                        for (int i = n - 1; i >= 0; i--) {
                            System.out.print(lista[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (op != 5);

    }
}