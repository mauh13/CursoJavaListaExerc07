package lista07_Arrays;

import java.util.Scanner;

public class Lista7Q07_PercenParImpar {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int [] vetorA = new int [10];
		int par = 0;
		int impar = 0;
				
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o valor da posição " + i + " do VETOR A:");
			vetorA[i] = leia.nextInt();
		}
		
		System.out.println("");

		for (int i = 0; i < vetorA.length; i++) {
			if ((vetorA[i] % 2 == 0) && (vetorA[i] != 0)) {
				par++;
			} else if (vetorA[i] % 2 != 0) {
				impar++;
			} 
		}
		
		par = (par * 100) / vetorA.length;
		impar = (impar * 100) / vetorA.length;
		
		System.out.println("No vetor A há " + par + "% de números pares e " + impar + "% de números ímpares." );

	leia.close();
	
	}

}
