import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		int x,y,aux=0,aux2=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Insira um intervalo de valores");
		x=input.nextInt();
		y=input.nextInt();
		input.close();
		if(x>y){
			aux=x;
			x=y;
			y=aux;}
		for(int i=1;i<=11;i++)
		{
			aux2=x*i;
			
			for(int j=1;j<=11;j++)
			{
				if(aux2==(y*j))
				{
				System.out.println(+aux2);
				return;
				}
			}
		}
	}
}

