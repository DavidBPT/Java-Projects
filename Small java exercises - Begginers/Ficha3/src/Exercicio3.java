import java.io.IOException;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) throws IOException {
		int codigo,quantidade;
		char R='s';
		float preco,Total = 0;
		Scanner input=new Scanner(System.in);
		
		while(R=='s')
		{
		System.out.println("Insira o item desejado:\n100-Cachorro Quente\n101-Hambúrguer Simples\n102-Hambúrguer Especial\n103-Bifana Simples\n104-Bifana com queijo e bacon\n105-Refrigerante");
		codigo=input.nextInt();
		System.out.println("Insira a quantidade");
		quantidade=input.nextInt();
		
		switch(codigo){
		case 100:
			preco=(quantidade*2.50f);
			Total=Total+preco;
			System.out.println("engordar?(s/n)");
			R=input.next().charAt(0);
			if(R=='s')
			{}
			else
			{
				R='n';
			}
				
			break;
		case 101:
			preco=(quantidade*3.50f);
			Total=Total+preco;
			System.out.println("engordar?(s/n)");
			R=input.next().charAt(0);
			if(R=='s')
			{}
			else
			{
				R='n';
			}
			break;
		case 102:
			preco=(quantidade*4.50f);
			Total=Total+preco;
			System.out.println("engordar?(s/n)");
			R=input.next().charAt(0);
			if(R=='s')
			{}
			else
			{
				R='n';
			}
			break;
		case 103:
			preco=(quantidade*2.70f);
			Total=Total+preco;
			System.out.println("engordar?(s/n)");
			R=input.next().charAt(0);
			if(R=='s')
			{}
			else
			{
				R='n';
			}
			break;
		case 104:
			preco=(quantidade*3.55f);
			Total=Total+preco;
			System.out.println("engordar?(s/n)");
			R=input.next().charAt(0);
			if(R=='s')
			{}
			else
			{
				R='n';
			}
			break;
		case 105:
			preco=(quantidade*1.75f);
			Total=Total+preco;
			System.out.println("engordar?(s/n)");
			R=input.next().charAt(0);
			if(R=='s')
			{}
			else
			{
				R='n';
			}
			break;
		default:
			System.out.println("Insira um código entre 100 e 105");	
		}
		}
		input.close();
		System.out.println("total yolo"+Total);
		
	}	

}
