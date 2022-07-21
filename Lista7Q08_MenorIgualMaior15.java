package lista07_Arrays;

import java.util.Scanner;

public class Lista7Q08_MenorIgualMaior15 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int [] vetorA = new int [10];
		int soma = 0;
		int qtd = 0;
		float media = 0;
		int qtdmedia = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o valor da posição " + i + " do VETOR A:");
			vetorA[i] = leia.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] < 15) {
				soma = soma + vetorA[i];
			}
			if (vetorA[i] == 15) {
				qtd++;
			}
			if (vetorA[i] > 15) {
				media = media + vetorA[i];
				qtdmedia++;
			}
		}
		
		media = (float)media / qtdmedia;
		
		System.out.println("");
		
		System.out.println("A soma dos números menores que 15 no Vetor A é: " + soma);
		System.out.println("A quantidade de elementos armazenados no Vetor A iguais a 15 foi  : " + qtd);
		System.out.println("A média dos números maiores que 15 no Vetor A é: : " + media);
		
		leia.close();


	}

}
