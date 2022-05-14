package javaEclipse;//Questão 2 - laços de repetição

import java.util.Scanner;

public class AtidadeLR {

	public static void main(String[] args) {
		
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

		//ler números 
			//imprimir quantos são pares 
			//imprimit quantos são ímpares
		
		int x,num,quantPar=0,quantImp=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(x=0;x<=9;x++) 
		{
			System.out.println("\nDigite um número: ");
			num=ler.nextInt();
			
			if(num%2==0) 
			{
				quantPar++;
			}
			else
			{
				quantImp++;
			}
			
		}
		System.out.println("\nQuantidade de números pares: "+quantPar);
		System.out.println("\nQuantidade de números ímpares: "+quantImp);
		
		
		
		
		
	}
	

}
