import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		float A;
		Scanner input =new Scanner(System.in);
		System.out.println("Insira um valor");
		A=input.nextFloat();
		input.close();
		if(A>=0)
		{
			System.out.println("O numero é positivo");
		}
		else
			System.out.println("O valor é negativo");
		
		
	}

}
