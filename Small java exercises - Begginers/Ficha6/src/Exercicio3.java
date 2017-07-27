import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int x,y,aux=0;
		System.out.println("Insira dois numeros para multiplicar");
		Scanner input = new Scanner(System.in);
		x=input.nextInt();
		y=input.nextInt();
		input.close();
		aux=y;
		while(x!=1){		
		x=x/2;
		y=y*2;
		if(x%2==1)
		{
			aux=aux+y;
		}
		}
		System.out.println(aux);
	}

}
