import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MeterBinário {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

	File ficheiro=new File("estudante.txt");
	ArrayList<String> estudantes = new ArrayList<String>();
	estudantes.add("Maria Adelaide");
	estudantes.add("Joana Maria");
	estudantes.add("Cristiano Ronaldo");
	estudantes.add("Leonel Messi");
	estudantes.add("Lady Gaga");
	estudantes.add("Tony Carreira");
	
	FileOutputStream foutput = new FileOutputStream(ficheiro); //mete

	ObjectOutputStream output = new ObjectOutputStream(foutput); // converte
	
	for(String aluno:estudantes)
	{
		output.writeObject(aluno);
	}
	output.close();
	foutput.close();
	
	FileInputStream finput = new FileInputStream(ficheiro);
	
	ObjectInputStream input = new ObjectInputStream(finput);
	
	ArrayList<String> estudantes2 = new ArrayList<>();
	try{
		while(true){
			estudantes2.add((String) input.readObject());
		}
	}
	catch(EOFException e){
	
	}
	for(String aluno:estudantes2){
		System.out.println(aluno);
	}
	input.close();
	finput.close();
	}

}
