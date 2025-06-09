import java.util.Scanner;

public class Temperatura {

    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Temperatura conversor = new Temperatura();

        System.out.println("\nEscolha a direção da conversão:");
        System.out.println("1: Celsius para Fahrenheit");
        System.out.println("2: Fahrenheit para Celsius");
        System.out.print("Digite o número da opção desejada: ");
        int opcao = scanner.nextInt();

        try {
            System.out.print("Digite a temperatura: ");
            double temperatura = scanner.nextDouble();

            double resultado;
            switch (opcao) {
                case 1:
                    resultado = conversor.celsiusParaFahrenheit(temperatura);
                    System.out.printf("%.2f°C é igual a %.2f°F%n", temperatura, resultado);
                    break;
                case 2:
                    resultado = conversor.fahrenheitParaCelsius(temperatura);
                    System.out.printf("%.2f°F é igual a %.2f°C%n", temperatura, resultado);
                    break;
                default:
                    System.out.println("Opção inválida. Escolha 1 ou 2.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Entrada inválida. Digite um número.");
        } finally {
            scanner.close();
        }
    }
}