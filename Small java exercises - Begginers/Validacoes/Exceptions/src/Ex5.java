import java.util.ArrayList;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		//Ler para um vetor um número desconhecido de nomes.
		//No final de cada digitação de nome pergunta-se se há mais e o utilizador deverá responder SIM ou NÂO
		
		//Validar a resposta e contar os nomes começados por A
		
		
		String resp1 = "SIM", resp2 = "NÃO";
		
		String pergunta = "Mais nomes ?";
		
		int contaA = 0, i = -1;
		
		String respostaPergunta= "";
		
		Boolean erro = true;
		
		ArrayList<String> nomes = new ArrayList<>();
		
		Scanner ler = new Scanner(System.in);
		
		do{
			
			try {
				
				i++;
				
				System.out.println("Insira nome: ");
				
				nomes.add(ler.next().toUpperCase());
				
				System.out.println(pergunta);
				
				respostaPergunta = ler.next().toUpperCase();
				
				if(respostaPergunta.compareTo(resp1) != 0 && respostaPergunta.compareTo(resp2) != 0){
					
					throw new Exception();
				
				}//if(respostaPerg
				
			}//try
			
			catch (Exception e){
				
				erro = true;
				
				while(erro)
				{
					System.out.println("Responda sim ou não");
					
					System.out.println(pergunta);
					
					respostaPergunta = ler.next().toUpperCase();
					
					erro = (respostaPergunta.compareTo(resp1) != 0 && respostaPergunta.compareTo(resp2) !=0);
				
				}//while(erro)
				
			}//catch (Exception e)
			
			finally{
				
				if(nomes.get(i).charAt(0) == 'A'){
				
						contaA ++;
				}
				
			}//finally
			
		}while(respostaPergunta.compareTo(resp1) == 0);
			
		ler.close();
		
		System.out.println("Existem "+ contaA + " começados por A.");
		
	}
}
		
