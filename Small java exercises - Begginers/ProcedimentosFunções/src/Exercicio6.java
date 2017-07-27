import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Exercicio6 {

	public static void main(String[] args) {
		int s,m=0,h=0,minutos,horas;
		Scanner input= new Scanner(System.in);
		System.out.println("Insira os segundos");
		s=input.nextInt();
		minutos=Transformar(s,m);
		horas=TransformarH(minutos,h);
		System.out.println("as horas sao:"+horas+ "e " +minutos +" minutos");
	}
	static int Transformar(int s,int m){
		m=s/60;
		return m;
	}
	static int TransformarH(int minutos,int h){
		h=minutos/3600;
		return h;
	}
}
