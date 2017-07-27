public class Pixel {

	private double x,y;
	private int cor;
	
	public Pixel(double x,double y,int cor){
		this.x = x;
		this.y = y;
		this.cor = (cor >= 0 && cor <=255) ? cor : 0;
	}
	public Pixel(){
		x=0;
		y=0;
		cor=0;
		
	}
	public Pixel(Pixel p){	
		x=p.getX();
		y=p.getY();	
		cor=p.getCor();
	}
	
	 public Pixel(int cor){
	  
	  x=0.0;
	  y=0.0;
	  this.cor = (cor >= 0 && cor <=255 ? cor : 0  );
	 }
	
	public double getX() {
		return x;
	}	
	public double getY() {
		return y;
	}
	/**Incrementa as cordenadas		 */
	public void incCoord(double dx, double dy){
		x+=dx;
		y+=dy;
	}
	/**Decrementa as cordenadas		 */
	public void decCoord(double dx, double dy){
		x-=dx;
		y-=dy;
	}
	
	//Métodos usuais
	
	public boolean equalsMelhorado(Object obj){
		
		if(this ==obj)	return true; //This é o objecto que recebe, testa o endereço
		
		if(obj == null) return false;
		
		if(this.getClass() != obj.getClass()) return false;
		
		//Aqui temos a certeza que é um ponto 2D
		Pixel pp =(Pixel) obj;
		
		return x == pp.getX() && y==pp.getY();
		
	}
	
	/**cria um clone do ponto recetor(recetor=this)*/
	
	public Pixel clone(){
		return new Pixel(this);
	}
	
	public String toString(){
		StringBuilder  s = new StringBuilder("Ponto2D = ");
		s.append(x + ",");
		s.append(y + "\n");
		return s.toString();
	}
	
	public int getCor() {
		return cor;
	}

	public void setCor(int cor) {
		this.cor = cor;
	}
	
}
