import java.util.ArrayList;
import java.util.Arrays;

public class Agenda {
	
	 
	 private ArrayList<Pessoa>contatos;
	 Agenda(){   
		 contatos=new ArrayList<Pessoa>();
    }
	 public ArrayList<Pessoa> getContatos() {
		return contatos;
	}
	public void setContatos(ArrayList<Pessoa> contatos) {
		this.contatos = contatos;
	}
	public void inserir(Pessoa c)
     {  
		contatos.add(c);
     }
	 
	 public Pessoa ProcurarPessoa(String nome)
     {  
		 for(int i=0;i<contatos.size();i++)
         {   
    	 	Pessoa c=contatos.get(i);
            if(c.getNome().equals(nome))
                return contatos.get(i);
         }
         return null;
     }
	 
	 public Pessoa RemoverPessoa (String nome){
		 for(int i=0;i<contatos.size();i++)
         {   
    	 	Pessoa c=contatos.get(i);
            if(c.getNome().equals(nome))
            	
                return contatos.remove(i);
	 }
		 return null;
		 
	 }
	 public Pessoa ProcurarPos(int pos){
		 
	       	 if(pos>=0 &&pos<contatos.size())
	          {   
	    	  return contatos.get(pos);
	          }
	         return null;
	 }
	 

}
