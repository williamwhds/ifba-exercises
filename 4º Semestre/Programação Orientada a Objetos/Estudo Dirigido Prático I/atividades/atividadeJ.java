package atividades;

import java.util.Random;
import java.util.Scanner;

public class atividadeJ {
	public static void main (String args[]) {
		Random aleatorio = new Random();
		Scanner input = new Scanner(System.in);
		
		int[][] matriz = new int[5][4];
		
		for (int i = 0; i < matriz.length; i++) {
			  for (int j = 0; j < matriz[i].length; j++) {
			    matriz[i][j] = aleatorio.nextInt(1, 31);	// Indices da matriz serão números aleatórios entre 1 e 30
			  }
			}
		
		boolean encontrou = false;
		
		System.out.println("Insira um numero entre 1 e 30. Se ele estiver na lista, sera imprimido o primeiro indice em que ele for encontrado.");
		int x = input.nextInt();
		
		input.close();
		
		String coordenadas = "";
		
		for (int i = 0; i < matriz.length; i++) {
			  for (int j = 0; j < matriz[i].length; j++) {
			    if (matriz[i][j] == x) {
			    	encontrou = true;
			    	coordenadas = i + "x" + j;
			    }
			  }
			}
		
		if (encontrou) {
			System.out.println("Encontrado! " + coordenadas);
		} else {
			System.out.println(x + " nao foi encontrado.");
		}
	}
}
