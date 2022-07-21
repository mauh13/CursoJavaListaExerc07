package lista07_Arrays;

public class Lista7Q18_PrimoAcima100 {

	public static void main(String[] args) {
		
		int [] vetorPrimo = new int [10];
		int naoprimo = 0;
		int numero = 100;
		int j = 0;
		
		while (j < vetorPrimo.length) {
			for (int i = 2; i < numero; i++) {
				if (numero % i == 0) {
					naoprimo++;
				}
			}	
				if (naoprimo == 0) {
					//System.out.println(numero);
					vetorPrimo[j] = numero;
					j++;
				}
				
			numero++;
			naoprimo = 0;
		}
		
		System.out.print("Os Primeiros 10 números primos depois de 100 são: | ");
		for (int i = 0; i < vetorPrimo.length; i++) {
			System.out.print(vetorPrimo[i] + " | ");
		}
		
	}
}

