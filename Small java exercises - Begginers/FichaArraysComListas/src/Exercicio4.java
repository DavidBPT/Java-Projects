import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int N,n,soma=0,media;
		ArrayList<Integer> Numeros = new ArrayList<>();
		System.out.println("Insira um numero de elementos do array");
		N=input.nextInt();
		for(int i=0;i<N;i++)
		{
			System.out.println("Insira numeros");
			n=input.nextInt();
			Numeros.add(n);
			soma=soma+n;
		} 
		input.close();
		System.out.println(soma);
		media=soma/Numeros.size();
		System.out.println(media);
		
		
		
		

	}

}
