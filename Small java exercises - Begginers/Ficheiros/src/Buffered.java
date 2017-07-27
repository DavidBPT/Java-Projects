import java.io.*;

public class Buffered {

	public static void main(String[] args) throws IOException {

	int n, conta=0;
	char c;
	BufferedReader in = new BufferedReader(new FileReader ("ficheiroIN.txt")); // Vai buscar o que está neste ficheiro
	
	BufferedWriter out = new BufferedWriter(new FileWriter("ficheiroOUT.txt")); // Escreve no outro ficheiro
	
	while((n=in.read()) != -1){
		//BufferedReader devolve de inteiro em vez do caracter
		c = (char) n;
		conta++;
		out.write(c);
		
	}
	in.close();
	out.close();
	
	System.out.println(conta);
	
	}

}
