import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		int c;
		float n1,n2,n3,max,media;
		Scanner input=new Scanner(System.in);{
		System.out.println("Insira o código do aluno");
		c=input.nextInt();
		System.out.println("Insira a 1º nota do aluno");
		n1=input.nextFloat();
		System.out.println("Insira a 2º nota do aluno");
		n2=input.nextFloat();
		System.out.println("Insira a 3º nota do aluno");
		n3=input.nextFloat();
		input.close();
		max= Math.max(n1, Math.max(n2,n3));
		if(max==n1)
			media=(float) ((n1*4+n2*3+n3*3)/10);
		else if(max==n2)
			media=(float) ((n2*4+n1*3+n3*3)/10);
		else
			media=(float) ((n3*4+n2*3+n1*3)/10);
		if(media>=5)
			System.out.printf("O aluno com o codigo %d, e notas %f;%f;%f foi Aprovado com uma media de %f",c,n1,n2,n3,media);
		else
			System.out.printf("O aluno com o codigo %d, e notas %f;%f;%f foi Reprovado com uma media de %f",c,n1,n2,n3,media);
	}

	}
}
