import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int x,aux=1;
		Scanner input=new Scanner(System.in);
		System.out.println("Insira um valor");
		x=input.nextInt();
		input.close();
		for(int i = 1;i<=x;i++){
				aux=aux*i;}
		System.out.println(aux);
			
			
	}

}
