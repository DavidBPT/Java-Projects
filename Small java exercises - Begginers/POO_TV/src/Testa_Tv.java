import java.util.Scanner;

public class Testa_Tv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TV tv1= new TV();
		//TV tv2= new TV();
		int op;
		System.out.println(tv1.getCanal());
		
		Scanner input= new Scanner(System.in);
		do{
			System.out.println("1-Liga TV       0-Desliga TV");
			op=input.nextInt();
			switch(op){
				case 1: tv1.ligaTV();
					tv1.enviaMensagem();
					break;
				case 0: tv1.desligarTV();
					tv1.desligarTV();
					break;
				default: System.out.println("Insira um valor válido");
			}
		}while(op!=0 && op!=1);
		
		System.out.println("Escolha o canal pretendido");
		tv1.mudaCanal(input.nextInt());
		System.out.println(tv1.getCanal());
		
		if(tv1.getEstado()){
			System.out.println("Ligada");
		}
		else{
			System.out.println("Desligada");
		}
		input.close();
	}

}
