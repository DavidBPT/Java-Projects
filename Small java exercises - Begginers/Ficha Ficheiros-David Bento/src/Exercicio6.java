import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		String doc,Linha;
		System.out.println("Insira o nome do ficheiro para traduzir(Traduzir.txt):");
		doc=input.nextLine();
		input.close();
		try {
			BufferedReader in = new BufferedReader(new FileReader(doc)); 
			Linha =in.readLine();
			
			while(Linha!=null){
				System.out.println(Linha.replaceAll("r","").replaceAll("R","").replaceAll("L","U").replaceAll("l","u"));
				Linha =in.readLine();
			}
			in.close();
		}
		
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		 }
	
	}
}


