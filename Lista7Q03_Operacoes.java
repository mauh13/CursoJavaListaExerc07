package lista07_Arrays;

import java.util.Scanner;

public class Lista7Q03_Operacoes {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int [] vetorA = new int [10];
		int [] vetorB = new int [vetorA.length];
		float [] vetorC = new float [vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o valor da posi��o " + i + " do VETOR A:");
			vetorA[i] = leia.nextInt();
		}
		
		System.out.println("");
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("Informe o valor da posi��o " + i + " do VETOR B:");
			vetorB[i] = leia.nextInt();
		}
		
		System.out.println("");
		
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.println("O valor da soma dos elementos do vetor A e B na posi��o " + i + " �: " + vetorC[i]);
		}
		
		System.out.println("");
		
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] - vetorB[i];
			System.out.println("O valor da subtra��o dos elementos do vetor A e B na posi��o " + i + " �: " + vetorC[i]);
		}
		
		System.out.println("");
		
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] * vetorB[i];
			System.out.println("O valor da multiplica��o dos elementos do vetor A e B na posi��o " + i + " �: " + vetorC[i]);
		}
		
		System.out.println("");
		
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = (float) vetorA[i] / vetorB[i];
			System.out.println("O valor da divis�o dos elementos do vetor A e B na posi��o " + i + " �: " + vetorC[i]);
		}
		
		leia.close();
	}

}
