public class Programa {
    public static void main (String[] args){
        Funcionario f1 = new Funcionario("Zé", 25, 44);

        f1.numRG = "12345678";
        f1.cpf = "123456789101";
        f1.salario = 380;   // salario e matricula são atributos private.
        f1.matricula = 123; // Não podem ser acessados diretamente.
        f1.calculaSalario();
        f1.imprimirDados();

        Funcionario f2 = new Funcionario("Maria", 25, 40);

        f2.numRG = "12345678";
        f2.cpf = "123456789101";
        f2.calculaSalario();
        f2.imprimirDados();
    }
}