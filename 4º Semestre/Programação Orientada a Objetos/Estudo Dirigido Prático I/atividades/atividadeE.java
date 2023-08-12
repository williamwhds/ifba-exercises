package atividades;

import java.util.Scanner;

public class atividadeE {
	static String conversorTempo (double quantidade_segundos) {
		String tempo = null;
		
		double quantidade_minutos = Math.floor(quantidade_segundos/60);
		
		long segundos = Math.round(quantidade_segundos % 60);
		long horas = Math.round(Math.floor(quantidade_minutos / 60));
		long minutos = Math.round(quantidade_minutos % 60);
		
		tempo = horas+":"+minutos+":"+segundos;
		
		return tempo;
		}
	
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de tempo em segundos para a conversao. (Sera convertido em HH:MM:SS)");
		
		int segundos = input.nextInt();

		String tempo = conversorTempo(segundos); 
		
		System.out.println(tempo);
		
		input.close();
		
		
		}
	}
