import java.util.ArrayList;
import java.util.Scanner;

public class TesteComListas {

	public static void main(String[] args) {
		int T,n;
		Scanner input=new Scanner(System.in);
		System.out.println("Quantos numero quer introduzir?");
		T=input.nextInt();
		ArrayList<Integer> numeros= new ArrayList<>();
		ArrayList<Integer> pares= new ArrayList<>();
		ArrayList<Integer> impares= new ArrayList<>();
		for(int i=0;i<T;i++)
		{
			System.out.print("Insira o numero: ");
			n=input.nextInt();
			numeros.add(n);
			if(n==0){}
			else if(n%2==0)
			{		
				
				pares.add(n);
			}
			else if(n%2!=0)
			{				
				impares.add(n);
			}
		}
		input.close();
		System.out.println("Existem "+pares.size() +" numeros pares e "+impares.size()+" numeros impares");
		System.out.println("Pares: "+pares);
		System.out.println("Impares: "+impares);
	}

}
