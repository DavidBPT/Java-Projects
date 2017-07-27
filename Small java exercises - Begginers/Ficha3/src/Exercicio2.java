import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int codigo,quantidade;
		float preco;
		Scanner input=new Scanner(System.in);
		System.out.println("Insira o item desejado:\n100-Cachorro Quente\n101-Hambúrguer Simples\n102-Hambúrguer Especial\n103-Bifana Simples\n104-Bifana com queijo e bacon\n105-Refrigerante");
		codigo=input.nextInt();
		System.out.println("Insira a quantidade");
		quantidade=input.nextInt();
		input.close();
		switch(codigo){
		case 100:
			preco=(quantidade*2.50f);
			System.out.println("Terá de pagar "+preco+"€");
			break;
		case 101:
			preco=(quantidade*3.50f);
			System.out.println("Terá de pagar "+preco+"€");
			break;
		case 102:
			preco=(quantidade*4.50f);
			System.out.println("Terá de pagar "+preco+"€");
			break;
		case 103:
			preco=(quantidade*2.70f);
			System.out.println("Terá de pagar "+preco+"€");
			break;
		case 104:
			preco=(quantidade*3.55f);
			System.out.println("Terá de pagar "+preco+"€");
			break;
		case 105:
			preco=(quantidade*1.75f);
			System.out.println("Terá de pagar "+preco+"€");
			break;
		default:
			System.out.println("Insira um código entre 100 e 105");
		}
	}

}
