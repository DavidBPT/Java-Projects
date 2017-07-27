
public class Exercicio11 {

	public static void main(String[] args) {
		double joao=1.50,ze=1.10,ja=0.02,za=0.03;
		int anos=0;
		while (joao>=ze)
		{	
			anos++;
			joao=joao+ja;
			ze=ze+za;
		}
		System.out.println("Será preciso "+anos+" para terem a mesma altura de "+joao+" e "+ze);
		

	}

}
