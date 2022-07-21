package lista07_Arrays;

import java.util.Scanner;

public class Lista7Q01_Quadrado {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int [] vetorA = new int [15];
		int [] vetorB = new int [vetorA.length];
				
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o valor da posição " + i + ":");
			vetorA[i] = leia.nextInt();
			vetorB[i] = vetorA[i] * vetorA[i]; 
		}
		
		System.out.println("");
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("VETOR A, posição " + i + " = " + vetorA[i]);
		}
		
		System.out.println("");
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("VETOR B, posição " + i + " = " + vetorB[i]);
		}
		
		leia.close();

	}

}
