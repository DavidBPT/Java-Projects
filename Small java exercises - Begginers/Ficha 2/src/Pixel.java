
public class Pixel {

	//Variáveis de instância
	
	private double x;  //coordenada em X
	private double y;  //coordenada em Y
	
	private int cor;  //entre 0 e 255
	
	//Construtores
	
	public Pixel(){
		
		x=0.0;
		y=0.0;
		cor=0;
	}
	
	public Pixel(int cor){
		
		x=0.0;
		y=0.0;
		this.cor = (cor >= 0 && cor <=255) ? cor : 0;
	}
	
	public Pixel(double x, double y, int cor){
		
		this.x = x;
		this.y = y;
		this.cor = (cor >= 0 && cor <=255) ? cor : 0;
	}
	
	public Pixel(Pixel p){
		
		x = p.getX();
		y = p.getY();
		cor = p.getCor();
	}
	
	
	//Métodos de instância
	
	public double getX() {return x;}
	public double getY() {return y;}
	public int getCor() {return cor;}
	
	/**modificação da cor*/
	
	public void mudaCor(int novaCor){
		
		cor = novaCor;
		
	}
	
	/**método auxiliar que resolve todas as deslocações
	    do pixel*/
	
	private void desloca(double dx, double dy){
		
		x += dx;
		y += dy;
	}
	
	//métodos de deslocamento do pixel
	
	/**desloca o pixel para cima*/
	
	public void paraCima(double val){
		
		this.desloca(0.0, val);
	}
	
	/**desloca o pixel para baixo*/
	
	public void paraBaixo(double val){
		
		this.desloca(0.0, -val);
	}
	
	/**desloca o pixel para a esquerda*/
	
	public void paraEsq(double val){
		
		this.desloca(-val, 0.0);
	}
	
	/**desloca o pixel para a direita*/
	
	public void paraDir(double val){
		
		this.desloca(val, 0.0);
	}
	
	
	/**teste básico de igualdade de pixels*/
	
	public boolean equals(Pixel p){
		
		return x == p.getX() && y == p.getY() && cor == p.getCor();
	}
	
	/**toString*/
	
	public String toString(){
		
		StringBuilder s = new StringBuilder();
		
		s.append("Pixel = (" + x + "," + y + ", " + cor + ")\n");
		
		return s.toString();
	}
	
	/**Cópia do pixel recetor*/
	
	public Pixel clone(){ return new Pixel(this);}
}
