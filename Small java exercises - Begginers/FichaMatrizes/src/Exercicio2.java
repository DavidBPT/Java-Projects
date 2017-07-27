import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N;
		System.out.println("Quantas nomes deseja inserir?");
		N=input.nextInt();
		int M=N;
		String[][] Tabela = new String [N][M];
		for(int i=0;i<N;i++)
		{
			System.out.println("Insira o nome da "+ (i+1) + "º pessoa");
			Tabela[i][0] = input.next();
			for(int j=0;j<1;j++)
			{
				System.out.println("Insira a morada da "+ (i+1) + "º pessoa");
				Tabela[i][j+1] = input.next();
			}	
		}
		input.close();
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<1;j++)
			{
				System.out.print("A morada de "+Tabela[i][j]+" é "+Tabela[i][j+1]);
			}		
			System.out.println(" ");	
		}
	}
}