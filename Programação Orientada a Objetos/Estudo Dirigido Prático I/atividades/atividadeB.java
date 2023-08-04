package atividades;

import java.util.Scanner;

public class atividadeB {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira a nota da primeira prova. (Peso 3)");
		float notaprova1 = input.nextFloat();
		
		if (notaprova1 > 3) // Variável não pode passar de 3
		{  
			notaprova1 = 3;
		}
		
		System.out.println("Insira a nota da segunda prova. (Peso 3)");
		float notaprova2 = input.nextFloat();
		
		if (notaprova2 > 3)
		{  
			notaprova2 = 3;
		}
		
		System.out.println("Insira a nota do primeiro trabalho. (Peso 1)");
		float notatrabalho = input.nextFloat();
		
		if (notatrabalho > 1) {
			notatrabalho = 1;
		}
		
		input.close();
		
		float calculoMedia = ((notaprova1 * 3) + (notaprova2 * 3) + notatrabalho)/7;
		
		if (calculoMedia >= 7) {
			System.out.println("Aprovado. " + calculoMedia);
		}
		else {
			System.out.println("Reprovado. " + calculoMedia);
		}
	}
}
