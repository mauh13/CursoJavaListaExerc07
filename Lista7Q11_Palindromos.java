package lista07_Arrays;

import java.util.Scanner;

public class Lista7Q11_Palindromos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		
		int c = 0;
				
		int [] vetorA = new int [10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe um número: ");
			vetorA[i] = leia.nextInt();
		}
		
		System.out.println("");
		
		for (int i = 0; i < vetorA.length/2; i++) {
			if (vetorA[i] != vetorA[vetorA.length-1-i]) { 
				c++;
				
			}
		}
					
		if (c > 0) {
			System.out.println("O Vetor não é um palíndromo.");
		} else {
			System.out.println("O Vetor é um palíndromo.");
		}

		leia.close();
	}

}
