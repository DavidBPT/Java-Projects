import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {
		int T,par=0,impar=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Quantos numero quer introduzir?");
		T=input.nextInt();
		int [] numeros= new int [T];
		for(int i=0;i<T;i++)
		{
			System.out.print("Insira o numero: ");
			numeros[i]=input.nextInt();
		}
		input.close();
		int [] pares= new int [T];
		int [] impares= new int [T];
		for(int i=0;i<T;i++)
		{
			if(numeros[i]==0){}
			else if(numeros[i]%2==0)
			{		
				pares[i] = numeros[i];
				par++;	
			}
			else if(numeros[i]%2!=0)
			{				
				impares[i] = numeros[i];
				impar++;
			}
		}
		System.out.print("Existem "+par+" numeros pares e "+impar+" numeros impares");
	}
}