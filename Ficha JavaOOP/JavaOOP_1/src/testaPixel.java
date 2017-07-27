import java.util.Scanner;

public class testaPixel {
	
	public static void main(String[] args) {

		Pixel p1 = new Pixel();
		String tecla;
		int cor = 0;
		boolean f=true;
		Scanner input = new Scanner(System.in);
		System.out.println("Escolha o numero da cor");
		while(f!=false){
			cor=input.nextInt();
			if(cor>=0 && cor <=255){
				//p1.setCor(cor);
				f=false;
			}
			else{
				System.out.println("Escolha uma cor entre 0 e 255");
			}
		}
		/*
		 * 
		Dizer o nome da cor
		int wat;
		wat=cor*65536+cor*256+cor;
		Color customColor = new Color(cor,cor,cor);
		System.out.println(customColor.getRGB());
		String hex = Integer.toHexString(customColor.getRGB() & 0xffffff);
		System.out.println(hex);
		*
		*
		*
		*/
		StringBuilder texto = new StringBuilder();
		
		System.out.println("A cor do pixel é "+cor);
		f=true;
		System.out.println("Mova entre W,A,S,D (+Enter), insira outra tecla para sair");
		while(f!=false){
			tecla=input.next().toLowerCase();
			switch (tecla) {
	        case "d":
	            p1.incCoord(1,0);
	            System.out.println("["+p1.getX()+","+p1.getY()+"]");
	            break;
	        case "a":
	        	p1.decCoord(1,0);
	        	System.out.println("["+p1.getX()+","+p1.getY()+"]");
	            break;
	        case "w":
	        	p1.incCoord(0,1);
	        	System.out.println("["+p1.getX()+","+p1.getY()+"]");
	            break;
	        case "s":
	        	p1.decCoord(0,1);
	        	System.out.println("["+p1.getX()+","+p1.getY()+"]");
	            break;
	         default:
	        	 f=false;
	        	 break;
			}
		}
		input.close();
		texto.append("Pixel: [");
		texto.append(p1.getX());
		texto.append(";");
		texto.append(p1.getY());
		texto.append("]");
		System.out.println(texto);
	}
}