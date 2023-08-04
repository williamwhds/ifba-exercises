package atividades;

import java.util.Scanner;

public class atividadeD {
	public static void main (String args[]) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Insira o valor de x");
	float x = input.nextFloat();
	
	System.out.println("Insira o valor de y");
	float y = input.nextFloat();
	
	System.out.println("Escolha a operacao:");
	System.out.println("1. soma");
	System.out.println("2. subtracao");
	System.out.println("3. multiplicacao");
	System.out.println("4. divisao");
	System.out.println();
	
	int escolha = input.nextInt();
	
	input.close();
	
	switch (escolha) {
	case 1: // Soma
		System.out.println(x + " + " + y + " = " + (x+y));
		break;
	case 2: // Subtração
		System.out.println(x + " - " + y + " = " + (x-y));
		break;
	case 3: // Multiplicação
		System.out.println(x + " * " + y + " = " + (x*y));
		break;
	case 4: // Divisão
		System.out.println(x + " / " + y + " = " + (x/y));
		break;
	default: // Operação inválida
		System.out.println("Insira uma operacao valida.");
		break;
		}
	}
}
