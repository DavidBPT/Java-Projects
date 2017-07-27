import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int A,B,C;
		Scanner input=new Scanner(System.in);
		System.out.println("Insira 3 numeros");
		A=input.nextInt();
		B=input.nextInt();
		C=input.nextInt();
		input.close();
		if(B<A && B<C)
			System.out.println("B é o minimo");
		else if(A<B && A<C)
			System.out.println("A é o minimo");
		else
			System.out.println("C é o minimo");
	}

}
