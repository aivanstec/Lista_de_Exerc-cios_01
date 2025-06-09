import java.util.Scanner;

public class Palindromo {
    public boolean Verificar(String texto) {
        String textoFormatado = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String textoReverso = new StringBuilder(textoFormatado).toString();

        return textoFormatado.equals(textoReverso);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Palindromo verificar = new Palindromo();

        System.out.println("Digite uma palavra ou frase:");
        String palavra = scanner.nextLine();

        if (verificar.Verificar(palavra)) {
            System.out.println("'" + palavra + "' é um palíndromo!");
        } else {
            System.out.println("'" + palavra + "' Não é um palíndromo.");
        }

        scanner.close();
    }
}
