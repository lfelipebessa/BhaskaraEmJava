package numerosprimos;

import java.util.Scanner;

public class NmrsPrimos {
	public static void main(String[] agrs) {
		
		int numero;
		int soma=0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número para verificar se é primo:");
		numero = entrada.nextInt();
		
		for(int i=1;i<numero*numero;i++) {
			if(numero % i == 0) {
				soma++;
			} 
		}
		if(soma<=2) {
			System.out.println("O número é primo!");
		} else {
			System.out.println("O número não é primo!");
		}
	}
}
