import java.util.Scanner;

public class Rectangulo {

	public static void main(String[] args) {
		System.out.println("Insira o comprimento e a largura do rectangulo");
		
		Scanner input = new Scanner(System.in);
		
		float comprimento=input.nextFloat();
		float largura=input.nextFloat();
		input.close();
		float area= comprimento*largura;
		float perimetro = 2*comprimento+2*largura;
		System.out.print("A area do rectangulo é "+area+" e o perimetro é "+perimetro);
		

	}

}
