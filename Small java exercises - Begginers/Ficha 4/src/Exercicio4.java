import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int n1,n2,n3,max;
		Scanner input=new Scanner(System.in);
		System.out.println("Insira 3 numeros");
		n1=input.nextInt();
		n2=input.nextInt();
		n3=input.nextInt();
		input.close();
		max= Math.max(n1, Math.max(n2,n3));
		if(max==n1){
			max =Math.max(n2,n3);
			if(max==n2)
			System.out.println("Por ordem crescente: "+n3+">"+n2+">"+n1);
			else
				System.out.println("Por ordem crescente: "+n2+">"+n3+">"+n1);}
		else if (max==n2){
			max =Math.max(n1,n3);
			if(max==n1)
			System.out.println("Por ordem crescente: "+n3+">"+n1+">"+n2);
			else
				System.out.println("Por ordem crescente: "+n1+">"+n3+">"+n2);}
		else if(max==n3){
			max =Math.max(n2,n1);
			if(max==n2)
			System.out.println("Por ordem crescente: "+n1+">"+n2+">"+n3);
			else
				System.out.println("Por ordem crescente: "+n2+">"+n1+">"+n3);}
	}

}
