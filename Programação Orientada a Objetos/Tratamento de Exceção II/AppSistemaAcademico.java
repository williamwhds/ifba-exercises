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

    public static void buscarProfessor (String cpf) {
        sistema.buscarProfessor(cpf);
    }

    public static void main(String[] args) {
        // Inserindo 19 professores genéricos para testar o limite da matriz
        for (int i = 0; i < 19; i++) {
            ProfessorIFBA professor = new ProfessorIFBA("João", 30, "Masculino", "12345678910", "123456789", "Rua 1", "Maria");
            registrarProfessor(professor);
        }

        boolean programa = true;
        while (programa) {
            System.out.println("1 - Registrar professor");
            System.out.println("2 - Remover professor");
            System.out.println("3 - Buscar professor");
            System.out.println("4 - Sair");

            try {
                int opcao = Integer.parseInt(scanner.nextLine());
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
        }
    }
}
