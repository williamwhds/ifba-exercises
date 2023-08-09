package listaDeAtividadesII;

public class FuncionarioXPTO {
    String nome;
    String dataNascimento;
    String rg;
    String cpf;
    String endereco;
    String naturalidade;
    double salario;
    String profissao;
    String grauInstrucao;
    int matricula;

    public FuncionarioXPTO(String nome, String dataNascimento, String rg, String cpf, String endereco,
                           String naturalidade, double salario, String profissao, String grauInstrucao, int matricula) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grauInstrucao = grauInstrucao;
        this.matricula = matricula;
    }

    public void cadastrarFuncionario(String nome, String dataNascimento, String rg, String cpf, String endereco,
                                     String naturalidade, double salario, String profissao, String grauInstrucao, int matricula) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grauInstrucao = grauInstrucao;
        this.matricula = matricula;
    }

    public void alterarSalario(double novoSalario) {
        this.salario = novoSalario;
    }

    public void alterarEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("RG: " + this.rg);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Naturalidade: " + this.naturalidade);
        System.out.println("Salario: R$" + this.salario);
        System.out.println("Profissao: " + this.profissao);
        System.out.println("Grau de Instrucao: " + this.grauInstrucao);
        System.out.println("Matricula: " + this.matricula);
        System.out.println();
    }
}
