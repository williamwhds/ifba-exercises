public class MatriculaExistenteException extends Exception {
    public MatriculaExistenteException(String msg, int matricula) {
        super(msg+" "+matricula);
    }
}