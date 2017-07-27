import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		float M,m,precoT,pesoT,precoM,precom;
		Scanner input=new Scanner(System.in);
		System.out.println("Introduza os quilos de Morango");
		M=input.nextFloat();
		System.out.println("Introduza os quilos de Maçãs");
		m=input.nextFloat();
		input.close();
		pesoT=M+m;
		if(M<=5)
			precoM= M*2.5f;
		else
			precoM=	M*2.2f;
		if(m<=5)
			precom= m*1.8f;
		else
			precom=	m*1.5f;
		precoT=(precoM+precom);
		if(precoT>=25 || pesoT>=8)
			precoT=precoT-(precoT*0.10f);
		
		System.out.println("O valor a pagar é "+precoT);
	}

}
