package listaDeAtividadesII;

/*
	Sabendo que uma Conta Poupança para o Banco XPTO possui as seguintes
	informações: Nome do Correntista, RG, CPF, saldo, número, agência. O
	objeto possui os seguintes comportamentos: (i) cadastrar e alterar que
	recebem como parâmetro as características da Conta Poupança; (ii)
	Imprimir Saldo - que é responsável por imprimir o Saldo do Correntista.
 */

public class ProgramaBancoXPTO {
	public static void main (String args[]) {
		ContaBancoXPTO correntista = new ContaBancoXPTO("Roberto Campos", "12.345.678-9", "123.456.789-12", 10.52, "12345678-9", 1234);
		correntista.imprimirSaldo();
		
		correntista.alterarSaldo(52.23);
		correntista.imprimirSaldo();
		
		correntista.cadastrarConta("Jânio Quadros", "98.765.432-1", "987.654.321-98", 23.43, "98765432-1", 4321);
		correntista.imprimirSaldo();
	}
}
