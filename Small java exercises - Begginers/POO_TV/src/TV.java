import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TV {

	//Variaveis de instancia - Propriedades de TV
	
	private boolean estado;  //Ninguem consegue aceder a esta propriedade-private
	private int canal;
	private String mensagem; //Mandar texos informativos, "esta no canal 2"
	private int volume;
	
	//Método - Constructor
	
	public TV(){   //Metodo/funcao- MESMO NOME DA CLASSE-CONSTRUTOR
		estado=false;
		canal=1;
		volume=10;
		mensagem="Nova TV criada com sucesso!";
		//System.out.println(mensagem); //apenas para perceber	
		//enviaMensagem();
		
	}//FIM CONSTRUCTOR
	
	//consultar e alterar valor do canal
	public int getCanal(){
		
		return canal;  //Buscar atraves do metodo, sem mexer nas propriedades
	}
	public void mudaCanal(int canal){
		this.canal=canal;
		
	}
	//VOLUME
	public void aumentaVolume(int valor){
		volume += valor;
	}
	public void diminuiVolume(int valor){
		volume -= valor;
	}
	public int getVolume(){
		return volume;
	}
	public boolean getEstado(){
		return estado;
	}
	public void enviaMensagem(){

		System.out.println(mensagem);
	}
	//LIGAR E DESLIGAR
	public void ligaTV(){
		if(!estado){
			estado=true;
			lerInfo();  //LER AO FICHEIRO
			mensagem="TV Ligada";
		}
	}
	public void desligarTV(){
		
		if(estado){
			estado=false;
			gravarInfo(); //GRAVA FICHEIRO/INFO
			mensagem="TV Desligada";
		}
	}
	//METODOS PARA LER E GRAVAR INFO EM FILE, private pois ninguem mexe.
	private void gravarInfo(){
		
		File ficheiro=new File("infoTV.txt");
		try{
			PrintWriter output = new PrintWriter(ficheiro);
			output.println(this.canal);
			output.println(this.volume);
			output.close();
		}
		catch(IOException e){ //Escrever no ficheiro
			
			System.out.printf("Erro: %s\n",e);
			
		}
		
	}
	private void lerInfo(){
		
		File ficheiro = new File("infoTV.txt");
		try{
			Scanner input=new Scanner(ficheiro);
			int canal=input.nextInt(); //Ler
			int volume=input.nextInt();
			this.canal = canal; // Se tivererem o mesmo nome. This.canal é o objecto la de cima
			this.volume=volume;
			input.close();
		}
		catch(FileNotFoundException e){
			this.canal=1;
			this.volume=10;
		}
	}
	
	
	
	
}//FIM DA CLASSE
