import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String sigla,nome,email;
		int data;
		File ficheiro = new File("Exercicio1.txt");
		Scanner escrever = new Scanner(System.in);
		
		//ESCREVER
		PrintWriter Output = new PrintWriter(ficheiro);
		System.out.print("Insira a Sigla: ");
		sigla=escrever.nextLine();
		System.out.print("Insira a nome: ");
		nome=escrever.nextLine();
		//System.out.print("Insira o ano de contratacao: ");
		//data=escrever.nextInt();
		System.out.print("Insira o email: ");
		email=escrever.nextLine();
		Output.println(sigla);
		Output.println(nome);
		//Output.println(data);
		Output.println(email);
		
		//LER
		/*
		BufferedReader in = new BufferedReader(new FileReader ("Exercicio1.txt"));
		String n = in.readLine();
		System.out.println(n);
		while( n!= null){
			// System.out.println(n); meter dentro do while para visualizar tudo
			System.out.println(n);
			//out.println(n);
			n=in.readLine();
		}
		*/

	}

}
