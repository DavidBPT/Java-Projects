import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int i=0,R=0;
		int[] numeros= new int[100];  //100 limite
		do
		{
			System.out.println("Insira numeros. Termine com 999");
			R=input.nextInt();
			if(R!=999)
			{
				numeros[i]=R; // escrever na primeira posição
				i++;
			}
		}while(R!=999);
		input.close();
		for(int j=0;j<i;j++)
		{
			System.out.println("Os numero inseridos foram: "+numeros[j]);
		}
	}

}
