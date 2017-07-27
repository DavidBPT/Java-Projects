import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int x,y=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Insira um numero");
		x=input.nextInt();
		input.close();
		if(x>=1 && x<=10){
		for(;y<=10;y++){
			
				System.out.println(x+" x "+y+"="+(x*y));}}
		else
			System.out.println("Insira um numero entre 1 e 10");
	}

}
