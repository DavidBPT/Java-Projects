import java.util.Scanner;

public class Volume {

	public static void main(String[] args) {
		float altura,raio,Volume;
		System.out.println("Insira a altura e o raio do topo da lata");
		Scanner input=new Scanner(System.in);
		altura=input.nextFloat();
		raio=input.nextFloat();
		input.close();
		Volume= 3.14159f * raio * raio * altura;
		System.out.println("O volume da lata é "+Volume);
	}

}
