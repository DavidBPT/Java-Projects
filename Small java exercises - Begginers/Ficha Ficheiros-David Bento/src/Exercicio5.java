import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		String s, nomeFx = "Alunos.txt";
		int nota;
		String linha;
		Scanner input = new Scanner(System.in);
		
		BufferedWriter f;
		
		try {
		f = new BufferedWriter(new FileWriter(nomeFx,true));
			}
		catch(Exception e) {
			System.out.println("Impossível criar o ficheiro " + nomeFx);
			System.out.println("fim do programa...");
		return;
		}
		System.out.println("Escreva os nomes dos alunos");
		s = input.nextLine();
		while(s.length() > 0) {
			f.write(s);
			f.newLine(); 
			s = input.nextLine();
		}
		f.close();
		System.out.println("O conteúdo foi armazenado no ficheiro " + nomeFx);
		
		BufferedReader in;
		BufferedWriter out;
		try {
			in= new BufferedReader(new FileReader(nomeFx));
			out = new BufferedWriter(new FileWriter("AlunosNotas.txt",true));
				while ((linha = in.readLine()) != null){
					System.out.println("Insira a nota do aluno: \n"+linha+":");
					nota=input.nextInt();
					out.write(linha+" "+nota);
					out.newLine();;
				}
				in.close();
				out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		input.close();
		
}
}