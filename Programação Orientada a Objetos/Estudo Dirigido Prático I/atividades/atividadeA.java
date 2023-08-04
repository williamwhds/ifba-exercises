package atividades;

import java.util.Scanner;

public class atividadeA {
	public static void main (String[] args) {
		
		// Criando objeto Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o primeiro numero.");
		// Pegando input e transformando em int
		int num1 = input.nextInt();
		
		System.out.println("Insira o segundo numero.");
		int num2 = input.nextInt();
		
		// Fechando o objeto Scanner
		input.close();
		
		if (num1 == num2) {
			System.out.println("Os dois numeros são iguais.");
		}
		else {
			System.out.println("O maior numero e " + Math.max(num1, num2));
		}
	}
}

