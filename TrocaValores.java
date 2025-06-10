import java.util.Scanner;

class ValorContainer {
    int valor;
}

public class TrocaValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ValorContainer objetivoA = new ValorContainer();
        ValorContainer objetivoB = new ValorContainer();

        System.out.println("Objeto 'objetivoA' criado. Hash: " + System.identityHashCode(objetivoA));
        System.out.println("Objeto 'objetivoB' criado. Hash: " + System.identityHashCode(objetivoB));
        try {
            System.out.print("Digite um valor para objetivoA.valor: ");
            objetivoA.valor = Integer.parseInt(scanner.nextLine());

            System.out.print("Digite um valor para objetivoB.valor: ");
            objetivoB.valor = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Os valores devem ser números inteiros.");
            objetivoA.valor = 0;
            objetivoB.valor = 0;
        }

        System.out.println("objetivoA.valor: " + objetivoA.valor);
        System.out.println("objetivoB.valor: " + objetivoB.valor);

        trocarValores(objetivoA, objetivoB);

        System.out.println("objetivoA.valor: " + objetivoA.valor);
        System.out.println("objetivoB.valor: " + objetivoB.valor);

        scanner.close();
    }

    public static void trocarValores(ValorContainer refA, ValorContainer refB) {
        int temp = refA.valor;
        refA.valor = refB.valor;
        refB.valor = temp;
        System.out.println("Valores trocados dentro do método 'trocarValores'.");
    }
}