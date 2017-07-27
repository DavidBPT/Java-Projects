import java.util.Arrays;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int x,cont=1;
		Scanner input= new Scanner(System.in);	
		System.out.println("Insira um numero de elementos do array");
		x=input.nextInt();
		int[] numeros= new int[x];
		for(int i=0;i<numeros.length;i++)
		{
			System.out.println("Insira um numero");
			numeros[i]=input.nextInt();
		}
		Arrays.sort(numeros);
		for(int i=1; i<numeros.length;i++)
		{
			
			if(numeros[i]==numeros[i-1])
			{	
				cont++;
				System.out.println("O numero: "+numeros[i]+" aparece -> "+cont);
			}
			else if(numeros[i]!=numeros[i-1])
			{	
				cont=0;
				cont++;
			}
			
		}
		
		input.close();
	}

}