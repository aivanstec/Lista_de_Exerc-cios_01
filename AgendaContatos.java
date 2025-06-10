import java.util.ArrayList;
import java.util.Scanner;

class Contato {
    String nome;
    String telefone;
    String email;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + ", Telefone: " + telefone + ", Email: " + email);
    }
}

public class AgendaContatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contato> contatos = new ArrayList<>();
        final int MAX_CONTATOS = 10;
        int opcao;

        do {
            System.out.println("--- Agenda de Contatos ---");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Listar todos os contatos");
            System.out.println("3. Procurar contato por nome");
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
                    System.out.println("--- Adicionar Contato ---");
                    if (contatos.size() < MAX_CONTATOS) {
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Telefone: ");
                        String telefone = scanner.nextLine();
                        System.out.print("Email: ");
                        String email = scanner.nextLine();

                        Contato novoContato = new Contato(nome, telefone, email);
                        contatos.add(novoContato);
                        System.out.println("Contato adicionado com sucesso!");
                    } else {
                        System.out.println("A agenda está cheia. Limite de " + MAX_CONTATOS + " contatos atingido.");
                    }
                    break;
                case 2:
                    System.out.println("--- Lista de Todos os Contatos ---");
                    if (contatos.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado ainda.");
                    } else {
                        for (Contato contato : contatos) {
                            contato.exibirDados();
                        }
                    }
                    break;
                case 3:
                    System.out.println("--- Procurar Contato por Nome ---");
                    if (contatos.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado para buscar.");
                        break;
                    }
                    System.out.print("Digite o nome do contato que deseja procurar: ");
                    String nomeBusca = scanner.nextLine();
                    boolean encontrado = false;
                    for (Contato contato : contatos) {
                        if (contato.nome.equalsIgnoreCase(nomeBusca)) {
                            System.out.println("Contato encontrado:");
                            System.out.println("  Telefone: " + contato.telefone);
                            System.out.println("  Email: " + contato.email);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Contato com o nome '" + nomeBusca + "' não encontrado.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo da Agenda. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}