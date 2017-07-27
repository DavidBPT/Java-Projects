import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) throws Exception {
		Scanner input= new Scanner(System.in);
		int [] numeros= new int[4];
		boolean full=false;
		int i=0;
		while(!full)
		{
			
		i++;
		try{
			System.out.println("Insira numeros");
			for(;i<numeros.length;)
			{
				numeros[i]=input.nextInt();
					if(numeros[i]%1==0)
						throw new Exception();
			}
		}
		catch(InputMismatchException e){
			if(numeros[i]==(int)numeros[i]){
				numeros[i]=10*5;
			}
			else{
				numeros[i]=20*5;
			}
		}
		catch(Exception e){
			numeros[i]=numeros[i]*5;
		}
			if(i==numeros.length)
			{
				full=true;
			}
		}	
		//System.out.println(Arrays.toString(numeros));
}
}
