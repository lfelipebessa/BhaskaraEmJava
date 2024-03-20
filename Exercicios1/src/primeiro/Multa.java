package primeiro;
import java.util.Scanner;

public class Multa {
	public static void main(String[] args) {
		
		int velmax;
		int velcar;
		int diferenca;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a velocidade máxima da avenida:");
		velmax = entrada.nextInt();
		
		System.out.println("Digite a velocidade em que o carro estava:");
		velcar = entrada.nextInt();
		
		entrada.close();
		
		diferenca = velcar - velmax;
		
		if(diferenca>=1 && diferenca<=10) {
			System.out.println("A multa foi de 50 reais");
		} else if(diferenca>10 && diferenca<=30) {
			System.out.println("A multa foi de 100 reais");
		} else if (diferenca>30) {
			System.out.println("A multa foi de 200 reais");			
		} else {
			System.out.println("O veículo não foi multado");
		}
	}
}
