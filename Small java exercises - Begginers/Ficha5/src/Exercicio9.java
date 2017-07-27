import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		int NP,NC,aux=0,p1=0,p2;
		Scanner input=new Scanner(System.in);
		System.out.println("Insira o numero de Pontos");
		NP=input.nextInt();
		System.out.println("Insira o numero de casas");
		NC=input.nextInt();
		input.close();
		if(NP>NC){
			aux=NP;
			NP=NC;
			NC=aux;}
		for(p1=1;p1<=NC;p1++)
		{
			for(p2=1;p2<=NP;p2++)
			{
				System.out.println(p1+","+p2);
				
				
			}
			
			
		}
		}
	}

