import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i;
		System.out.println("Insira a idade");
		i=input.nextInt();
		try{
			if(i<17 || i>77){
				throw new Exception();
			}
			else
				System.out.println("Idade válida");
		}
		catch(Exception e){
			System.out.println("Idade tem de ser entre 17 e 77, e numeros inteiros");
		}
		input.close();
	}

}
