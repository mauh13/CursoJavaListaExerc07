package lista07_Arrays;

import java.util.Scanner;

public class Lista7Q05_Mult5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int [] vetorA = new int [10];
		int soma = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o valor da posi��o " + i + " do VETOR A:");
			vetorA[i] = leia.nextInt();
		}
		
		System.out.println("");

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 5 == 0) {
				System.out.println(vetorA[i] + " � um n�mero m�ltiplo de 5.");
				soma = soma + vetorA[i];
			}
		}
		
		System.out.println("");
		
		System.out.println("A soma dos m�ltiplos de 5 �: " + soma);
		
		leia.close();


	}

}
