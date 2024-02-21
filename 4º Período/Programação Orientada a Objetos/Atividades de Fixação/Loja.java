public class Loja {
    private String nome;
    private String ramo;
    private int anoDeFundacao;
    private Vendedor vendedor;

    public int getAnoDeFundacao() {
        return anoDeFundacao;
    }

    public String getNome() {
        return nome;
    }

    public String getRamo() {
        return ramo;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void admitirVendedor (String nome, int idade) {
        this.vendedor = new Vendedor();
        this.vendedor.setIdade(idade);
        this.vendedor.setNome(nome);
    }

    public void demitirVendedor () {
        this.vendedor = null;
    }

    public Loja (String nome, String ramo, int anoDeFundacao) {
        this.nome = nome;
        this.ramo = ramo;
        this.anoDeFundacao = anoDeFundacao;
    }
}