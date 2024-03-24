package alturaalunoos;

import java.util.Scanner;

public class AlturaAlunos {
	public static void main(String[] args) {
		
		int qntda;
		float[] altura;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de alunos:");
		qntda = entrada.nextInt();
		
		altura = new float[qntda];
		
		for(int i = 0; i<qntda; i++) {
			System.out.println("Digite a altura do aluno "+ (i+1)+":");
			altura[i] = entrada.nextFloat();
		}
		
		entrada.close();
		
		float alturaMaxima = altura[0];
		int indiceAlunoMaisAlto = 0;
		
		for(int i = 1; i < qntda; i++) {
			if(altura[i] > alturaMaxima) {
				alturaMaxima = altura[i];
				indiceAlunoMaisAlto = i;
			}
		}
		System.out.println("O aluno mais alto é: " + alturaMaxima);
		System.out.println("O número do aluno mais alto é: " + (indiceAlunoMaisAlto+1));
		
		float alturaMinima = altura[0];
		int indiceAlunoMaisBaixo=0;
		
		for(int i = 1; i<qntda; i++) {
			if(altura[i] < alturaMinima) {
				alturaMinima = altura[i];
				indiceAlunoMaisBaixo = i;
			}
		}
		System.out.println("O aluno mais baixo é: " + alturaMinima);
		System.out.println("O número do aluno mais baixo é: " + (indiceAlunoMaisBaixo+1));
		
	}
}
