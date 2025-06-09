import java.util.Scanner;

public class Fatorial {
    public long fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fatorial não pode ser calculado por números negativos.");
        } else if (n == 0) {
            return 1;
        } else {
            return (long) n * fatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fatorial fatCalc = new Fatorial();

        try {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            long resultado = fatCalc.fatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + resultado);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Entrada inválida. Digite novamente um número inteiro.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
