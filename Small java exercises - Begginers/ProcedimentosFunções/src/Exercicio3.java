import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int X;
		Scanner input=new Scanner(System.in);
		ArrayList<String> Nomes= new ArrayList<String>();
		Nomes.add("yolo1");
		Nomes.add("yolo2");
		Nomes.add("yolo3");
		Nomes.add("yolo4");
		Nomes.add("yolo5");
		Nomes.add("yolo6");
		Nomes.add("yolo7");
		Nomes.add("yolo8");
		Nomes.add("yolo9");
		System.out.println("Quantos nomes deseja mostrar?");
		X=input.nextInt();
		input.close();
		Mostrar(X,Nomes);
	}
	public static void Mostrar(int X,ArrayList<String>Nomes){
		for(int i=0;i<X;i++){
			System.out.println(Nomes.get(i));
		}
		
	}
}
