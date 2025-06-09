import java.util.Scanner;
import java.util.Random;

public class MatrizMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m, n;
        while (true) {
            try {
                System.out.print("Digite o número de linhas (m) da matriz: ");
                m = Integer.parseInt(scanner.nextLine());

                System.out.print("Digite o número de colunas (n) da matriz: ");
                n = Integer.parseInt(scanner.nextLine());

                if (m <= 0 || n <= 0) {
                    System.out.println("As dimensões da matriz devem ser números inteiros positivos. Tente novamente.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }

        int[][] matriz = new int[m][n];
        Random random = new Random();

        System.out.println("\nPreenchendo a matriz " + m + "x" + n + ":");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }

        System.out.println("Matriz gerada:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

        int maiorElemento = matriz[0][0];
        int menorElemento = matriz[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > maiorElemento) {
                    maiorElemento = matriz[i][j];
                }
                if (matriz[i][j] < menorElemento) {
                    menorElemento = matriz[i][j];
                }
            }
        }

        System.out.println("Maior elemento na matriz: " + maiorElemento);
        System.out.println("Menor elemento na matriz: " + menorElemento);

        scanner.close();
    }
}
