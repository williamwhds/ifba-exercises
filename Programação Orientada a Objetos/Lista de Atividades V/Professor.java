public class Professor extends Funcionario{
    private String formacao;
    private String disciplinas;

    public void setDisciplinas(String disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getDisciplinas() {
        return disciplinas;
    }

    public void imprimeDados () {
        super.imprimeDados();
        System.out.println("Formação: " + this.formacao);
        System.out.println("Disciplinas: " + this.disciplinas);
        System.out.println();
    }

    public Professor (String nome, String rg, String cpf, String dataNascimento, String dataAdmissao, double salario, String formacao) {
        super(nome, rg, cpf, dataNascimento, dataAdmissao, salario);
        this.formacao = formacao;
    }

    public static void main(String[] args) {
        Professor prof1 = new Professor("Roberto Silva", "123", "321", "02/02/1992", "22/08/2023", 5600, "Ciência da Computação");
        prof1.imprimeDados();

        Professor prof2 = new Professor("Eduarda Ribeiro", "456", "654", "05/05/1995", "22/08/2023", 7600, "Engenharia");
        prof2.imprimeDados();
    }
}