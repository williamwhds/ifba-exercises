public class FilmeXPTO extends PublicacaoXPTO {
    String diretor;
    String atorPrincipal;
    String sinopse;
    String tempoDuracao;

    public FilmeXPTO (String titulo, String autor, int anoPublicacao, String genero, String editora, int quantDisponivel, String diretor, String atorPrincipal, String sinopse, String tempoDuracao) {
        super(titulo, autor, anoPublicacao, genero, editora, quantDisponivel);
        this.diretor = diretor;
        this.atorPrincipal = atorPrincipal;
        this.sinopse = sinopse;
        this.tempoDuracao = tempoDuracao;
    }

    public String getAtorPrincipal() {
        return atorPrincipal;
    }
    
    public String getDiretor() {
        return diretor;
    }

    public String getSinopse() {
        return sinopse;
    }

    public String getTempoDuracao() {
        return tempoDuracao;
    }

    public void imprimeDados () {
        super.imprimeDados();
        System.out.println("Diretor: " + this.diretor);
        System.out.println("Ator Principal: " + this.atorPrincipal);
        System.out.println("Sinopse: " + this.sinopse);
        System.out.println("Tempo de Duracao: " + this.tempoDuracao);
        System.out.println();
    }

    public static void main (String[] args) {
        FilmeXPTO f = new FilmeXPTO("Teste", "Teste", 2023, "Teste", "Teste", 5, "Teste", "Teste", "Teste", "2:05h");
        f.imprimeDados();
    }
}