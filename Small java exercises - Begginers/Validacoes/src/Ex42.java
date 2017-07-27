import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Ex42 {

	public static void main(String[] args) {
		double desvio=0;
		ArrayList <Double> d = new ArrayList<>();
		d.add(5.78);
		d.add(7.0);
		d.add(6.54);
		d.add(3.345);
		d.add(10.0);
		d.add(10.9);	
		ArrayList <Integer> i =new ArrayList<>();
		for(int j=0;j<d.size();j++){
			try{
				i.add(d.get(j).intValue());
				if(i.get(j).intValue() != d.get(j))
				{
					throw new Exception(); //Interrompe o for para trtar da excepcao
				}
			}
			catch (Exception e)
			{
				System.out.println(String.format("%4.3f foi truncado para %d\n", d.get(j),i.get(j)));
				desvio +=d.get(j)-i.get(j);
			}
		}
		BigDecimal bd = new BigDecimal(desvio).setScale(5,RoundingMode.HALF_EVEN);
		System.out.println(String.format("Somatorio dos erros foi %4.3f\n",desvio));
		

	}

}
