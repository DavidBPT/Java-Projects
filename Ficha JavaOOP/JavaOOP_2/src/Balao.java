
public class Balao 
{
	//Variaveis 
	
	private int altura;
	private String cor,direcao;
	
	/**Construtor com paramentros */
	public Balao(int cy)
	{
		altura =cy;
	}
	
	/**Usar construtor anterior com parametros x=0 y=0*/
	public Balao()
	{
		this(0);
	}
	
	/**Construtor da copia*/
	
	
	public void subir(int dy)
	{
		
		altura += dy;	
	}
	public void descer(int dy)
	{
		
		altura -= dy;	
	}
	
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	
}
