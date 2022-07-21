package lista07_Arrays;

import java.util.Scanner;

public class Lista7Q14_Juncao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int [] vetorA = new int [10];
		int [] vetorB = new int [vetorA.length];
		int [] vetorC = new int [vetorA.length*2];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite um número para a posição " + i + " do vetor A: ");
			vetorA[i] = leia.nextInt();
		}
		
		System.out.println("");

		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("Digite um número para a posição " + i + " do vetor B: ");
			vetorB[i] = leia.nextInt();
		}
		
		System.out.println("");
		
		for (int i = 0; i < 10; i++) {
			vetorC[i] = vetorA[i];
			vetorC[vetorA.length + i] = vetorB[i];
		}
		
		System.out.println("Verificação:");
		System.out.println("");
		System.out.print("Vetor A: ");
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println("");
		System.out.print("Vetor B: ");
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println("");
		System.out.print("Vetor C: ");
		
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		
		
		leia.close();
	}

}
