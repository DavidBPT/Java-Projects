import java.io.IOException;

public class Exercicio8 {

	public static void main(String[] args) throws IOException {
		char C;
		System.out.println("Insira uma letra");
		C=(char) System.in.read();
		C=Character.toUpperCase(C);		
		if(C == 'A'|| C == 'E'|| C == 'I'|| C == 'O'|| C == 'U')
			System.out.println("A letra é uma vogal");
		else
			System.out.println("A letra é uma consoante");
	}

}
