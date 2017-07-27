import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copiar {
	public static void main (String[]args) throws IOException{
	int n;
	char c;
	FileReader in = new FileReader("TESTE1.txt");
	FileWriter out = new FileWriter("TESTE2.txt");
	while((n=in.read())!=-1){
		c=(char) n;
		out.write(c);
	}


	in.close();
	out.close();
}
}
