import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int R;
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> Numeros = new ArrayList<>();
		do
		{
			System.out.println("Insira numeros. Termine com 999");
			R=input.nextInt();
			if(R!=999)
			{
				Numeros.add(R);
			}
		}while(R!=999);
		input.close();
		System.out.println(Numeros);
	}
}