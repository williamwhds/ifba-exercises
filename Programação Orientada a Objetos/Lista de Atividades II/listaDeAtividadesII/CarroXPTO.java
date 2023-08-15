package listaDeAtividadesII;

public class CarroXPTO {
	int codigo;
	String marca;
	String cor;
	String modelo; 
	int anoFabricacao;
	int numPortas;
	String tipoCombustivel;
	int quantDisponivel;
	double preco;
	boolean completo;
	
	CarroXPTO (int iCodigo, String iMarca, String iCor, String iModelo,
			   int iAnoFabricacao, int iNumPortas, String iTipoCombustivel,
			   int iQuantDisponivel, double iPreco, boolean iCompleto) {
		this.codigo = iCodigo;
		this.marca = iMarca;
		this.cor = iCor;
		this.modelo = iModelo;
		this.anoFabricacao = iAnoFabricacao;
		this.numPortas = iNumPortas;
		this.tipoCombustivel = iTipoCombustivel;
		this.quantDisponivel = iQuantDisponivel;
		this.preco = iPreco;
		this.completo = iCompleto;
	}
	
	public void cadastrarCarro (int iCodigo, String iMarca, String iCor, String iModelo,
			   int iAnoFabricacao, int iNumPortas, String iTipoCombustivel,
			   int iQuantDisponivel, double iPreco, boolean iCompleto) {
		this.codigo = iCodigo;
		this.marca = iMarca;
		this.cor = iCor;
		this.modelo = iModelo;
		this.anoFabricacao = iAnoFabricacao;
		this.numPortas = iNumPortas;
		this.tipoCombustivel = iTipoCombustivel;
		this.quantDisponivel = iQuantDisponivel;
		this.preco = iPreco;
		this.completo = iCompleto;
	}	
	
	public void alterarCodigo(int novoValor) {
		this.codigo = novoValor;
	}
	
	public void alterarMarca(String novoValor) {
		this.marca = novoValor;
	}
	
	public void alterarCor(String novoValor) {
		this.cor = novoValor;
	}

	public void alterarModelo(String novoValor) {
		this.modelo = novoValor;
	}
	
	public void alterarAnoFabricacao(int novoValor) {
		this.anoFabricacao = novoValor;
	}
	
	public void alterarNumPortas(int novoValor) {
		this.numPortas = novoValor;
	}
	
	public void alterarCombustivel(String novoValor) {
		this.tipoCombustivel = novoValor;
	}
	
	public void alterarQuantDisponivel(int novoValor) {
		this.quantDisponivel = novoValor;
	}
	
	public void alterarPreco(double novoValor) {
		this.preco = novoValor;
	}
	
	public void alterarCompleto(boolean novoValor) {
		this.completo = novoValor;
	}

	public void listarAtributos () {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano de Fabricacao: " + this.anoFabricacao);
        System.out.println("Numero de Portas: " + this.numPortas);
        System.out.println("Tipo de Combustivel: " + this.tipoCombustivel);
        System.out.println("Quantidade Disponivel: " + this.quantDisponivel);
        System.out.println("Preco: R$" + this.preco);
        System.out.println("Completo: " + (this.completo ? "Sim" : "Nao"));
        System.out.println();
	}
}
