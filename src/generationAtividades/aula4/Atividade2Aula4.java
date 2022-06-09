package generationAtividades.aula4;

import java.util.Scanner;

public class Atividade2Aula4 {

	public static void main(String[] args) {
		// Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		int valor = 0;
		int par = 0;
		int impar = 0;
		for(int numero= 0; numero <10; numero++) {
		int i = 1+ numero;	
		System.out.println("Informe o "+ i + "º numero");
		Scanner leia = new Scanner(System.in);
		valor = leia.nextInt();
		
		if(valor%2 == 0) {
			par++;
		}else
		{
			impar++;
		}
		
		}
		System.out.println("A quantidade de valores pares informados foi de: " + par);
		System.out.println("A quantidade de valores ímpares informados foi de: " + impar);
	}

}
