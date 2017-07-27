import java.io.IOException;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) throws IOException {
		char C;
		System.out.println("Insira o sexo");
		C=(char) System.in.read();
		C=Character.toUpperCase(C);		
		if(C == 'F')
			System.out.print("Feminino");
		else if(C=='M')
			System.out.print("Masculino");
		else
			System.out.print("Sexo inválido");
	}

}
