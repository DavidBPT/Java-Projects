
public class Copo {

	
	//Variaveis/Propriedades de instancia
	 private String liquido;
	 private double capacidade;
	 private double contem;
	 
	 //Construtores
	 public Copo(){
		 
		 liquido="Desconhecido";
		 capacidade=25.0;
		 contem=0.0;
		 
	 }
	 public Copo(String liq, double volume){
		 liquido=liq;
		 capacidade=volume;
		 contem=0.0;
	 }
	public String getLiquido() {
		return liquido;
	}
	public void encher(double volume){
		if(contem + volume>=capacidade){
			contem=capacidade;
		}
		else{
			contem +=volume;
		}
	}
	public void setLiquido(String nomeLiquido){
		liquido=nomeLiquido;
		
	}
	public void esvaziar(double volume){
		double aux=contem-volume;
		contem=((aux)<=0.0) ? 0.0 : aux;  
		
		/*
		 * if(aux<=0.0){
		 * 		contem=0.0;
		 * else{
		 * 		contem=aux;}
		 */
	}
	// -------------------------------------------------------------------------------------------//
	public double getCapacidade() {
		return capacidade;
	}
	
	
	// -------------------------------------------------------------------------------------------//
	public double getContem() {
		return contem;
	}
	
	public boolean cheio(){
		return contem==capacidade;
	}
	public int quantoEmPercentagem(){
		return(int)Math.round(contem/capacidade*100);
	}
	
	
	 
	 
	
}
