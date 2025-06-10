import java.util.ArrayList;
import java.util.Scanner;

class Funcionario {
    String nome;
    int id;
    double salario;
    String departamento;

    public Funcionario(String nome, int id, double salario, String departamento) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void exibirDados() {
        System.out.println("ID: " + id + ", Nome: " + nome + ", Salário: " + String.format("%.2f", salario) + ", Departamento: " + departamento);
    }
}

public class GerenciamentoFuncionarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        int opcao;
        do {
            System.out.println("--- Sistema de Gerenciamento de Funcionários ---");
            System.out.println("1. Cadastrar funcionário");
            System.out.println("2. Calcular total de salários por departamento");
            System.out.println("3. Listar todos os funcionários");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Digite um número.");
                opcao = -1;
            }
            switch (opcao) {
                case 1:
                    System.out.println("--- Cadastro de Funcionário ---");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("ID: ");
                    int id = 0;
                    try {
                        id = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("ID inválido. Digite um número inteiro.");
                        break;
                    }
                    System.out.print("Salário: ");
                    double salario = 0.0;
                    try {
                        salario = Double.parseDouble(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Salário inválido. Digite um número decimal.");
                        break;
                    }
                    System.out.print("Departamento: ");
                    String departamento = scanner.nextLine();

                    Funcionario novoFuncionario = new Funcionario(nome, id, salario, departamento);
                    funcionarios.add(novoFuncionario);
                    System.out.println("Funcionário cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("--- Total de Salários por Departamento ---");
                    if (funcionarios.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado ainda.");
                        break;
                    }
                    System.out.print("Digite o departamento para calcular o total de salários: ");
                    String deptoBusca = scanner.nextLine();
                    double totalSalarios = 0;
                    boolean encontrouDepartamento = false;
                    for (Funcionario f : funcionarios) {
                        if (f.departamento.equalsIgnoreCase(deptoBusca)) {
                            totalSalarios += f.salario;
                            encontrouDepartamento = true;
                        }
                    }
                    if (encontrouDepartamento) {
                        System.out.println("Total de salários para o departamento '" + deptoBusca + "': " + String.format("%.2f", totalSalarios));
                    } else {
                        System.out.println("Nenhum funcionário encontrado no departamento '" + deptoBusca + "'.");
                    }
                    break;
                case 3:
                    System.out.println("--- Lista de Todos os Funcionários ---");
                    if (funcionarios.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado ainda.");
                    } else {
                        for (Funcionario f : funcionarios) {
                            f.exibirDados();
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}