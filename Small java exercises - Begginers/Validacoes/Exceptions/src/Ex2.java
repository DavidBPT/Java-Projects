import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		//programa que vai dividir um número por outro mas que dê uma mensagem sempre que o utilizador digite 
		//um valor não inteiro
				
			int x, y;
				
			Scanner ler = new Scanner(System.in);
				
				
			try {
				
				System.out.println("Insira o dividendo: ");
				x = ler.nextInt();
					
					
				System.out.println("Insira o divisor: ");
				y = ler.nextInt();
				
				System.out.println(x/y);
			
			}
				
			catch (InputMismatchException e) {
					
				System.out.println("Os números introduzidos deverão ser inteiros");
					
			}
	}
}
