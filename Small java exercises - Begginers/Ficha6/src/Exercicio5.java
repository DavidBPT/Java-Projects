import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int som = 0,n1;
		Scanner input= new Scanner(System.in);
		System.out.println("Insira um numero");
		n1=input.nextInt();
		input.close();
		for(int divisor=1; divisor < n1; divisor++)
		   {
		     if ((n1 % divisor) ==0)
		     {
		       som = som + divisor;
		     }
		    }
		if(som==n1)
		   {
		    System.out.println(n1 + " é um numero perfeito");
		   }
		else
		   {
		    System.out.println(n1 + " não é um numero perfeito");
		   }


	}

}
