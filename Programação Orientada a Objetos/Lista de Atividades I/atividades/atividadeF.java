package atividades;

import java.util.Random;

public class atividadeF {
	public static void main (String args[]) {
		Random aleatorio = new Random();
		
		int[] C = new int[50]; // Iniciando um vetor com 50 elementos
		
		int maior_elemento = 0;
		
		System.out.println("Segue todos os elementos de C[50] :");
		
		for (int n : C) { // Passando sobre cada elemento em C
			n = aleatorio.nextInt(1, 501); // Dando um valor inteiro aleatório entre 1 e 500 para cada elemento em C
			System.out.println(n);
			if (n > maior_elemento) { // Se n for maior que o maior_elemento, atualizar maior_elemento
				maior_elemento = n;
			}
		}
		
		System.out.println();
		System.out.println("Maior elemento de C = " + maior_elemento);
	}
}
