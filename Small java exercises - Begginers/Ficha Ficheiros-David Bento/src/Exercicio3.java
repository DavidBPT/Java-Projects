import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio3{
	
public static void main(String[] args) throws IOException {
	
	String s, nomeFile;
	Scanner input = new Scanner(System.in);
	//ler nome de um ficheiro de texto do sistema operativo
	
	System.out.print("Insira o nome do ficheiro(exercicio.txt): ");
	nomeFile = input.nextLine();
	input.close();
	BufferedReader f = null;
	try{
		f = new BufferedReader (new FileReader(nomeFile));
	}
	catch(Exception e){
		System.out.println("Não foi possível abrir o ficheiro " + nomeFile + "devido a " + e);
		return;
	}
	do {
		
		s = f.readLine();				//---------------------------------
		if(s!=null){					//Adicionei este IF
			System.out.println(s);		//---------------------------------
		}
	}while(s != null);
	f.close();
	}
}