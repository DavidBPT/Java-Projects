import java.util.Scanner;

public class LerEEscreverArrays {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int [] numeros;
			numeros = new int [5];
			
			for(int i=0;i<numeros.length;i++){
				System.out.println("Insira o "+ (i+1) + "º numeros");
				numeros[i] = input.nextInt();
			}

			input.nextLine();
			
			for(int i=0;i<numeros.length;i++){
				System.out.println("O "+ (i+1) + "º numero insire foi "+numeros[i]);}

			// Arrays de Strings
			
			String[] nomes;
			nomes = new String[5];
			for(int i=0;i<nomes.length;i++)
			{
				System.out.print("Insira o "+ (i+1)+"º nome: ");
				nomes[i]=input.nextLine();
			}
			
			input.close();
			for(int i=0;i<nomes.length;i++){
				System.out.println("O "+ (i+1) + "º nome inserido é: "+nomes[i]);}
			
	}
}
