import java.math.BigDecimal;
import java.math.RoundingMode;

public class arredonda_3 {

	public static void main(String[] args) {
		
		double numero = 2.652643672398723;
		
		BigDecimal bd = new BigDecimal(numero).setScale(5,RoundingMode.HALF_EVEN);
		
		System.out.println(bd.floatValue());

	}

}
