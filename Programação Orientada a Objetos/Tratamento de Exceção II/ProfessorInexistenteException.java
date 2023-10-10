public class ProfessorInexistenteException extends Exception{
    public ProfessorInexistenteException(String cpf) {
        super("Não existe um professor com este CPF: " + cpf);
    }
}