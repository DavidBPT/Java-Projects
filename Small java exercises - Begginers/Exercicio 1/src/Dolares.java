import java.util.Scanner;

public class Dolares {

	public static void main(String[] args) {
		System.out.print("Insira um valor para converter: ");
		
		Scanner escrever = new Scanner(System.in);
		
		float valor = escrever.nextFloat();
		
		escrever.close();
		
		float dolares=valor*1.12589f;
		
		System.out.println(valor+"€ equivale a "+dolares+"$");
	}

}
