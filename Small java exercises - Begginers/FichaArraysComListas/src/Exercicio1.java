import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int N,n;
		Scanner input=new Scanner(System.in);
		System.out.println("Quantos numeros deseja inserir?");
		N=input.nextInt();
		ArrayList<Integer> numeros = new ArrayList<>();
		for(int i=0;i<N;i++)
		{
			System.out.println("Quantos numeros deseja inserir?");
			n=input.nextInt();
			numeros.add(n);
		}
		System.out.println(numeros);
		input.close();

	}

}
