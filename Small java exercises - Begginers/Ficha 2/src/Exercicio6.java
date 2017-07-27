import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		int A;
		Scanner input=new Scanner(System.in);
		System.out.println("Insira um numero");
		A= input.nextInt();
		input.close();
		if(A % 2==0)
			System.out.print("O numero é par");
		else
			System.out.print("O numero é impar");
	}

}
