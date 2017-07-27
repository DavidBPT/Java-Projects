
public class TestaBalao {

	//Vars
	static String cor,direcao;
	static int altura,n,opcao;	
	static Balao balao = new Balao();
	static StringBuilder texto= new StringBuilder();
	static boolean f=true;
	
	static Balao[] Baloes = new Balao[20];
	
	
	public static void main(String[] args) 
	{
			menu();
	}
	
	public static void menu()
	{
		
		System.out.println("Insira o numero de baloes:");
		n = Input.lerInt();
		
		for(int i=0;i<n;i++)
		{
		
		System.out.println("----Novo Balão----");
		System.out.println("Introduza a Cor: ");
		balao.setCor(Input.lerString());
		System.out.println("Introduza a Direção: ");
		balao.setDirecao(Input.lerString());
		System.out.println("Introduza a Altura: ");
		balao.setAltura(Input.lerInt());
		Baloes[i]=balao;
		
		System.out.println("Balao de cor "+balao.getCor()+" vai para "+balao.getDirecao()+" a "+balao.getAltura()+" metros de altura.\n");
		
		while(f!=false){
		Menu();
		opcao=Input.lerInt();
		
		switch(opcao)
		{
			case 1:
				System.out.println("Introduza o valor a subir:");
				balao.subir(Input.lerInt());
			break;
			case 2:
				System.out.println("Introduza o valor a descer:");
				balao.descer(Input.lerInt());
				break;
			case 3: 
				System.out.println("Introduza a nova cor:");
				balao.setCor(Input.lerString());
				break;
			case 4:
				System.out.println("Introduza a nova direção:");
				balao.setDirecao(Input.lerString());
				break;
			case 5:
				System.out.println("Fim\n");
				break;
			default:				
				System.out.println("Opção invalida"); 
				f=false;
				break;
		}
		}
		Baloes[i]=balao;
		
		System.out.println("Balao de cor "+balao.getCor()+" vai para "+balao.getDirecao()+" a "+balao.getAltura()+" metros de altura.\n");
		}
	}
	
	public static void Menu(){
		texto.append("----Opções----\n");
		texto.append("1---Subir\n");
		texto.append("2---Descer\n");
		texto.append("3---Cor novo\n");
		texto.append("4---Mudar Direção\n");
		texto.append("5---Fim\n");
		texto.append("--------Opções(1-5):\n");
		System.out.println(texto);
	}
}
