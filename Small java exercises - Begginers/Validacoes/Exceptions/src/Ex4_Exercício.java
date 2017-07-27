import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Ex4_Exercício {

	public static void main(String[] args) {
		
		double desvio = 0;
		//double n;
		
		ArrayList<Double> d = new ArrayList<>();
		
		ArrayList<Integer> i = new ArrayList<>();
		
		d.add(5.78);
		d.add(7.0);
		d.add(6.54);
		d.add(3.345);
		d.add(10.0);
		d.add(10.9);
		
		for(int j = 0; j < d.size(); j++){
			
			try {
				
				//n = (double) d.get(j);
				//i.add((int)n);
				
				i.add((d.get(j)).intValue());
				
				if((i.get(j)).doubleValue() != d.get(j)){
					
					throw new Exception();
				}
				
			}
			
			catch (Exception e){
				
				System.out.println(String.format("%4.3f foi truncado para %d\n", d.get(j), i.get(j)));
				
				desvio += d.get(j) - i.get(j); 
			}
		}
		
		BigDecimal bd = new BigDecimal(desvio).setScale(3,RoundingMode.HALF_EVEN);
		
		System.out.println("Somatório dos erros igual a  " + bd.doubleValue());
	}
}
