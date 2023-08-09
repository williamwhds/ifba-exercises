package listaDeAtividadesII;

/*
	Sabendo que um Animal para o sistema de cadastro do Jardim Zoológico
	possui as seguintes características: Espécie, Data de Nascimento, Nome,
	Número de Registro e Local de Nascimento. O objeto possui os seguintes
	comportamentos: (i) cadastrar e alterar que recebem como parâmetro as
	características do Animal; (ii) outro comportamento desse objeto é a
	capacidade de imprimir as informações armazenadas nas suas
	características.
*/

public class ProgramaAnimalZoo {
	public static void main (String args[]) {
		AnimalZoo animal = new AnimalZoo("Panthera tigris", "07/07/2007", "Meleca", 1001, "Floresta Amazonica");
		animal.imprimirInformacoes();
	
		animal.alterarNome("Fuleco");
		animal.imprimirInformacoes();
		
		animal.cadastrarAnimal("Panthera leo", "09/09/2009", "Fenix", 1002, "Africa");
		animal.imprimirInformacoes();
	}
}
