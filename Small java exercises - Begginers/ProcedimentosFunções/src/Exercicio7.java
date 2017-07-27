import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		
		int[][] Tabela = new int [5][5];
		for(int i=0;i<Tabela.length;i++)
		{
			for(int j=0;j<Tabela.length;j++)
			{
				System.out.println("Insira numeros");
				Tabela[i][j]=input.nextInt();
			}		
		}
	}

}
