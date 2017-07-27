import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Teste_Agenda {
	
	public static void main(String[] args) {
		Agenda a = new Agenda ();
		Pessoa p = new Pessoa(null, null, null);
		Pessoa m;
		ArrayList<Pessoa> agenda = new ArrayList<Pessoa>(a.getContatos().size());
		int op,ap;
		String nomes, emails, telefones;
		Scanner agen = new Scanner(System.in);
		System.out.println("Insira o número 0 para entrar na agenda");
		
		while (agen.nextInt()==0){	
		menu();
		op = agen.nextInt();
		switch (op) {
		case 1:
			System.out.println("Insira o nome");
			nomes = agen.next();
			p.setNome(nomes);
			System.out.println("Insira o email");
			emails = agen.next();
			p.setEmail(emails);
			System.out.println("Insira o telefone");
			telefones = agen.next();
			p.setTelefone(telefones);
			a.inserir(new Pessoa(nomes,emails,telefones));
			System.out.println("Pessoa inserida com sucesso");
			break;
		case 2:
			System.out.println("Insira o nome da pessoa que pretende remover");
			nomes = agen.next();
			a.RemoverPessoa(nomes);
			
			break;
		case 3:
			System.out.println("Insira o nome da pessoa que pretende procurar");
			nomes = agen.next();
			System.out.println(a.ProcurarPessoa(nomes));
			break;
		case 4:
			 for(int i=0;i<agenda.size();i++){
				 agenda.addAll(a.getContatos());
				 
			 }
			 System.out.println(agenda);
			/*agenda.addAll(p.getContatos());
			for (int i=0;i<agenda.size();i++){
			System.out.println(agenda.get(i).getNome()+" "+agenda.get(i).getEmail()+" "+agenda.get(i).getTelefone());
			}*/
			
			break;
		case 5:
			
			break;
		default:
			System.out.println("Escolha uma opção de 1 a 5");
			break;
		}
		System.out.println("Pretende continuar insira o numero 0");
	}
	}

	public static void menu() {
		
		
		System.out.println("Bem Vindo á Agenda Selecione no menu o que pretende");
		System.out.println("1-Inserir Pessoas");
		System.out.println("2-Remover Pessoa");
		System.out.println("3-Procurar Pessoa pelo nome");
		System.out.println("4-Imprimir Agenda");
		System.out.println("5-Imprimir Pessoas a partir de uma certa posição");
		
	}
}
