package lista07_Arrays;

import java.util.Scanner;

public class Lista7Q06_MediaImpares {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int [] vetorA = new int [10];
		int impar = 0;
		float media = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Informe o valor da posi��o " + i + " do VETOR A:");
			vetorA[i] = leia.nextInt();
		}
		
		System.out.println("");

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				System.out.println(vetorA[i] + " � um n�mero �mpar");
				media += vetorA[i]; // teste
				impar++;
			}
		}
		
		media = (float) media / impar;
		
		System.out.println("");
		
		System.out.println("A m�dia dos n�meros �mpares do Vetor A �: " + media);
		
		leia.close();

	}

}
