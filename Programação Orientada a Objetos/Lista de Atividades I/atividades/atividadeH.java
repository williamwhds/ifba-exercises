package atividades;

import java.util.Random;

public class atividadeH {
	public static void main (String args[]) {
		int[] V = new int[10];
		int[] COMP = new int[10];
		
		Random aleatorio = new Random();
		
		System.out.println("Indices de V:");
		
		for (int i = 0; i < 10; i++) {
			V[i] = aleatorio.nextInt(1, 21); // Elementos de V serão números aleatórios entre 1 e 20
			System.out.println(V[i]);
		}
		
		int index = 0;
		
		System.out.println("Indices de V menores que 10 / Indices de COMP:");
		
		for (int i : V) {
			if (i < 10) {
				COMP[index] = i;
				index++;
				System.out.println(i);
			}
			
		}
	}
}
