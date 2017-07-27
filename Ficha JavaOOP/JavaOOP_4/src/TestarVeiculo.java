import java.util.Scanner;

public class TestarVeiculo {

	static StringBuilder texto= new StringBuilder();
	static Scanner input = new Scanner(System.in);
	static boolean f=true;
	static String x;
	static int cap, via=0,opcao;
	static double quant=0,km=0,combustivel,preco=1.10,consumo;
	static Veiculo carro;
	
	public static void main(String[] args) {
		
		System.out.println("Insira a matricula do seu carro");
		x=input.nextLine();
		System.out.println("Insira a capacidade do carro");
		cap=input.nextInt();
		quant=cap;
		System.out.println("Insira o consumo do carro");
		consumo=input.nextInt();
		carro=new Veiculo( x,cap, km,quant,via, consumo);
		
		while(f!=false){
			Menu();
			opcao=input.nextInt();
			
			switch(opcao)
			{
				case 1:
					System.out.println("É possivel fazer "+ carro.KMcombustivel() +" Km's com "+ carro.getQuantidade()+" litros de combustivel");
				break;
				case 2:
					System.out.println("Introduza os kilometros feitos na viagem:");
					km=input.nextInt();
					System.out.println(carro.Viagem(carro, km));
					break;
				case 3:
					
					System.out.println("Já gastou no total, "+carro.getTotal()+"€ em combustivel");
					break;
				case 4:
					System.out.println("O custo médio por kilometro é "+(consumo/100)*preco+"€");
					break;
				case 5:
					System.out.println("Quantos litros deseja meter?");
					combustivel=input.nextDouble();
					System.out.println(carro.Encher(carro, combustivel, preco));
					break;
				case 6:
					System.out.println("Fim\n");
					f=false;
					break;
				default:				
					System.out.println("Opção invalida");
					break;
			}
	}
		input.close();
}
	public static void Menu(){
		texto.setLength(0);
		texto.append("----Opções----\n");
		texto.append("1----------Verificar KM's possiveis com combustivel disponivel\n");
		texto.append("2----------Registar Viagem\n");
		texto.append("3----------Total gasto em combustivel\n");
		texto.append("4----------Custo médio por quilómetro\n");
		texto.append("5----------Meter Combustivel\n");
		texto.append("6----------Fim\n");
		texto.append("-------------------Opções(1-5):\n");
		System.out.println(texto);
	}
}
