import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int altura, cump;
		Scanner input = new Scanner(System.in);
		System.out.print("Altura : ");
		altura = input.nextInt();
		System.out.print("Cumprimento : ");
		cump = input.nextInt();
		input.close();
		for(int i=1;i<=altura;i++)
		{
			System.out.println(" ");
			for(int j=1;j<=cump;j++)
			{
				System.out.print("*");
			}
		}

	}

}
