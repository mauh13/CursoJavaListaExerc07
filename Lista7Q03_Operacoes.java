package lista07_Arrays;

import java.util.Scanner;

public class Lista7Q03_Operacoes {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int [] vetorA = new int [10];
		int [] vetorB = new int [vetorA.length];
		float [] vetorC = new float [vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o valor da posição " + i + " do VETOR A:");
			vetorA[i] = leia.nextInt();
		}
		
		System.out.println("");
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("Informe o valor da posição " + i + " do VETOR B:");
			vetorB[i] = leia.nextInt();
		}
		
		System.out.println("");
		
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.println("O valor da soma dos elementos do vetor A e B na posição " + i + " é: " + vetorC[i]);
		}
		
		System.out.println("");
		
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] - vetorB[i];
			System.out.println("O valor da subtração dos elementos do vetor A e B na posição " + i + " é: " + vetorC[i]);
		}
		
		System.out.println("");
		
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] * vetorB[i];
			System.out.println("O valor da multiplicação dos elementos do vetor A e B na posição " + i + " é: " + vetorC[i]);
		}
		
		System.out.println("");
		
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = (float) vetorA[i] / vetorB[i];
			System.out.println("O valor da divisão dos elementos do vetor A e B na posição " + i + " é: " + vetorC[i]);
		}
		
		leia.close();
	}

}
