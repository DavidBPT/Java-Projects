import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		float preco;
		int codigo;
		Scanner input=new Scanner(System.in);
		System.out.println("Insira um preço");
		preco=input.nextFloat();
		System.out.println("Insira a maneira de pagamento:\n1-Pronto Pagamento\n2-2 Prestações\n3-3 Prestações\n4-Entre 4 e 6 prestações");
		codigo=input.nextInt();
		input.close();
		switch(codigo){
		case 1:
			preco=preco-(preco*0.30f);
			System.out.println("Irá pagar "+preco+"€");
			break;
		case 2:
			preco=preco-(preco*0.20f);
			System.out.println("Irá pagar "+preco+"€");
			break;
		case 3:
			preco=preco-(preco*0.10f);
			System.out.println("Irá pagar "+preco+"€");
			break;
		case 4:
			System.out.println("Irá pagar "+preco+"€");
			break;
		default:
			System.out.println("Insira um código entre 1-4");
		}
	}

}
