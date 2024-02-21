public class LivroXPTO extends PublicacaoXPTO {
    private String edicao;
    private String isbn;

    public LivroXPTO (String titulo, String autor, int anoPublicacao, String genero, String editora, int quantDisponivel, String edicao, String isbn) {
        super(titulo, autor, anoPublicacao, genero, editora, quantDisponivel);
        this.edicao = edicao;
        this.isbn = isbn;
    }

    public String getEdicao () {
        return this.edicao;
    }

    public String getIsbn () {
        return this.isbn;
    }

    public void imprimeDados () {
        super.imprimeDados();
        System.out.println("Edicao: " + this.edicao);
        System.out.println("ISBN: " + this.isbn);
        System.out.println();
    }

    public static void main (String[] args) {
        LivroXPTO l = new LivroXPTO("Teste", "Teste", 2023, "Teste", "Teste", 2, "3ª", "1298732-123");
        l.imprimeDados();
    }
}