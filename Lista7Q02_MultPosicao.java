package lista07_Arrays;

import java.util.Scanner;

public class Lista7Q02_MultPosicao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int [] vetorA = new int [10];
		int [] vetorB = new int [vetorA.length];
		int [] vetorC = new int [vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o valor da posi��o " + i + ":");
			vetorA[i] = leia.nextInt();
			vetorB[i] = vetorA[i] * i;
			vetorC[i] = vetorA[i] % 2;
		}
		System.out.println("");
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("VETOR A, posi��o " + i + " = " + vetorA[i]);
		}
		
		System.out.println("");
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("VETOR B, posi��o " + i + " = " + vetorB[i]);
		}

		System.out.println("");
		
		for (int i = 0; i < vetorC.length; i++) {
			System.out.println("VETOR C, posi��o " + i + " = " + vetorC[i]);
		}
		

		leia.close();

	}

}
