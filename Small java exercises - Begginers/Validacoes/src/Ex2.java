import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		//programa vai dividir um numero por outro mas que nao pode dar 0 como divisor
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
				ler.close();


	}

}
