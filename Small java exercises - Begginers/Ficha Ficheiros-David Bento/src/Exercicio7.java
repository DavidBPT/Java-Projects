import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String emp = null,linha;
		int compra=0,venda=0;
		Scanner input=new Scanner(System.in);
		BufferedReader in;
		try {
			in = new BufferedReader(new FileReader("Empresas.txt"));
			System.out.println("Escreva o nome da Empresa");
			emp=input.nextLine();
			while((linha=in.readLine())!=null){
				if(linha.contains(emp) && linha.contains("compra")){
						System.out.println("Compra: "+linha);
						String Valor= linha.substring(linha.indexOf("compra") + 7, linha.indexOf("ações")-1);
						int compra1 = Integer.parseInt(Valor);
						compra=compra+compra1;
					}
				else if(linha.contains(emp) && linha.contains("vende")){
					System.out.println("Vendas: "+linha);
					String Valor= linha.substring(linha.indexOf("vende") + 6, linha.indexOf("ações")-1);
					int venda1 = Integer.parseInt(Valor);
					venda=venda+venda1;
				}
			 }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nO total das Compras da empresa "+emp+" é de: "+compra);
		System.out.println("O total das Vendas da empresa "+emp+" é de: "+venda);
		input.close();
		 }
	}