import java.util.Scanner;

public class ProgramaLista {

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
            System.out.println("5 - Mostrar la sumatoria del array");
            System.out.println("6 - Buscar número");
            System.out.println("7 - Calcular promedio");
            System.out.println("8 - Mostrar elemento más grande");
            System.out.println("9 - Salir");
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

                    if (lista == null) {

                        System.out.println("Lista vacía.");

                    } else {

                        int suma = suma_elem(lista);

                        System.out.println("La suma es: " + suma);
                    }

                    break;

                case 6:

                    if (lista == null) {

                        System.out.println("Lista vacía.");

                    } else {

                        System.out.print("Ingresá el número a buscar: ");
                        int buscar = sc.nextInt();

                        boolean encontrado = false;

                        for (int i = 0; i < n; i++) {

                            if (lista[i] == buscar) {

                                System.out.println("Número encontrado en la posición: " + i);

                                encontrado = true;
                            }
                        }

                        if (!encontrado) {

                            System.out.println("Número no encontrado.");
                        }
                    }

                    break;

                case 7:

                    if (lista == null) {

                        System.out.println("Lista vacía.");

                    } else {

                        int suma = suma_elem(lista);

                        double promedio = (double) suma / n;

                        System.out.println("El promedio es: " + promedio);
                    }

                    break;

                case 8:

                    if (lista == null) {

                        System.out.println("Lista vacía.");

                    } else {

                        int mayor = lista[0];

                        for (int i = 0; i < n; i++) {

                            if (lista[i] > mayor) {

                                mayor = lista[i];
                            }
                        }

                        System.out.println("El elemento más grande es: " + mayor);
                    }

                    break;

                case 9:

                    System.out.println("Saliendo...");

                    break;

                default:

                    System.out.println("Opción inválida.");
            }

        } while (op != 9);

        sc.close();
    }

    public static int suma_elem(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
        }

        return sum;
    }
}