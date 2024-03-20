package verificacaodigito;
import java.util.Scanner;

public class VerificacaoDigito {
	public static void main(String[] args) {
		
		char caractere;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite algum caracter:");
		caractere = entrada.next().charAt(0);
		
		//verificando se o caracter é um número
		if(Character.isDigit(caractere)) {
		System.out.println(caractere +" é um número.");
		} 
		//verificando se o caracter é uma das vogais
		else if("aeiouAEIOU".indexOf(caractere) != -1) {
			System.out.println(caractere +" é uma vogal");
		} 
		//verificando se o caracter é qualquer letra
		else if(Character.isLetter(caractere)) {
			System.out.println(caractere+" é uma consoante.");
		} 
		//verifying se o caracter é qualquer outro que não foi verificado acima
		else {System.out.println(caractere+" é outro");
		}
		
		entrada.close();
	}
}
