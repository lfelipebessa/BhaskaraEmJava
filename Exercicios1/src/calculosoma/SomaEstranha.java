package calculosoma;

public class SomaEstranha {
	public static void main(String[] args) {
		
		double soma=0.0;
		double j=1.0;
		
		for(int i=1; i<=50;i++) {
			soma = soma+(j/i);
			j=j+2.0;
		}
		System.out.println("A soma é: "+soma);
	
	}
}
