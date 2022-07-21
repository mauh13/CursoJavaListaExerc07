package lista07_Arrays;

import java.util.Scanner;

public class Lista7Q17_ClientesDVD {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String [] cliente = new String [5];
		int [] dvd = new int [cliente.length];
			
		for (int i = 0; i < cliente.length; i++) {
			System.out.print("Informe o nome do " + (i+1) + "� cliente: ");
			cliente [i] = leia.next(); 
			System.out.print("Informe quantos DVDs " + cliente[i] + " locou em 2022: ");
			dvd [i] = leia.nextInt();
		}
		
		System.out.println("");
		
		for (int i = 0; i < dvd.length; i++) {
			if (dvd[i] < 10) {
				System.out.println(cliente[i] + " n�o tem direito a loca��o gratuita.");
			} else if (dvd[i] < 20) {
				System.out.println(cliente[i] + " tem direito a " + dvd[i] / 10 + " loca��o gratuita.");
			} else {
				System.out.println(cliente[i] + " tem direito a " + dvd[i] / 10 + " loca��es gratuitas.");
			}
		}
		
		leia.close();

	}

}
