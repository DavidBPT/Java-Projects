import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		float preco;
		int codigo;
		Scanner input=new Scanner(System.in);
		System.out.println("Insira um preço");
		preco=input.nextFloat();
		System.out.println("Escolha a categoria:\n1-Lacticínios\n2-Carnes\n3Peixes\n4-Aves\n5-Ovos\n6-Doces");
		codigo=input.nextInt();
		input.close();
		switch(codigo){
		case 1:
		case 2:
			preco=preco+(preco*0.80f);
			System.out.println("Irá pagar "+preco+"€");
			break;
		case 3:
		case 4:
			preco=preco+(preco*1);
			System.out.println("Irá pagar "+preco+"€");
			break;
		case 5:
		case 6:
			preco=preco+(preco*0.90f);
			System.out.println("Irá pagar "+preco+"€");
			break;
		default:
			System.out.println("Insira um código entre 1-4");
	}
		}
	}

