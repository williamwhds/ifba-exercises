package atividades;

import java.util.Scanner;

public class atividadeC {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o primeiro numero.");
		float num1 = input.nextFloat();
		
		System.out.println("Insira o segundo numero.");
		float num2 = input.nextFloat();
		
		input.close();
		
		if (num1 % num2 == 0) {
			System.out.println(num1 + " e multiplo de " + num2);
		} else {
			System.out.println(num1 + " nao e multiplo de " + num2);
		}
	}

}
