import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) 
	{
		
				double a,b,c,preco=65;
				
				//code
				Scanner input = new Scanner(System.in);
				
				System.out.println("A - ");
				a = input.nextDouble();
				System.out.println("B - ");
				b = input.nextDouble();
				System.out.println("C - ");
				c = input.nextDouble();
				input.close();			
				if(a>preco)
					a=0;
				if(b>preco)
					b=0;
				if(c>preco)
					c=0;			
				if(a>=b && a>=c && a<=preco)
					System.out.println("A Ganhou! ");
				else
					if(b>=a && b>=c && b<=preco)
						System.out.println("B Ganhou! ");
					else
						if(c>=a && c>=b && c<=preco)
							System.out.println("C Ganhou! ");
			}
	}

