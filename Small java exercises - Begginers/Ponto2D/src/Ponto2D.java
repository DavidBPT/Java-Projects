
public class Ponto2D {

	private double x,y;
	
	/**cosntrutor com parametros*/
	public Ponto2D(double cx,double cy){
		
		x=cx;
		y=cy;		
	}
	/** usar o construtor anterior com parametros*/
	public Ponto2D(){
		this(0.0,0.0);
		
	}
	
	/** construtor da cópia*/
	public Ponto2D(Ponto2D p){		/** Copia outro ponto igual ao outro(mobs iguais)*/
		x=p.getX();
		y=p.getY();
		
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setX(double x){
		this.x=x;
	}
	public void setY(double y){
		this.y=y;
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
	/** soma as coordenadas do ponto ao ponto recetor*/
	public void somaPonto(Ponto2D p){
		
		x += p.getX();
		y+= p.getY();
	}
	
	/** soma os valores do parametro e devolve o novo ponto */
	public Ponto2D somaPonto(double dx,double dy){
		
		return new Ponto2D(x+=dx , y+=dy);
	}
	
	
	
	/** Determina se o ponto é simetrico*/
	//dista do eixo dos xx o mesmo que do eixo dos yy
	public boolean simetrico(){
		
		return Math.abs(x)==Math.abs(y);
	}
	
	/**verifica ambas as coords positivas	 */
	public boolean coordPos(){
		return x > 0 && y > 0 ;
		
	}
	//Métodos usuais
	
	public boolean equals(Ponto2D p){
		
		if(p !=null){
			
			return (x==p.getX()) && y==p.getY();
			
		}
		else {
			return false;
		}
		
	}
	
	
	public boolean equalsMelhorado(Object obj){
		
		if(this ==obj)	return true; //This é o objecto que recebe, testa o endereço
		
		if(obj == null) return false;
		
		if(this.getClass() != obj.getClass()) return false;
		
		//Aqui temos a certeza que é um ponto 2D
		Ponto2D pp =(Ponto2D) obj;
		
		return x == pp.getX() && y==pp.getY();
		
	}
	
	/**cria um clone do ponto recetor(recetor=this)*/
	
	public Ponto2D clone(){
		return new Ponto2D(this);
	}
	
	public String toString(){
		StringBuilder  s = new StringBuilder("Ponto2D = ");
		s.append(x + ",");
		s.append(y + "\n");
		return s.toString();
	}
	
	
	
	
	
	
	
	
	
}
