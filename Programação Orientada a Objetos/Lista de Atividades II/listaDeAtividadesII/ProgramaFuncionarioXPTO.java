package listaDeAtividadesII;

/*
	Sabendo que um Funcionário para o sistema de cadastro da Empresa XPTO
	S.A. possui as seguintes características: nome, data de nascimento, RG,
	CPF, endereço, naturalidade (Local de nascimento), salário, profissão, grau
	de instrução e matrícula. O Funcionário possui os seguintes
	comportamentos: (i) cadastrar e alterar que recebem como parâmetro as
	características do Funcionário; (ii) Imprimir dados do Funcionário;
*/

public class ProgramaFuncionarioXPTO {
	public static void main (String args[]) {
		FuncionarioXPTO funcionario = new FuncionarioXPTO("Janio Barreto", "01/01/1998", "123", "123.456.789.12", "Rua Esperanca", "Brasileiro", 3500, "Analista", "Tecnologo", 1);
		funcionario.imprimirDados();
		
		funcionario.alterarSalario(4000);
		funcionario.imprimirDados();
		
		funcionario.cadastrarFuncionario("X", "X", "X", "X", "X", "X", 1, "X", "X", 1);
		funcionario.imprimirDados();
	}
}
