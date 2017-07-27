import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		int x,y;
		Scanner ler = new Scanner(System.in);
		try{
		System.out.println("Insira o dividendo: ");
		x=ler.nextInt();
		System.out.println("Insira o divisor: ");
		y=ler.nextInt();
		
		
			System.out.println(x/y);

		}
		catch(InputMismatchException e){
			System.out.println("Os numeros introduzidos deverao ser inteiros");
		}
		catch(ArithmeticException e){
			System.out.println("O divisor tem que ser diferente de 0");
		}
		ler.close();

	}

}
