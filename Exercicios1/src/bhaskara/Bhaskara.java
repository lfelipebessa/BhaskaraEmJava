package bhaskara;
import java.util.Scanner;

public class Bhaskara {
	public static void main(String[] str) {
		
		//declarando variaveis
		int valorA;
		int valorB;
		int valorC;
		double delta;
		double x1,x2;
		
		Scanner entrada = new Scanner(System.in);//prepara para obter a entrada do usuário no console
		
		System.out.println("Uma função de segundo grau possui a seguinte estrutura: Ax²+Bx+C=0");
		System.out.println("Dada tal informação digite o valor de A: ");
		valorA = entrada.nextInt();//recebe o valor de A
		
		System.out.println("Digite o valor de B: ");
		valorB = entrada.nextInt();//recebe o valor de B
		
		System.out.println("Digite o valor de C: ");
		valorC = entrada.nextInt();//recebe o valor de C
		
		entrada.close();//fecha a entrada de dados
		
		delta= Math.pow(valorB,2)-(4*valorA*valorC);
		
		if(delta>0) {
			x1 = (-valorB +Math.sqrt(delta))/(2*valorA);
			x2 = (-valorB -Math.sqrt(delta))/(2*valorA);
			System.out.println("As raízes são reais e distintas:");
			System.out.println("As raízes são x1: " + x1 + " e x2: " + x2);
		} else if(delta==0) {
			//Raízes reais e iguais
			x1= (-valorB)/(2 * valorA);
			System.out.println("As  raízes são reais e iguais:");
			System.out.println("x1 = x2 = " + x1);
		} else {
			//Raizes complexas conjugadas
			double parteReal = -(valorB)/(2 * valorA);
			double parteImaginaria = Math.sqrt(Math.abs(delta))/(2 * valorA);
			System.out.println("As raízes são complexas e conjugadas:");
			System.out.println("x1 = "+ parteReal + " + " + parteImaginaria +"i");
			System.out.println("x2 = "+ parteReal + " - " + parteImaginaria +"i");
		}
		
	}
	
}
