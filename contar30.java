import java.util.Scanner;

public class ContarNumerosY50Fin {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

int cantidad = contarNumeros(scanner);


System.out.println("Cantidad de números ingresados: " + cantidad);
    }

public static int contarNumeros(Scanner scanner) {
 int numero = 0;
 int contador = 0;

System.out.println("Ingrese números (50 para terminar):");

while (numero != 50) {
numero = scanner.nextInt();

   if (numero != 50) {
 contador++;
 }
}
   return contador;
 }
}