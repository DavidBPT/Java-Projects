import java.util.Scanner;

public class MatrizExemplo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int[][] notas;
		notas=new int [3][4];
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=3;j++)
			{
				System.out.println("Insira um numero");
				notas[i][j]=input.nextInt();
			}
		}
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=3;j++)
			{
				System.out.print(notas[i][j] + ",");
			}
			System.out.println();
		{		
				
	}

}
	}}
