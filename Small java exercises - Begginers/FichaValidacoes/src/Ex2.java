import java.io.IOException;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) throws IOException {
		char c;
		Scanner input = new Scanner(System.in);
		System.out.println("Insira a sua categoria profissionl");
		c=(char) System.in.read();
		try{
			if(c=='C' || c=='D' || c=='E'||c=='c' || c=='d' || c=='e')
			{
				System.out.println("Categoria válida");
			}
			else
				throw new Exception();
		}
		catch(Exception e){
			System.out.println("Categoria Inválida. Insira apenas categoria C,D ou E");
		}
		input.close();
	}

}
