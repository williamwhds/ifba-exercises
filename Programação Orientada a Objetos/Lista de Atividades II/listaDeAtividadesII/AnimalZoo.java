package listaDeAtividadesII;

public class AnimalZoo {
    String especie;
    String dataNascimento;
    String nome;
    int numeroRegistro;
    String localNascimento;

    public AnimalZoo(String especie, String dataNascimento, String nome, int numeroRegistro, String localNascimento) {
        this.especie = especie;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
        this.localNascimento = localNascimento;
    }

    public void cadastrarAnimal(String especie, String dataNascimento, String nome, int numeroRegistro, String localNascimento) {
        this.especie = especie;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
        this.localNascimento = localNascimento;
    }

    public void alterarEspecie(String novaEspecie) {
        this.especie = novaEspecie;
    }

    public void alterarDataNascimento(String novaDataNascimento) {
        this.dataNascimento = novaDataNascimento;
    }

    public void alterarNome(String novoNome) {
        this.nome = novoNome;
    }

    public void alterarNumeroRegistro(int novoNumeroRegistro) {
        this.numeroRegistro = novoNumeroRegistro;
    }

    public void alterarLocalNascimento(String novoLocalNascimento) {
        this.localNascimento = novoLocalNascimento;
    }

    public void imprimirInformacoes() {
        System.out.println("Especie: " + this.especie);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Nome: " + this.nome);
        System.out.println("Numero de Registro: " + this.numeroRegistro);
        System.out.println("Local de Nascimento: " + this.localNascimento);
        System.out.println();
    }
}
