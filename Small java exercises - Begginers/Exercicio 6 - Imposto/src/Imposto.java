import java.util.Scanner;

public class Imposto {

	public static void main(String[] args) {
		float AreaT,AreaC,AreaV,ImpostoC,ImpostoV,ImpostoT;
		Scanner input=new Scanner(System.in);
		System.out.println("Insira a area total do terreno");
		AreaT=input.nextFloat();
		System.out.println("Insira a area construida no terreno");
		AreaC=input.nextFloat();
		AreaV=AreaT-AreaC;
		ImpostoC=AreaC*50f;
		ImpostoV=AreaV*5.80f;
		input.close();
		ImpostoT=ImpostoC+ImpostoV;
		System.out.println("O valor a ser pago é "+ImpostoT);
		
	}

}
