import java.util.ArrayList;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		String resp1 = "SIM", resp2="NAO";
		String pergunta="Mais nomes?";
		int contaA =0,i=-1;
		String respostaPergunta="";
		Boolean erro=true;
		ArrayList<String> nomes=new ArrayList<>();
		Scanner ler = new Scanner(System.in);
		do{
			try
			{
				i++;
				System.out.println("Insira nome: ");
				nomes.add(ler.next().toUpperCase());
				System.out.println(pergunta);
				respostaPergunta=ler.next().toUpperCase();
				if(respostaPergunta.compareTo(resp1)!=0 && respostaPergunta.compareTo(resp2)!=0 )
				{
					throw new Exception();
				}
			}
			catch(Exception e)
			{
				erro=true;
				while(erro)
				{
					System.out.println("Responda sim ou nao");
					System.out.println(pergunta);
					respostaPergunta=ler.next().toUpperCase();
					erro=(respostaPergunta.compareTo(resp1)!=0 && respostaPergunta.compareTo(resp2)!=0);

				}
			}
			finally{
				if(nomes.get(i).charAt(0)=='A')
				{
					contaA++;
				}
			}
		}while(respostaPergunta.compareTo(resp1)==0);
		ler.close();
		System.out.println("Existem "+contaA+" começados por A.");
		
	}
}

