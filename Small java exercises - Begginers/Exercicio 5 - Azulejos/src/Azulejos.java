import java.util.Scanner;

public class Azulejos {

	public static void main(String[] args) {
		float hp,lp,ha,la,AP,AA;
		float azulejos;
		System.out.println("Insira a altura e o comprimento da parede");
		Scanner input= new Scanner(System.in);
		hp= input.nextFloat();
		lp= input.nextFloat();
		System.out.println("Insira a altura e o comprimento do azulejo");
		ha= input.nextFloat();
		la= input.nextFloat();
		input.close();
		AP=hp*lp;
		AA=ha*la;
		azulejos=(hp/ha)*(lp/la);
		System.out.println("É necessário "+azulejos+" azulejos para cobrir a parede");
		
	}

}
