package descontoprodutos;

import java.util.Scanner;

public class Descontoproduto {
	public static void main(String[] args) {
		
		//chamando variáveis
		String nome;
		int quantidade;
		float preco;
		float valortotal;
		float desconto;
		double pagartotal;
		
		//criando entrada de dados
		Scanner entrada = new Scanner(System.in);
		
		//pedindo nome do produto
		System.out.println("Informe o nome do produto:");
		nome = entrada.nextLine();
		
		//pedindo a quantidade do produto que foi adiquirida
		System.out.println("Informe a quantidade de " + nome + " que foi adiquirida");
		quantidade = entrada.nextInt();
		
		//pedindo o preço unitário do produto
		System.out.println("Informe o preço unitário do produto");
		preco = entrada.nextFloat();
		
		//calculando o total
		valortotal = quantidade*preco;
		
		//printando o total
		System.out.println("O preço total foi R$"+valortotal);
		
		if(quantidade<=5) {
			//calculando o desconto
			pagartotal=valortotal*0.98;
			
			//printando o valor com desconto
			System.out.println("O valor a se pagar com desconto será de R$"+pagartotal);
		} else if(quantidade<=10){
			//calculando desconto de 3%
			pagartotal=valortotal*0.97;
			
			//printando valor com 3% de desconto
			System.out.println("O valor a se pagar com desconto será de R$"+pagartotal);
		} else if(quantidade>10) {
			
			pagartotal=valortotal*0.95;
			System.out.println("O valor a se pagar com desconto sera de R$"+pagartotal);
		} else {
			System.out.println("O valor a se pagar sera de R$"+valortotal);
		}
		
	}
}
