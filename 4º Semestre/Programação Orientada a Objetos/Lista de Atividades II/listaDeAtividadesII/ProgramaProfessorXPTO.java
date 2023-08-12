package listaDeAtividadesII;

/*
	Sabendo que um Professor para o sistema de cadastro da Faculdade XPTO
	possui as seguintes características: nome, titulação, formação, carga horária,
	salário e uma descrição das disciplinas que professor pode ensinar. O
	Professor possui os seguintes comportamentos: (i) cadastrar e alterar que
	recebem como parâmetro as características do Professor; (ii) alterar a
	descrição de disciplina ensinada; (iii) Imprimir dados do Professor;
*/

public class ProgramaProfessorXPTO {
	public static void main (String args[]) {
		ProfessorXPTO professor = new ProfessorXPTO("Janio Barreto", "Doutor", "Engenharia da Computacao", 30, 8000, "Eletronica Basica - Nesse curso, os alunos explorarao conceitos fundamentais como componentes eletronicos, circuitos eletricos, resistores, capacitores e semicondutores.");
		professor.imprimirDados();
		
		professor.alterarNome("Janio Bezerra");
		professor.imprimirDados();
		
		professor.cadastrarProfessor("Janio Cardoso", "Mestre", "Engenharia da Computacao", 45, 9000, "Eletronica Avancada - [...]");
		professor.imprimirDados();
	}
}
