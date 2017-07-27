import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		float n1,n2,n3,n4,media;
		System.out.println("Insira as 4 notas");
		Scanner input=new Scanner(System.in);
		
		n1=input.nextFloat();
		n2=input.nextFloat();
		n3=input.nextFloat();
		n4=input.nextFloat();
		input.close();
		media=(n1+n2+n3+n4)/4;
		System.out.print("A média tem o valor de "+media);
		

	}

}
