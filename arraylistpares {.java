public class Main {
    public static void main(String[] args) {
        
        int[] numeros = {1, 2, 3, 4, 5, 6};
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) { 
                System.out.println(numeros[i]);
            }
        }
    }
}