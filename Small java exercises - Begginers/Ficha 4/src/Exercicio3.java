import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int l1,l2,l3;
		Scanner input=new Scanner(System.in);
		System.out.println("Insira os 3 lados do triangulo");
		l1=input.nextInt();
		l2=input.nextInt();
		l3=input.nextInt();
		input.close();
		if(l1 == l2 && l2 == l3)
			System.out.println("Triangulo equilatero");
		else if(l1 == l2 || l1==l3 || l2==l3)
			System.out.println("Triangulo isosceles");
		else
			System.out.println("Triangulo escaleno");
	}

}
