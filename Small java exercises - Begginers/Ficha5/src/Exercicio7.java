import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		int x,y,adicao=0,aux;
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
			if(x % 2 == 0){
			adicao=adicao+x;}	
		System.out.println(adicao);

	}

}
