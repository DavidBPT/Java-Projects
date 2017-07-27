import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		trocar();

	}
	public static void trocar(){
		Scanner input=new Scanner(System.in);
		String x,y,aux;
		System.out.println("Insira um alfanumerico");
		x=input.nextLine();
		System.out.println("Insira um alfanumerico");
		y=input.nextLine();
		System.out.println("O valor de x é "+x+" e o de y é "+y);
		aux=x;
		x=y;
		y=aux;
		System.out.println("O valor de x é "+x+" e o de y é "+y);
		input.close();
	}

}
