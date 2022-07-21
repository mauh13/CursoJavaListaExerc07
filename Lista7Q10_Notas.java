package lista07_Arrays;

import java.util.Scanner;

public class Lista7Q10_Notas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float [] nota1 = new float [10];
		float [] nota2 = new float [nota1.length];
		float [] result = new float [nota1.length];
		
		for (int i = 0; i < nota1.length; i++) {
			System.out.print("Informe a primeira nota do " + (i+1) + "º aluno: ");
			nota1[i] = leia.nextFloat();
			while (nota1[i] < 0 || nota1[i] >10) {
				System.out.print("Favor digitar uma nota entre 0 e 10: ");
				nota1[i] = leia.nextFloat();
			}
		}
		
		System.out.println("");
		
		for (int i = 0; i < nota1.length; i++) {
			System.out.print("Informe a segunda nota do " + (i+1) + "º aluno: ");
			nota2[i] = leia.nextFloat();
			while (nota2[i] < 0 || nota2[i] >10) {
				System.out.print("Favor digitar uma nota entre 0 e 10: ");
				nota2[i] = leia.nextFloat();
			}
		}
		
		System.out.println("");
		
		for (int i = 0; i < result.length; i++) {
			result[i] = (nota1[i] + nota2[i])/2;
			if (result[i] >= 7) {
				System.out.println("A média do " + (i+1) + "º aluno é " + String.format("%.2f", result[i]) + ", situação: APROVADO");
			} else {
				System.out.println("A média do " + (i+1) + "º aluno é " + String.format("%.2f", result[i]) + ", situação: REPROVADO");
			}
		}
		
		
		leia.close();

	}

}
