import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		int A,p=4;
		char [] chave= {'a','a','c','b'};
		int [] cotacao= {5,5,5,5};
		int [] Final = new int[p];
		Scanner input=new Scanner(System.in);
		System.out.println("Insira o numero de alunos");
		A=input.nextInt();
		String [][] Resp = new String [A][p];
		for(int i=0;i<A;i++)
		{
			for(int j=0;j<p;j++)
			{
				System.out.print("A resposta do "+(i+1)+"º aluno à "+(j+1)+"ª pergunta é: ");
				Resp[i][j]=input.next();				
			}
		}	
		input.close();
		for(int i=0;i<A;i++)
		{		
			for(int j=0;j<p;j++)
			{
				if(Resp[i][j].charAt(0)==chave[j])
				{		
					Final[i]=Final[i]+cotacao[j];					
				}
			}
		}
		for(int i=0;i<A;i++)
		{
				System.out.println("A cotação do "+(i+1)+"º aluno é "+Final[i]);
		}
	}
}