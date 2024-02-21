public class ProfessorExistenteException extends Exception{
    public ProfessorExistenteException(String cpf) {
        super("Já existe um professor com este CPF: " + cpf);
    }
}
