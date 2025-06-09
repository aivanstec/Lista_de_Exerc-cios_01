import java.util.Scanner;

public class Calculadora {
    public double soma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public double subtracao(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public double multiplicacao(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public double divisao(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calcular = new Calculadora();

        System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Escolha a Oprração: ");
        System.out.println("1: Soma (+)");
        System.out.println("2: Subtração (-)");
        System.out.println("3: Multiplicação (*)");
        System.out.println("4: Divisão (/)");
        System.out.println("Digite o número da operação desejadaa: ");
        int operacao = scanner.nextInt();
        double resultado;

        switch (operacao) {
            case 1:
                resultado = calcular.soma(numero1, numero2);
                System.out.println("Resultado" + numero1 + "+" + numero2 + "=" + resultado);
                break;
            case 2:
                resultado = calcular.subtracao(numero1, numero2);
                System.out.println("Resultado" + numero1 + "+" + numero2 + "=" + resultado);
                break;
            case 3:
                resultado = calcular.multiplicacao(numero1, numero2);
                System.out.println("Resultado" + numero1 + "+" + numero2 + "=" + resultado);
                break;
            case 4:
                resultado = calcular.divisao(numero1, numero2);
                System.out.println("Resultado" + numero1 + "+" + numero2 + "=" + resultado);
                break;
            default:
                System.out.println("Operação inválida! Tente novamente");
        }
    }
}
