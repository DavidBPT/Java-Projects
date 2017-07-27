public class Exercicio4 {

	public static void main(String[] args) {
		int CI=1500;
		float y1=0.2f,y2=0.25f,y3=0.3f,CA,TA;
		
		for(int i=1;i<=3;i++)
		{
			if(i==1){
				TA=(float) (1+y1);
				CA=(float) (CI*Math.pow(TA,i));
				System.out.println("O Capital acumulado é "+Math.ceil(CA));
				}
			else if(i==2){
					TA=(float) (1+y2);
					CA=(float) (CI*Math.pow(TA,i));
					System.out.println("O Capital acumulado é "+Math.ceil(CA));}
			else{
				TA=(float)(1+y3);
				CA=(float) (CI*Math.pow(TA,i));
				System.out.println("O Capital acumulado é "+Math.ceil(CA));}
		}
		
		
		
		
	}

}
