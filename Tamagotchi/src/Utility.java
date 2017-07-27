import java.util.Random;

public final class Utility {
	
	private static Random gerador = new Random();
	
	
	public static int aleatorio(int inf, int sup){
		
		return  inf + gerador.nextInt((sup+1) - inf);
	}
}

