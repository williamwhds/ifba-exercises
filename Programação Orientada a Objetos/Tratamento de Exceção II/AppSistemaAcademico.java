import java.util.Scanner;
import java.util.ArrayList;

public class AppSistemaAcademico {
    private static Scanner scanner = new Scanner(System.in);
    private static SistemaAcademico sistema = new SistemaAcademico();
    private static ArrayList<Exception> erros = new ArrayList<Exception>();

    public static void registrarProfessor (ProfessorIFBA professor) {
        sistema.registrarProfessor(professor);
    }

    public static void removerProfessor (String cpf) {
        sistema.removerProfessor(cpf);
    }

    public static String pesquisarProfessor (String cpf) {
        return sistema.pesquisarProfessorIFBA(cpf);
    }

    public static void main(String[] args) {
        // Inserindo 19 professores genéricos para testar o limite da matriz
        for (int i = 0; i < 19; i++) {
            int cpfInicial = i + 1;
            ProfessorIFBA professor = new ProfessorIFBA("João", 30, "Masculino", String.valueOf(cpfInicial), "123456789", "Rua 1", "Maria");
            registrarProfessor(professor);
        }

        boolean programa = true;
        while (programa) {
            System.out.println("1 - Registrar professor");
            System.out.println("2 - Remover professor");
            System.out.println("3 - Buscar professor");
            System.out.println("4 - Sair");

            int opcao = Integer.parseInt(scanner.nextLine());

            try {
                if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida");
                erros.add(e);
            } catch (Exception e) {
                System.out.println("Erro desconhecido");
                erros.add(e);
            }

            try {
                switch(opcao) {
                    case 1:
                        System.out.println("Digite o nome do professor");
                        String nome = scanner.nextLine();
                        System.out.println("Digite a idade do professor");
                        int idade = Integer.parseInt(scanner.nextLine());
                        System.out.println("Digite o sexo do professor");
                        String sexo = scanner.nextLine();
                        System.out.println("Digite o CPF do professor");
                        String cpf = scanner.nextLine();
                        System.out.println("Digite o RG do professor");
                        String rg = scanner.nextLine();
                        System.out.println("Digite o endereço do professor");
                        String endereco = scanner.nextLine();
                        System.out.println("Digite o nome do dependente do professor");
                        String dependente = scanner.nextLine();
                        ProfessorIFBA professor = new ProfessorIFBA(nome, idade, sexo, cpf, rg, endereco, dependente);
                        registrarProfessor(professor);
                        break;
                    case 2:
                        System.out.println("Digite o CPF do professor");
                        String cpfRemocao = scanner.nextLine();
                        removerProfessor(cpfRemocao);
                        break;
                    case 3:
                        System.out.println("Digite o CPF do professor");
                        String cpfBusca = scanner.nextLine();
                        System.out.println(pesquisarProfessor(cpfBusca));
                        break;
                    case 4:
                        programa = false;
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Número inválido");
                erros.add(e);
            } catch (Exception e) {
                System.out.println("Erro desconhecido");
                erros.add(e);
            }
        }
    }
}
