import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N;
		System.out.println("Insira quantos numeros deseja");
		N=input.nextInt();
		int[] numeros= new int[N];
		for(int i=0;i<numeros.length;i++)
		{
			System.out.println("Insira um numero");
			numeros[i]=input.nextInt();

		}
		for(int i=0;i<numeros.length;i++)
		{
			System.out.println("O numero inserido é: "+numeros[i]);

		}
		input.close();
		
		
		
	}

}
