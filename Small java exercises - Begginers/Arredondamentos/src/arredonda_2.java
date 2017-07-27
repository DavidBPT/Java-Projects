import java.math.RoundingMode;
import java.text.DecimalFormat;

public class arredonda_2 {

	public static void main(String[] args) {
		
		DecimalFormat formato = new DecimalFormat("#.000"); 
		
		float numero = 2.65264f;
		
		System.out.println(formato.format(numero));
		
		formato.setRoundingMode(RoundingMode.DOWN);
		
		System.out.println(formato.format(numero));

	}

}
