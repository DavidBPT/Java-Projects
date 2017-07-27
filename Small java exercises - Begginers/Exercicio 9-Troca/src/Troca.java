import java.util.Scanner;

public class Troca {

	public static void main(String[] args) {
		float A,B,trocar;
		Scanner input=new Scanner(System.in);
		System.out.println("Insira um valor para A:");
		A=input.nextFloat();
		System.out.println("Insira um valor para B:");
		B=input.nextFloat();
		input.close();
		trocar=A;
		A=B;
		B=trocar;
		System.out.println("O valor de A é "+A+" e B é "+B);
	}

}
