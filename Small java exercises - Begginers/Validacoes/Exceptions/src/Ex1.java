import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		//programa que vai dividir um número por outro mas que dê uma mensagem sempre que o utilizador digite 
		//zero como divisor
		
		int x, y;
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Insira o dividendo: ");
		x = ler.nextInt();
		
		
		System.out.println("Insira o divisor: ");
		y = ler.nextInt();
		
		ler.close();
		
		try{
			
			System.out.println(x/y);
		}
		
		catch (ArithmeticException e) {
			
			System.out.println("O divisor tem que ser diferente de zero");
		}
	}
}
