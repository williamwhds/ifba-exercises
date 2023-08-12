package atividades;

import java.util.Random;

public class atividadeG {
	static long fatorial(int n) {
	    long fat = 1;
	    for (int i = 2; i <= n; i++) {
	        fat = fat * i;
	    }
	    return fat;
	}
	
	public static void main (String args[]) {
		Random aleatorio = new Random();
		
		int[] T = new int[15];
		long[] Fat = new long[15];
		String output = "";
		int num;
		int index = 0;
		
		for (int n : T) {
			n = aleatorio.nextInt(0, 21); 	// Cada elemento de T será um numero aleatório entre 0 e 20.
											// Fatoriais acima do número 20 são longos demais para uma
			num = n;						// variável de tipo long.
			output = "Fatorial de " + n + " = ";
			
			if (num == 1 || num == 0) {
				Fat[index] = fatorial(n);
				System.out.println("Fatorial de " +num+ " = 1");
				index++;
			} else {
				while (num != 1) {
					output += num + "*"; 
					num--;
				}
				
				Fat[index] = fatorial(n); // Guardando fatorial de cada elemento de T em Fat
				
				output += num + " = " + Fat[index]; 
				
				index++;
				
				System.out.println(output); // Mostrando o resultado como exemplificado no documento
			}
		}
	}
}
