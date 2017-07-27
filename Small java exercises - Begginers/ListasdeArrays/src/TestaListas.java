import java.util.ArrayList;
import java.util.Collections;

public class TestaListas {

	public static void main(String[] args) {

			String formando1 = "Joana Margarida";
			String formando2 = "Antonio Bernardo";
			String formando3 = "Ricardo Moreira";
			String formando4 = "Margarida Santos";
			String formando5 = "Carlos Matoso";
			
			//cria uma referencia para uma lista de strings, chamada formandos
			ArrayList<String> formandos = new ArrayList<>();
			
			formandos.add(formando1);
			formandos.add(formando2);
			formandos.add(formando3);
			formandos.add(formando4);
			formandos.add(formando5);
			
			System.out.println(formandos);
			
			//formandos.remove(0);  // remove a primeira posicao
			//formandos.remove(formando1);
			//formandos.remove("Ricardo Moreira");		case sensitive
			//formandos.remove("Cristina Silva");
			//System.out.println(formandos.remove("Cristina Silva"));  // diz se é true or false
			//System.out.println(formandos);
			
			//Para cada formando dentro da Lista formandos fazer
			for(String formando:formandos)
			{
				System.out.println("Nome: "+formando);
				
			} // PERCORRE A LISTA TODA, 1 A 1
			
			String pFormando = formandos.get(0);
			System.out.println("O primeiro formando é "+pFormando);
			
			for(int i=0; i<formandos.size();i++)
			{
				System.out.println((i+1)+"formando: "+formandos.get(i));
				// o get vai buscar essa posicao	
			}
			
			//método foreach e lambdas
			formandos.forEach(formando ->{
				System.out.println("O formando "+ formando);
				System.out.println(" Aprovado");
			}
			);
			
			Collections.sort(formandos);  //ordem alfabetica
			System.out.println(formandos);
			Collections.reverse(formandos); // ordem inversa
			
			formandos.set(3, "Claudia Sofia"); // mete na posicao 3
			System.out.println(formandos);

			
			
			
			
			
	}

}
