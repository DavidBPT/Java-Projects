import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IO_Básico {

	public static void main(String[] args) {

		File ficheiro = new File("teste.txt");
		
		try{
			PrintWriter Output = new PrintWriter(ficheiro);
			
			Output.println("Ronaldo");
			Output.println(31);
			Output.close();
		}
		catch(IOException e){
			System.out.printf("Erro: %s\n",e);
		} 
		try{
			Scanner input = new Scanner(ficheiro);
			String nome = input.nextLine();
			int idade=input.nextInt();
			System.out.printf("O meu nome é %s , e tenho %d\n",nome,idade);
			input.close();
			
		}
		catch(FileNotFoundException e){
			System.out.printf("Erro: %s\n", e);
		}
	}

}
