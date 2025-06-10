import java.util.Scanner;

class Numero {
    int valor;
    public void imprimirValor() {
        System.out.println("O valor do atributo é: " + this.valor);
    }
}
public class Manipulacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Numero meuNumero = new Numero();
        System.out.println("Objeto 'meuNumero' criado.");
        System.out.println("Simulação do 'endereço de memória' de meuNumero: " + System.identityHashCode(meuNumero));

        System.out.print("Digite um valor para o atributo do objeto: ");
        try {
            int valorDigitado = Integer.parseInt(scanner.nextLine());
            meuNumero.valor = valorDigitado;
            System.out.println("Valor '" + meuNumero.valor + "' atribuído ao objeto.");
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. O valor deve ser um número inteiro.");
        }
        meuNumero.imprimirValor();

        scanner.close();
    }
}
