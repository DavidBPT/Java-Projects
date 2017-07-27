import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
System.out.println("Insira o seu peso e altura:");
		
		Scanner input= new Scanner(System.in);
		
		double peso = input.nextDouble();
		double altura = input.nextDouble();
		
		input.close();
		double IMC= (peso/ Math.pow(altura,2));

		System.out.print("O IMC tem o valor de "+IMC);

	}

}
