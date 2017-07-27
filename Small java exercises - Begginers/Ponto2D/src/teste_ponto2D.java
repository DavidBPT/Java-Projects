
public class teste_ponto2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ponto2D ponto= new Ponto2D(2.0,2.5);
		
		StringBuilder texto = new StringBuilder();
		System.out.println(("Ponto2D: ["+ponto.getX() +","+ponto.getY()+"]"));
		
		
		Ponto2D pontoCopia = new Ponto2D(ponto);
		texto.append("Ponto2D: [");
		texto.append(pontoCopia.getX());
		texto.append(",");
		texto.append(pontoCopia.getY());
		texto.append("]");
		
		System.out.println(texto);
		System.out.println(ponto.getClass());
		
		pontoCopia.somaPonto(10, 10);
		
		//Copia o ponto +10
		texto.append("Ponto2D: [");
		texto.append(pontoCopia.getX());
		texto.append(",");
		texto.append(pontoCopia.getY());
		texto.append("]");
		
		System.out.println(texto);
		Ponto2DCor pontoColorido = new Ponto2DCor();
		
		System.out.println(pontoColorido.getCor());
		
		System.out.println(pontoColorido.getClass());
		
		System.out.println(ponto.equalsMelhorado(pontoColorido));
		
		System.out.println(ponto.toString());
		
	}

}
