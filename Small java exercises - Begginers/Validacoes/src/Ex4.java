
public class Ex4 {

	public static void main(String[] args) {
		double desvio=0;
		double[]d={5.78, 7, 6.54, 3.345, 10, 10.9};
		int [] i = new int[d.length];
		for(int j=0;j<d.length;j++){
			try{
				i[j]=(int)d[j];
				if(i[j] != d[j])
				{
					throw new Exception(); //Interrompe o for para trtar da excepcao
				}
			}
			catch (Exception e)
			{
				System.out.println(String.format("%4.3f foi truncado para %d\n", d[j],i[j]));
				desvio +=d[j]-i[j];
			}
		}
		System.out.println(String.format("Somatorio dos erros foi %4.3f\n",desvio));
	}

}