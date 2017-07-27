import java.io.IOException;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) throws IOException {
		char r = 'S',s;
		int idade,contf=0,ma=0,me=1000,sal,salf,saltotal=0,cont500=0,tic=1,contm=0;
		Scanner input= new Scanner(System.in);
		while(tic!=0)
		{
		System.out.println("Insira a idade");
		idade=input.nextInt();
		if(idade>ma)
			ma=idade;
		if(idade<me)
			me=idade;	
		System.out.println("Insira o sexo");
		s=(char) System.in.read();
		s=Character.toUpperCase(s);
		switch(s){
		case 'F':
			contf++;
			System.out.println("Insira o seu salário");
			salf=input.nextInt();
			saltotal=saltotal+salf;
			if(salf<500)
				cont500++;
			break;			
		case 'M':
			contm++;
			System.out.println("Insira o seu salário");
			sal=input.nextInt();
			saltotal=saltotal+sal;
			break;
		}
		
		System.out.println("Deseja continuar?");
		r=(char) System.in.read();
		r=Character.toUpperCase(r);
		if(r=='S')
		{
			
		}
		else
			tic=0;
		}
		input.close();

		System.out.println("Idade Menor "+me);
		System.out.println("Idade Maior "+ma);
		System.out.println("Media de salario"+saltotal/(contm+contf));
		System.out.println("Inferior a 500"+cont500);
		
		
		
	}	

}
