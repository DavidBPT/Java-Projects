import java.io.*;

public class Buffered2 {

	public static void main(String[] args) throws IOException {
		//Linha a linha
		
		BufferedReader in = new BufferedReader(new FileReader ("ficheiroIN.txt")); // Vai buscar o que está neste ficheiro
		
		PrintWriter out = new PrintWriter(new FileWriter("ficheiroOUT.txt")); // Escreve num ficheiro existente

		String n = in.readLine();
		
		System.out.println(n); //Mostra uma linha
		
		//while( n!= null){
			// System.out.println(n); meter dentro do while para visualizar tudo
			System.out.println(n);
			out.println(n);
			n=in.readLine();
			
		//}
		in.close();
		out.close();
	}

}
