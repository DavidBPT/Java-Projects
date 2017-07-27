import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int n1,n2,n3,n4;
		Scanner input=new Scanner(System.in);
		System.out.println("Insira 4 numeros:");
		n1=input.nextInt();
		n2=input.nextInt();
		n3=input.nextInt();
		n4=input.nextInt();
		input.close();
		if(n1<n2 && n1<n3 && n1<n4)System.out.println("O numero "+n1+" é o menor");
		if(n2<n3 && n2<n4 && n2<n1)System.out.println("O numero "+n2+" é o menor");
		if(n3<n2 && n3<n1 && n3<n4)System.out.println("O numero "+n3+" é o menor");
		if(n4<n2 && n4<n3 && n4<n1)System.out.println("O numero "+n4+" é o menor");
		
		if(n1>n2 && n1>n3 && n1>n4)System.out.println("O numero "+n1+" é o maior");
		if(n2>n3 && n2>n4 && n2>n1)System.out.println("O numero "+n2+" é o maior");
		if(n3>n2 && n3>n1 && n3>n4)System.out.println("O numero "+n3+" é o maior");
		if(n4>n2 && n4>n3 && n4>n1)System.out.println("O numero "+n4+" é o maior");
		
	}

}
