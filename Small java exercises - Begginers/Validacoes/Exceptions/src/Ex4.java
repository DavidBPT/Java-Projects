
public class Ex4 {

	public static void main(String[] args) {
	
		//Programa que calcula o somatório dos erros numéricos cometidos durante
		//a atribuição de um vector de números reais a um vector de inteiros
		
		double desvio = 0;
		
		double [] d = {5.78, 7, 6.54, 3.345, 10, 10.9};
		
		int [] i = new int[d.length];
		
		for (int j = 0; j < d.length; j++){
			
			try {
				
				i[j] = (int)d[j];
				
				if(i[j] != d[j]);
					
					throw new Exception(); //interrompe o for para tratar da execpção
			
			}//try
			
			catch(Exception e)
			{
				System.out.println(String.format("%4.3f foi truncado para %d\n", d[j], i[j]));
				
				desvio += d[j] - i[j]; 
				
			}//catch
			
		}//for
		
		System.out.println(String.format("Somatório dos erros %4.3f\n", desvio));
	}//main
}//class

//READPATAR ESTES EXERCÍCIO USANDO ARRAYLISTS E CONVERSÃO DE SAÍDA COMO DADA ANTERIORMENTE
