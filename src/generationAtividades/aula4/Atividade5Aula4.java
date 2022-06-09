package generationAtividades.aula4;

import java.util.Scanner;

public class Atividade5Aula4 {
	/*Crie um programa que leia um número do teclado até que encontre um
	número igual a zero. No final, mostre a soma dos números
	digitados.(DO...WHILE)*/
	
	public static void main(String[] args) {
		int somaNumeros = 0;
		int numeroInformado = 0;
		do {
			System.out.println("Informe um número");
			Scanner leia = new Scanner(System.in);
			numeroInformado = leia.nextInt();
			somaNumeros = somaNumeros + numeroInformado;
			
		}while(numeroInformado != 0);
		
		System.out.println("A soma dos números foi de: " + somaNumeros+ "\n");
		System.out.println("Programa finalizado");
	}
}
