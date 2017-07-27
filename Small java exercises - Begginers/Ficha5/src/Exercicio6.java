import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		int x,y,adicao=0,aux=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Insira um intervalo de valores");
		x=input.nextInt();
		y=input.nextInt();
		input.close();
		if(x>y){
			aux=x;
			x=y;
			y=aux;}
		for(;x<=y;x++)
			adicao=adicao+x;	
				System.out.println(adicao);

	}

}
