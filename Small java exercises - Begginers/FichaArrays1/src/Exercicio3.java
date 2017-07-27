
public class Exercicio3 {

	public static void main(String[] args) {
		
		char x='A';
		char [] abc = new char[16];
		for(int i=0;i<abc.length;i++) 
			abc[i]=x++;
		for(int i=0;i<abc.length;i++){
			System.out.println(""+ (i+1) + ": "+abc[i]);}

	}

}
