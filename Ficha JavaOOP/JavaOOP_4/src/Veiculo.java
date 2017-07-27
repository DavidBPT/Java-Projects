/**CONSTRUTORES*/

public class Veiculo {
	String matricula,resultado;
	double capacidade,consumo,quantidade,kilometers,total;
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	int contViagens;
	
	
	public Veiculo(){
		matricula="xxxx";
		capacidade=50;
		kilometers=0;
		quantidade=0;
		contViagens=0;
		consumo=7;
	}
	public Veiculo(String matricula,double capacidade, double kilometers,double quantidade,int contViagens,double consumo){
		this.matricula=matricula;
		this.capacidade=capacidade;
		this.kilometers=kilometers;
		this.quantidade=quantidade;
		this.contViagens=contViagens;
		this.consumo=consumo;
	}
	public Veiculo(Veiculo carro2){	
		matricula=carro2.getMatricula();
		capacidade=carro2.getCapacidade();
		kilometers=carro2.getCapacidade();
		quantidade=carro2.getCapacidade();
		contViagens=carro2.getContViagens();
		consumo=carro2.getConsumo();
	}
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}
	public Veiculo clone(){
		return new Veiculo (this);
	}
	
	/**GETS E SETS**/
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public double getKilometers() {
		return kilometers;
	}
	public void setKilometers(double d) {
		this.kilometers = d;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double d) {
		this.quantidade = d;
	}
	public int getContViagens() {
		return contViagens;
	}
	public void setContViagens(int contViagens) {
		this.contViagens = contViagens;
	}
	public String KMcombustivel(){
		double KM=(quantidade*100)/consumo;
		return String.valueOf(KM);
	}
	public String Viagem(Veiculo carro,double km){
		if(carro.getQuantidade()-((consumo*km)/100)<0){
			resultado="Não tem combustivel suficiente";
		}
		else{
			carro.setContViagens(carro.getContViagens()+1);
			carro.setKilometers(carro.getKilometers()+km);
			carro.setQuantidade(carro.getQuantidade()-((consumo*km)/100));
			
			if(carro.getQuantidade()<=10){
				resultado="O carro já fez "+carro.getKilometers()+"Km's, e entrou na reserva com "+carro.getQuantidade()+" litros restantes e já realizou "+carro.getContViagens()+" viagens";
			}
			else
				resultado="O carro já fez "+carro.getKilometers()+"Km's, com "+carro.getQuantidade()+" litros restantes e já realizou "+carro.getContViagens()+" viagens";
		}
		
		return resultado;
	}
	public String Encher(Veiculo carro,double combustivel,double preco){
		if(carro.getQuantidade()==carro.getCapacidade()){
			resultado="O deposito está cheio";
		}
		else if(combustivel>=carro.getCapacidade() || combustivel+carro.getQuantidade()>=carro.getCapacidade()){
			carro.setQuantidade(carro.getCapacidade());
			carro.setTotal(carro.getTotal()+(carro.getCapacidade())*preco);
			resultado="Encheu o deposito, gastando "+(carro.getCapacidade())*preco+" euros";
		}
		else{
			carro.setTotal(carro.getTotal()+combustivel*preco);
			carro.setQuantidade(carro.getQuantidade()+combustivel);
			resultado="Meteu no deposito "+combustivel+ " litros, gastando "+combustivel*preco+" euros";
		}
		return resultado;
	}
}