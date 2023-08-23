package atividades;

import java.util.Random;

public class AtividadeI {
	public static void main (String args[]) {
		Random aleatorio = new Random();
		
		int index = 0;
		int[] menoresQueDez = new int[9];
		
		int[][] matriz = new int[3][3];
		
		for (int i = 0; i < matriz.length; i++) {
			  for (int j = 0; j < matriz[i].length; j++) {
			    matriz[i][j] = aleatorio.nextInt(1, 21);	// Indices da matriz serão números aleatórios entre 1 e 20
			  }
			}
		
		System.out.println("Indices da matriz 3x3:");
		
		for (int i = 0; i < matriz.length; i++) {
			  for (int j = 0; j < matriz[i].length; j++) {
			    System.out.print(matriz[i][j] + ",");
			    if (matriz[i][j] > 10) {
			    	menoresQueDez[index] = matriz[i][j];	// Passando por cada indice e adicionando a um vetor se forem maiores que 10
			    	index++;
			    }
			  }
			  System.out.println();
			}
		
		System.out.println();
		System.out.println("Indices maiores que 10:");
		for (int i : menoresQueDez) {
			if (i != 0) {
			System.out.println(i);
			}
		}
		
	}
}
