package lista07_Arrays;

import java.util.Scanner;

public class Lista7Q09_Idades {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int [] vetorA = new int [10];
		int qtd = 0;
				
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe as idades do grupo:");
			vetorA[i] = leia.nextInt();
		}
		System.out.println("");
		System.out.println("As idades acima de 35 anos são:");
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] > 35) {
				System.out.println(vetorA[i]);
				qtd++;
			}			
		}
		
		System.out.println("");
		
		System.out.println("Um total de " + qtd + " pessoas tem mais de 35 anos.");
		
		leia.close();



	}

}
