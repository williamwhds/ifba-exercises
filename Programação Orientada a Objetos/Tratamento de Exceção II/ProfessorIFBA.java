public class ProfessorIFBA {
    private String nome;
    private int idade;
    private String sexo;
    private String cpf;
    private String rg;
    private String endereco;
    private String dependente;

    public ProfessorIFBA (String nome, int idade, String sexo, String cpf, String rg, String endereco, String dependente) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.dependente = dependente;
    }

    public String getCpf() {
        return cpf;
    }

    public String getInformacoes () {
        return
        "Nome: " + this.nome +
        "\nIdade: " + this.idade +
        "\nSexo: " + this.sexo +
        "\nCPF: " + this.cpf +
        "\nRG: " + this.rg +
        "\nEndereço: " + this.endereco +
        "\nDependente: " + this.dependente;
    }

    public static void main(String[] args) {
        ProfessorIFBA professor = new ProfessorIFBA("João", 30, "Masculino", "12345678910", "123456789", "Rua 1", "Maria");
        System.out.println(professor.getInformacoes());
    }
}