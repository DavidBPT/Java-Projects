import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int x;
		float soma=0,me = 0.000000f;
		Scanner input= new Scanner(System.in);
		
		System.out.println("Insira um numero de elementos do array");
		x=input.nextInt();
		int[] numeros= new int[x];
		for(int i=0;i<numeros.length;i++)
		{
			System.out.println("Insira um numero");
			numeros[i]=input.nextInt();
		}

		for(int i=0; i<numeros.length;i++)
			soma=soma+numeros[i];
		for(int i=0; i<numeros.length;i++)
			me=soma/numeros.length;

		System.out.println("Soma é "+soma +" e a media "+me);
		input.close();
	}

}
