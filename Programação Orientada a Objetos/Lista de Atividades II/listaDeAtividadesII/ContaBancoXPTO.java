package listaDeAtividadesII;

public class ContaBancoXPTO {
    String nomeCorrentista;
    String rg;
    String cpf;
    double saldo;
    String numeroConta;
    int agencia;

    public ContaBancoXPTO(String nomeCorrentista, String rg, String cpf, double saldo, String numeroConta, int agencia) {
        this.nomeCorrentista = nomeCorrentista;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
    }
    
    public void cadastrarConta(String nomeCorrentista, String rg, String cpf, double saldo, String numeroConta, int agencia) {
        this.nomeCorrentista = nomeCorrentista;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
    }

    public void alterarNome(String novoNomeCorrentista) {
        this.nomeCorrentista = novoNomeCorrentista;
    }

    public void alterarRG(String novoRg) {
        this.rg = novoRg;
    }

    public void alterarCPF(String novoCpf) {
        this.cpf = novoCpf;
    }

    public void alterarSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }

    public void alterarNumero(String novoNumero) {
        this.numeroConta = novoNumero;
    }

    public void alterarAgencia(int novaAgencia) {
        this.agencia = novaAgencia;
    }

    public void imprimirSaldo() {
        System.out.println("Saldo do Correntista: R$" + this.saldo);
    }
}
