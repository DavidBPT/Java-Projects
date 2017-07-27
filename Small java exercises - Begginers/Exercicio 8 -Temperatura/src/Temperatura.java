import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		float F,C;
		System.out.println("Insira a temperatura em Fahrenheit");
		Scanner input=new Scanner(System.in);
		F=input.nextFloat();
		input.close();
		C=(F-32)*5/9;
		System.out.println(F+" equivale a "+C);
		
	}

}
