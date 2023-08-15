// Importando para usar a classe Date
import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario {
    private Date dataContratacao = new Date();
    private SimpleDateFormat formatacao = new SimpleDateFormat("dd/MM/yy");
    private String strDataContratacao = formatacao.format(dataContratacao);

    private String nome;
    public String cpf;
    public String numRG;
    private int matricula;
    private double salario;
    private double salarioBase;
    private double horasTrabalhadas;

    private static int geraMatricula = 0;

    Calculo calculo = new Calculo();

    Funcionario (String nome, double salarioBase, double horasTrabalhadas) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
        
        this.matricula = geraMatricula;
        geraMatricula++;


    }

    public void calculaSalario () {
        calculo.calculaSalario(this.salarioBase, this.horasTrabalhadas);
        this.salario = calculo.getTotalSalario();
    }

    public void imprimirDados () {
        System.out.println("Nome : " + this.nome);
        System.out.println("CPF : " + this.cpf);
        System.out.println("RG : " + this.numRG);
        System.out.println("Nº de matricula : " + this.matricula);
        System.out.println("Salario : " + this.salario);
        System.out.println("Data de contratacao : " + this.strDataContratacao);
        System.out.println();
    }

    public static void main (String args[]) {
        Funcionario funcionario1 = new Funcionario("Rodrigo Campos", 250, 75);
        funcionario1.calculaSalario();
        funcionario1.imprimirDados();

        Funcionario funcionario2 = new Funcionario("Maria Ribeiro", 200, 80);
        funcionario2.calculaSalario();
        funcionario2.imprimirDados();
    }
}