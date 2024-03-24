package usuárioeSenha;
import java.util.Scanner;

public class UsuarioeSenha {
	public static void main(String[] args){
		
		int usuario=1234;
		int senha=9999;
		int usuariodigitado;
		int senhadigitada;
		
		
		Scanner entrada = new Scanner(System.in);
		
		while(true) {
		System.out.println("Digite o código de usuário:");
		usuariodigitado= entrada.nextInt();
		
		if(usuariodigitado == usuario) {
			System.out.println("Digite a senha: ");
			senhadigitada = entrada.nextInt();
			
			if(senhadigitada == senha) {
				System.out.println("Acesso permitido.");
				break;
				} else {
					System.out.println("Senha incorreta!");
				}
			} else {
				System.out.println("Usuário inválido! ");
			}
		}		
	}	
}

