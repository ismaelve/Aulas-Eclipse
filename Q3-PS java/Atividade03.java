package javaEclipse;//Questão 3- Programação Sequencial

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		
		/*Faça um sistema que leia o tempo de duração de um evento em 
		 * uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		  */
		
		//ler tempo segundos
			//Converter segundos para horas
			//Converter resto do tempo em minutos
			//Converter a sobra em segundos
		
		int totalSeg, horas, min, seg;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite o total do evento em segundos: ");
		totalSeg=ler.nextInt();
		
		
		horas=totalSeg/3600;//feito para converter em horas. Como se fosse multiplicado 2 vezes por 60
		System.out.println("\nQuantia de horas: "+horas);
		
		min=(totalSeg/60)%60;
		System.out.println("\nQuantia de minutos: "+min);
		
		seg=(totalSeg%60)%60;
		System.out.println("\nQuantia de segundos: "+seg);
		
		
		
		

	}

}
