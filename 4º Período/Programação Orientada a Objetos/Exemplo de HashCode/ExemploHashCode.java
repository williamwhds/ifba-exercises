public class ExemploHashCode {
    private String nome;
    private int idade;
    private String cpf;
    private String endereco;

    public ExemploHashCode(String nome, int idade, String cpf, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String toString() {
        return "Nome: " + this.nome + "\nIdade: " + this.idade + "\nCPF: " + this.cpf + "\nEndereço: " + this.endereco;
    }

    public int hashCode() {
        return this.cpf.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof ExemploHashCode)) {
            return false;
        }
        ExemploHashCode outro = (ExemploHashCode) obj;
        return this.cpf.equals(outro.cpf);
    }

    public static void main(String[] args) {
        ExemploHashCode p1 = new ExemploHashCode("João", 20, "123", "Rua 1");
        ExemploHashCode p2 = new ExemploHashCode("Maria", 30, "321", "Rua 2");

        ExemploHashCode p3 = new ExemploHashCode("João", 20, "123", "Rua 1"); // Mesmo CPF que p1

        System.out.println(p1.equals(p2)); // false
        System.out.println(p1.equals(p3)); // objetos diferentes, mas com mesmo CPF. true
    }
}
