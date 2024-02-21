public class PublicacaoXPTO {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String genero;
    private String editora;
    private int quantDisponivel;

    public PublicacaoXPTO (String titulo, String autor, int anoPublicacao, String genero, String editora, int quantDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.editora = editora;
        this.quantDisponivel = quantDisponivel;
    }

    public String getTitulo () {
        return this.titulo;
    }

    public String getAutor () {
        return this.autor;
    }

    public int getAnoPublicacao () {
        return this.anoPublicacao;
    }

    public String getGenero () {
        return this.genero;
    }

    public String getEditora () {
        return this.editora;
    }

    public int getQuantDisponivel () {
        return this.quantDisponivel;
    }

    public void imprimeDados () {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano de Publicação: " + this.anoPublicacao);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Editora: " + this.editora);
        System.out.println("Quantidade Disponível: " + this.quantDisponivel);
    }

    public static void main (String[] args) {
        PublicacaoXPTO p = new PublicacaoXPTO("Teste", "Teste", 2023, "Teste", "Teste", 2);
        p.imprimeDados();
    }
 }