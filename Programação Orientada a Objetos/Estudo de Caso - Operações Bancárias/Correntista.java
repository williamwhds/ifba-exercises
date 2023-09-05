public class Correntista {
    private String nome;
    private ContaCorrente conta;

    public Correntista (String nome, ContaCorrente conta) {
        this.nome = nome;
        this.conta = conta;
    }

    public ContaCorrente getContaCorrente () {
        return this.conta;
    }
    
    public String getNome () {
        return this.nome;
    }
}
