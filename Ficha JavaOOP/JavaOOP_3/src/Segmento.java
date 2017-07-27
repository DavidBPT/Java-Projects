public class Segmento {
	
	private Ponto2D p1;
	private Ponto2D p2;
	
	//construtor por omissão
	
	public Segmento(){
		
		p1=new Ponto2D();
		p2=new Ponto2D();
		
	}

	//**Construtor com valores *
	
	public Segmento(Ponto2D pa, Ponto2D pb){
		
		p1=pa.clone();
		p2=pb.clone();
	}
	
	//**Construtor da copia *
	
	public Segmento(Segmento segm)
	{
		p1=segm.daInicio();
		p2=segm.daFim();
	}
	
	public Ponto2D daInicio(){
		
		return p1.clone();
	}
	public Ponto2D daFim(){
		
		return p2.clone();
	}
	
	public Ponto2D getP1() {
		return p1;
	}
	public Ponto2D getP2() {
		return p2;
	}

	/**Comprimento do Segmento */
	
	public double compSegmento(){
		
		double dx=p1.getX() - p2.getX();
		double dy=p1.getY() - p2.getY();
		
		dx=dx*dx;
		dy=dy*dy;
		
		return Math.sqrt(dx+dy);
	}
	
	/**Determina o declive do segmento*/
	public double decliveSegmento(){
		
	double dx = p1.getX()- p2.getX();
	double dy = p1.getY()- p2.getY();
	return dx/dy;
	
	}
	
	public String daDeclive(){
		
		String declive= "";
		
		if(this.decliveSegmento()<0){
			
			declive = " O segmento a descer...";	
		}
		else if(this.decliveSegmento()>0) {

			declive=" O segmento a subir...";
		}
		else return declive;
		return declive;
			
		
	}
		
		/** desloca o segmento em XX e YY*/
		
		public void deslocaSeg (double dx, double dy)
		
		{
			p1.incCoord(dx, dy);
			p2.incCoord(dx, dy);
			
		}
		
		/**Desloca Ponto Inicial*/
		
		public void deslocaInic(double dx, double dy)
		{
			p1.incCoord(dx, dy);
			
		}
		
	/**Desloca Ponto Final*/
		
		public void deslocaFinal(double dx, double dy)
		{
			p2.incCoord(dx, dy);
			
		}
		
		/* MÉTODOS GENÉRICOS*/
		
		/*Versao simples do igual*/
		
		
		
		public boolean igual(Segmento seg){
			
			return p1.equals(seg.daInicio()) && p2.equals(seg.daFim());
			
		}
		/* Versao completa do igual**/
		
		public boolean equals(Object obj){
			
			
			if (this ==obj) return true;
			if (this ==null) return false;
			
			if (this.getClass() != obj.getClass()){
				
				return false;
			}
			
			Segmento segm= (Segmento) obj;
			
			return this.daInicio().equals(segm.daInicio()) && this.daFim().equals(segm.daFim());
			
		}
		
			/**clone */
			public Segmento clone(){
				
				return new Segmento(this);
			}
			public String toString(){
				
				StringBuilder s = new StringBuilder("Segmento [" + p1.toString() + "," + p2.toString()+"]");
				return s.toString();
			}
			
		
}
