import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int l,c;
		System.out.println("Quantas linhas deseja?");
		l=input.nextInt();
		System.out.println("Quantas colunas deseja?");
		c=input.nextInt();
		int[][] Tabela = new int [l][c];
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<l;j++)
			{
				System.out.println("Insira numeros");
				Tabela[i][j]=input.nextInt();
			}		
		}
		input.close();
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(Tabela[i][j]);
			}		
			System.out.println("");	
		}
	}
}
