import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int x,y,aux=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Insira um grupo de valores");
		x=input.nextInt();
		y=input.nextInt();
		input.close();
		if(x>y){
			aux=x;
			x=y;
			y=aux;}
		for(;x<=y;x++)
			if(x%5!=0)
				System.out.println(x);

	}

}
