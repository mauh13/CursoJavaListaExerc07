package lista07_Arrays;

import java.util.Scanner;

public class Lista7Q04_Pares {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int [] vetorA = new int [10];
		int par = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o valor da posição " + i + " do VETOR A:");
			vetorA[i] = leia.nextInt();
		}
		
		System.out.println("");

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				System.out.println(vetorA[i] + " é um número par");
				par++;
			}
		}
		
		System.out.println("");
		
		System.out.println("O Vetor A possuí " + par + " número(s) par(es).");
		
		leia.close();

	}

}
