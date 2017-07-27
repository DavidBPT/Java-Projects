import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		float A,B;
		Scanner input = new Scanner(System.in);
		System.out.println("Insira um valor");
		A=input.nextFloat();
		System.out.println("Insira um valor");
		B=input.nextFloat();
		input.close();
		if(A>B)
		{
			System.out.printf("O valor %f é maior que %f",A,B);
		}
		else if(B>A)
		{
			System.out.printf("O valor %f é maior que %f",B,A);
		}
		else
		{
			System.out.printf("Os valores sao iguais");
		}
	}

}
