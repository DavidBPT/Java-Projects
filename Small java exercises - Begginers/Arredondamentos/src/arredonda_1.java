
public class arredonda_1 {

	public static void main(String[] args) {
		
		float numero = 2.65264f;
		/*
		//arredonda para inteiro
		System.out.println(Math.round(numero));
		
		//arredonda para cima retornando um decimal
		System.out.println(Math.ceil(numero));
		
		//arredonda para baixo retornando um decimal
		System.out.println(Math.floor(numero));
		*/
		double number1 = 10.123456;
        double number2 = (int)Math.round(number1 * 100)/(double)100;
        System.out.println(number2);
		
		
	}
}
