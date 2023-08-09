package listaDeAtividadesII;

import java.util.Scanner;

public class ProgramaCalculadora {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();
		
		System.out.println("Insira o valor de X");
		int x = input.nextInt();
		
		System.out.println("Insira o valor de Y0");
		int y = input.nextInt();
		
		System.out.println("Escolha a operacao:");
		System.out.println("1. Soma");
		System.out.println("2. Subtracao");
		System.out.println("3. Multiplicacao");
		System.out.println("4. Divisao");
		System.out.println();
		
		int escolha = input.nextInt();
		input.close();
		
		switch (escolha) {
		case 1:
			System.out.println(calculadora.soma(x, y));
			break;
		case 2:
			System.out.println(calculadora.subtracao(x, y));
			break;
		case 3:
			System.out.println(calculadora.multiplicacao(x, y));
			break;
		case 4:
			System.out.println(calculadora.divisao(x, y));
			break;
		}
	}
}
