package lista07_Arrays;

import java.util.Scanner;

public class Lista7Q16_Compactado {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int [] vetor = new int [10];
		int tam = 0;
		int j = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = leia.nextInt();
			if (vetor[i]>0) {
				tam++;
			}
		}
		
		int [] compact = new int [tam];
		
		for (int i = 0; i < vetor.length; i++) {
				if (vetor[i] > 0) {
					compact[j] = vetor[i];
					j++;
				} 
			}
				
		System.out.println("");
		
		System.out.print("Vetor original: | ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " | " );
		}
		
		System.out.println("");
		
		System.out.print("Vetor compactado: | ");
		for (int i = 0; i < compact.length; i++) {
			System.out.print(compact[i] + " | " );
		}

		leia.close();
	}

}
