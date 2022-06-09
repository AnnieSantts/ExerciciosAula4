package generationAtividades.aula4;

import java.util.Scanner;

public class Atividade4Aula4 {

	public static void main(String[] args) {
		/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos. */
		int sexo, temperamento;
		int idade,totalCalmos, totalMulheresNervosas, totalHomensAgressivos, outrosCalmos, maisde40Nervosos, menos18Calmos;
		int contador = 0;
		totalCalmos = 0;
		totalMulheresNervosas= 0;
		totalHomensAgressivos = 0;
		outrosCalmos = 0;
		maisde40Nervosos = 0;
		menos18Calmos = 0;
		
		while(contador <=9) {
			contador = contador +1;
			System.out.println("Por favor, informe sua idade ");
			Scanner leia = new Scanner(System.in);
			idade = leia.nextInt();
			System.out.println("Por favor, informe seu sexo \n");
			System.out.println("(1-feminino / 2-masculino / 3-Outros)");
			sexo = leia.nextInt();
			System.out.println("Você se considera: 1- calma; 2- nervosa ou 3- agressiva");
			temperamento =leia.nextInt();
			if(temperamento == 1) {
				totalCalmos +=1;
				if(sexo == 1) {
					totalMulheresNervosas +=1;
				}
			}
			if(sexo == 2 ) {
				totalHomensAgressivos = totalHomensAgressivos+1;
			}
			if(sexo == 3 && temperamento == 1) {
				outrosCalmos = outrosCalmos + 1;
			}
			if(temperamento == 2 && idade >40) {
				maisde40Nervosos +=1;
			}
			if(idade < 18 && temperamento == 1) {
				menos18Calmos +=1;
			}
			
		}
		
		System.out.println("O número de pessoas calmas foi de: " + totalCalmos);
		System.out.println("O número total de mulheres nervosas foi de: " + totalMulheresNervosas);
		System.out.println("O número de homens agressivos foi de: " + totalHomensAgressivos);
		System.out.println("O número de outros calmos foi de: " + outrosCalmos);
		System.out.println("número de pessoas nervosas com mais de 40 anos foi de: " + maisde40Nervosos );
		System.out.println("O número de pessoas calmas com menos de 18 anos foi de: " + menos18Calmos);
		

	}

}
