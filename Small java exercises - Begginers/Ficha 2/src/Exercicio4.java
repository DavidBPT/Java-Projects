import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		float nota;
		Scanner input=new Scanner(System.in);
		System.out.println("Insira a nota do aluno");
		nota=input.nextFloat();
		input.close();
		if(nota>=0 && nota <=5.9)
			System.out.println("A nota do aluno é fraca");
		else if(nota <=10)
			System.out.println("A nota do aluno é Insuficiente");
		else if(nota <=14)
			System.out.println("A nota do aluno é Satisfaz");
		else if(nota <=18)
			System.out.println("A nota do aluno é Bom");
		else if(nota <=20)
			System.out.println("A nota do aluno é Muito Bom");
		else
			System.out.println("A nota não é válida");

	}

}
