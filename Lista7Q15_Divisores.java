package lista07_Arrays;

import java.util.Scanner;

public class Lista7Q15_Divisores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int [] vetorA = new int [4];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite um número: ");
			vetorA[i] = leia.nextInt();
		}
		
		System.out.println("");
		System.out.println("Divisores de cada elemento do vetor A:");
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + ": ");
			for (int j = 1; j < vetorA[i]; j++) {
				if (vetorA[i] % j == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println("");
		}

		leia.close();

	}

}
