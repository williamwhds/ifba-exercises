public class Funcionario {
    private String nome;
    private String rg;
    private String cpf;
    private String dataNascimento;
    private String dataAdmissao;
    private double salario;
    private int matricula;
    private String cargo;

    private static int geraMatricula = 0;

    protected String endereco;

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public String toString() {
        return "Nome: " + nome + "\n" +
               "RG: " + rg + "\n" +
               "CPF: " + cpf + "\n" +
               "Data de Nascimento: " + dataNascimento + "\n" +
               "Data de Admissão: " + dataAdmissao + "\n" +
               "Salário: " + salario + "\n" +
               "Matrícula: " + matricula + "\n" +
               "Cargo: " + cargo + "\n" +
               "Endereço: " + endereco;
    }

    public void imprimeDados () {
        System.out.println(this.toString());
    }

    public Funcionario (String nome, String rg, String cpf, String dataNascimento, String dataAdmissao, double salario) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;

        geraMatricula++;
        this.matricula = geraMatricula;
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Rodrigo Silva", "123-123", "123.456.789-12", "01/01/2001", "22/08/2023", 2300);
        funcionario.imprimeDados();
    }
}