public class Aluno {
    private String nome, endereco;
    private int matricula;

    public Aluno(String nome, String endereco, int matricula) {
        this.nome = nome;
        this.endereco = endereco;
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public int getMatricula() {
        return this.matricula;
    }
}
