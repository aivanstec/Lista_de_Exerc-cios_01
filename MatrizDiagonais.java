import java.util.Scanner;
import java.util.Random;

public class MatrizDiagonais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        while (true) {
            try {
                System.out.print("Digite a ordem (n) da matriz quadrada: ");
                n = Integer.parseInt(scanner.nextLine());
                if (n <= 0) {
                    System.out.println("A ordem da matriz deve ser um número inteiro positivo. Tente novamente.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }
        int[][] matriz = new int[n][n];
        Random random = new Random();
        System.out.println("Preenchendo a matriz quadrada " + n + "x" + n + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(50) + 1; // Gera números de 1 a 50
            }
        }
        System.out.println("Matriz quadrada gerada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < n; i++) {
            somaDiagonalPrincipal += matriz[i][i];
            somaDiagonalSecundaria += matriz[i][n - 1 - i];
        }
        System.out.println("Soma da Diagonal Principal: " + somaDiagonalPrincipal);
        System.out.println("Soma da Diagonal Secundária: " + somaDiagonalSecundaria);

        scanner.close();
    }
}
