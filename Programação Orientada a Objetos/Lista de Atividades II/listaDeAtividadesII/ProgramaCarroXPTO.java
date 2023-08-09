package listaDeAtividadesII;

/*
	Sabendo que um Carro para o sistema de cadastro da loja XPTO Veículos
	possui as seguintes características: Código, Marca, Cor, Modelo, Ano de
	Fabricação, Número de Portas, Tipo de Combustível, Quantidade
	Disponível, Preço e se carro é completo ou básico. O objeto Carro possui os
	seguintes comportamentos: (i) cadastrar e alterar que recebem como
	parâmetro as características do Carro; (ii) listar – comportamento
	responsável por listar as informações do carro.
*/

public class ProgramaCarroXPTO {
	public static void main (String args[]) {
		CarroXPTO carro = new CarroXPTO(1, "Hyundai", "Branco", "HB20", 2022, 4, "Gasolina", 1, 77999.90, true);
		carro.listarAtributos();
		
		carro.alterarAnoFabricacao(2023);
		carro.listarAtributos();
		
		carro.cadastrarCarro(2, "Acme", "Branco", "Dynamite", 2022, 4, "Diesel", 3, 10999.90, false);
		carro.listarAtributos();
	}
}
