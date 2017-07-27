import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) throws Exception {
		Scanner input=new Scanner(System.in);
		int [] numeros;
		int c=0;
		numeros = new int [5];
		try{
		while(true){
			
				System.out.println("Insira o numeros");
				numeros[c] = input.nextInt();
				c++;
		}	
		}	
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Limite do array excedido");
			}
			
		}
		

	}

