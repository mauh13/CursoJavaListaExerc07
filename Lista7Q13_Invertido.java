package lista07_Arrays;

import java.util.Scanner;

public class Lista7Q13_Invertido {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
    	    System.out.print("Informe um número: ");
    	    vetorA[i] = leia.nextInt();
    	}

		for (int i = 0; i < vetorB.length; i++) {
    	    vetorB[vetorB.length-1-i] = vetorA[i];
    	}
		
		System.out.println("");
    	
    	System.out.println("Verificação: ");
    	
    	System.out.println("");
    	
    	for (int i = 0; i < vetorB.length; i++) {
    		System.out.println(vetorA[i] + " <-- VetorA | posição " + i + " | VetorB --> " + vetorB[i]);
    	}
    	    	    			
		leia.close();

	}

}
