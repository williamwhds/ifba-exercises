public class Teste {
    public static void main(String[] args) {
        BaseDeDados bd = new BaseDeDados();
        Aluno a1 = new Aluno("João", "Rua 1", 1);
        Aluno a2 = new Aluno("Maria", "Rua 2", 2);
        Aluno a3 = new Aluno("José", "Rua 3", 3);
        Aluno a4 = new Aluno("Jânio", "Rua 4", 4);
        Aluno a5 = new Aluno("Ana", "Rua 5", 1); // Matricula repetida

        try {
            bd.cadastrarAluno(a1);
            bd.cadastrarAluno(a2);
            bd.cadastrarAluno(a3);
            bd.cadastrarAluno(a4);
            bd.cadastrarAluno(a5);
        } catch (MatriculaExistenteException e) {
            System.out.println(e.getMessage());
        }
    }
}