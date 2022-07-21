package lista07_Arrays;

import java.util.Scanner;

public class Lista7Q12_TodosPares {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[] vetorA = new int[10];
    	
    	boolean impar = false;
    	int j = 0;

    	for (int i = 0; i < vetorA.length; i++) {
    	    System.out.print("Informe um número: ");
    	    vetorA[i] = leia.nextInt();
    	}

    	System.out.println("");
    	
    	System.out.println("Verificação: ");
    	
    	while (j < vetorA.length && !impar) {
    	    if (vetorA[j] % 2 == 0) {
    	    System.out.print(vetorA[j] + " ");
    	    } else {
    	    	impar = true;
    	    }
    	    	j++;
        	}
    	
		leia.close();
		
	}

}
