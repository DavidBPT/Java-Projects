import java.util.Scanner;

public class ErrosValidacoesCorrecoes {

	public static void main(String[] args) {
		//programa vai dividir um numero por outro mas que nao pode dar 0 como divisor
		int x,y;
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira o dividendo: ");
		x=ler.nextInt();
		System.out.println("Insira o divisor: ");
		y=ler.nextInt();
		ler.close();
		try{
			System.out.println(x/y);

		}
		catch(ArithmeticException e){
			System.out.println("O divisor tem que ser diferente de 0");
		}

	}

}
