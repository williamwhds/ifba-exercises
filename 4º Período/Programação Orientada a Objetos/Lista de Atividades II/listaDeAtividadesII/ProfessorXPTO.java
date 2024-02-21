package listaDeAtividadesII; 

public class ProfessorXPTO {
    String nome;
    String titulacao;
    String formacao;
    int cargaHoraria;
    double salario;
    String descricao;

    public ProfessorXPTO(String nome, String titulacao, String formacao, int cargaHoraria, double salario, String descricao) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.descricao = descricao;
    }

    public void cadastrarProfessor(String nome, String titulacao, String formacao, int cargaHoraria, double salario, String descricao) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.descricao = descricao;
    }
    
    public void alterarNome(String novoNome) {
    	this.nome = novoNome;
    }

    public void alterarTitulacao(String novaTitulacao) {
        this.titulacao = novaTitulacao;
    }

    public void alterarFormacao(String novaFormacao) {
        this.formacao = novaFormacao;
    }

    public void alterarCargaHoraria(int novaCargaHoraria) {
        this.cargaHoraria = novaCargaHoraria;
    }

    public void alterarSalario(double novoSalario) {
        this.salario = novoSalario;
    }

    public void alterarDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Titulacao: " + this.titulacao);
        System.out.println("Formacao: " + this.formacao);
        System.out.println("Carga Horaria: " + this.cargaHoraria + " horas");
        System.out.println("Salario: R$" + this.salario);
        System.out.println("Descricao: " + this.descricao);
        System.out.println();
    }
}
