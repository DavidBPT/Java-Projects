import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N,me,ma;
		System.out.println("Insira quantos numeros deseja");
		N=input.nextInt();
		int[] numeros= new int[N];
		for(int i=0;i<numeros.length;i++)
		{
			System.out.println("Insira um numero");
			numeros[i]=input.nextInt();

		}
		Arrays.sort(numeros);
		me=Array.getInt(numeros, 0);   // posicao 0
		ma=(int) Array.get(numeros, N-1);   // ultima posicao
		System.out.println("O menor é: "+ me+" e o maior é: "+ma);
		input.close();

	}

}
