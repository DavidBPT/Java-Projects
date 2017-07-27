import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int n1,n2,n3,min,min2,max,max2;
		Scanner input=new Scanner(System.in);
		System.out.println("Insira 3 numeros:");
		n1=input.nextInt();
		n2=input.nextInt();
		n3=input.nextInt();
		input.close();
		min= Math.min(n1, Math.min(n2,n3));
		if(min==n1){
			min2 =Math.min(n2,n3);
				System.out.println("A soma entre "+min+" e "+min2+" é = "+(min+min2));}
		if(min==n2){
			min2 =Math.min(n1,n3);
				System.out.println("A soma entre "+min+" e "+min2+" é = "+(min+min2));}
		if(min==n3){
			min2 =Math.min(n1,n2);
				System.out.println("A soma entre "+min+" e "+min2+" é = "+(min+min2));}
		max= Math.max(n1, Math.max(n2,n3));
		if(max==n1){
			max2 =Math.max(n2,n3);
				System.out.println("O produto entre "+max+" e "+max2+" é = "+(max*max2));}
		
		if(max==n2){
			max2 =Math.max(n1,n3);
				System.out.println("O produto entre "+max+" e "+max2+" é = "+(max*max2));}
		if(max==n3){
			max2 =Math.max(n1,n2);
				System.out.println("O produto entre "+max+" e "+max2+" é = "+(max*max2));}
		
	}

}
