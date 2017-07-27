import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		String s, nomeFx = "novo.txt";
		Scanner input = new Scanner(System.in);
		
		// declarar descritor para acesso ao ficheiro em modo escrita
		BufferedWriter f = null;
		
		try {
		// abrir o ficheiro de texto
		f = new BufferedWriter(new FileWriter(nomeFx,true));
			}
		catch(Exception e) {
		// ocorreu um erro na abertura do ficheiro, logo:
			System.out.println("Impossível criar o ficheiro " + nomeFx);
			System.out.println("fim do programa...");
		return;
			
		}
		s = input.nextLine(); // ler uma linha do teclado
		
		while(s.length() > 0) { // termina quando digitar <enter>
			f.write(s); // escrever a linha no ficheiro
			f.newLine(); // inserir mudança linha no ficheiro
			s = input.nextLine(); // ler outra linha do teclado
		}
		input.close();
		f.close(); // fechar o ficheiro
		
		System.out.println("O conteúdo foi armazenado no ficheiro " + nomeFx);
	}
}
/*_------------------------------------------------------------------------------------------------------------

 Ao alterar false para true, permite inserir novo texto sem eliminar o que já lá está, ou seja, faz "append"

/_------------------------------------------------------------------------------------------------------------*/