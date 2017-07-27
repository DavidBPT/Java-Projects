import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

public class testa_copo {

	private JFrame frame;
	private JProgressBar PB1;
	private JButton btnServir;
	private JButton btnAtender;
	
	private JTextField txtPessoas;
	private JProgressBar PB2;
	private JProgressBar PB3;
	private JProgressBar PB4;
	private JComboBox<Object> comboBox4;
	private JComboBox<Object> comboBox3;
	private JComboBox<Object> comboBox2;
	private JComboBox<Object> comboBox1;
	private JButton btnEsvaziar;
	
	ArrayList<Copo> Copos = new ArrayList<>();
	ArrayList<Object> PB = new ArrayList<>();
	ArrayList<Object> Combos = new ArrayList<>();
	String[] Bebidas = {null,"Cerveja","Água","Sumo"};
	Random Descer = new Random();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testa_copo window = new testa_copo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public testa_copo() {
		initialize();
		AntesEntrar();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 503, 347);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtPessoas = new JTextField();
		txtPessoas.setText("Pessoas");
		txtPessoas.setBounds(10, 11, 300, 28);
		frame.getContentPane().add(txtPessoas);
		txtPessoas.setColumns(10);
		
		btnAtender = new JButton("Tentar entrar no Bar");
		btnAtender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AntesEntrar();
				Entrar();
				Criar();
				
			}
		});
		btnAtender.setBounds(320, 11, 157, 28);
		frame.getContentPane().add(btnAtender);
		
		btnServir = new JButton("Fill it up!");
		btnServir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Servir();
				
			}
		});
		btnServir.setBounds(182, 152, 107, 28);
		frame.getContentPane().add(btnServir);
		
		PB1 = new JProgressBar();
		PB1.setOrientation(SwingConstants.VERTICAL);
		PB1.setMaximum(25);
		PB1.setEnabled(false);
		PB1.setBounds(10, 64, 23, 88);
		frame.getContentPane().add(PB1);
		
		PB2 = new JProgressBar();
		PB2.setOrientation(SwingConstants.VERTICAL);
		PB2.setMaximum(25);
		PB2.setBounds(454, 64, 23, 88);
		frame.getContentPane().add(PB2);
		
		PB3 = new JProgressBar();
		PB3.setOrientation(SwingConstants.VERTICAL);
		PB3.setMaximum(25);
		PB3.setBounds(10, 182, 23, 95);
		frame.getContentPane().add(PB3);
		
		PB4 = new JProgressBar();
		PB4.setOrientation(SwingConstants.VERTICAL);
		PB4.setMaximum(25);
		PB4.setBounds(454, 182, 23, 95);
		frame.getContentPane().add(PB4);
		
		
		comboBox1 = new JComboBox<Object>(Bebidas);
		comboBox1.setBounds(43, 98, 107, 23);
		frame.getContentPane().add(comboBox1);
		
		comboBox2 = new JComboBox<Object>(Bebidas);
		comboBox2.setBounds(320, 99, 109, 22);
		frame.getContentPane().add(comboBox2);
		
		comboBox3 = new JComboBox<Object>(Bebidas);
		comboBox3.setBounds(43, 216, 107, 23);
		frame.getContentPane().add(comboBox3);
		
		comboBox4 = new JComboBox<Object>(Bebidas);
		comboBox4.setBounds(322, 216, 107, 23);
		frame.getContentPane().add(comboBox4);
		
		btnEsvaziar = new JButton("Bota abaixo!");
		btnEsvaziar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Esvaziar();
			}
		});
		btnEsvaziar.setBounds(182, 248, 107, 28);
		frame.getContentPane().add(btnEsvaziar);
	}
	
	//----- INTERFACE APENAS -----
	public void Entrar(){
		
		switch(txtPessoas.getText()){
		case "1":
			PB1.setVisible(true);
			btnServir.setVisible(true);
			comboBox1.setVisible(true);
			break;
		case "2":
			PB1.setVisible(true);
			PB2.setVisible(true);
			comboBox1.setVisible(true);
			comboBox2.setVisible(true);
			btnServir.setVisible(true);
			break;
		case "3":
			PB1.setVisible(true);
			PB2.setVisible(true);
			PB3.setVisible(true);
			comboBox1.setVisible(true);
			comboBox2.setVisible(true);
			comboBox3.setVisible(true);
			btnServir.setVisible(true);
			break;
		case "4":
			PB1.setVisible(true);
			PB2.setVisible(true);
			PB3.setVisible(true);
			PB4.setVisible(true);
			btnServir.setVisible(true);
			comboBox2.setVisible(true);
			comboBox3.setVisible(true);
			comboBox4.setVisible(true);
			comboBox1.setVisible(true);
			break;
			default:JOptionPane.showMessageDialog(frame, "Só há 4 lugares disponiveis!");	// Mensagem de Erro se numero for antes de 0 e depois de 4
		}
	}//----- INTERFACE APENAS -----
	public void AntesEntrar(){
		PB1.setVisible(false);
		PB2.setVisible(false);
		PB3.setVisible(false);
		PB4.setVisible(false);
		btnEsvaziar.setVisible(false);
		btnServir.setVisible(false);
		comboBox2.setVisible(false);
		comboBox3.setVisible(false);
		comboBox4.setVisible(false);
		comboBox1.setVisible(false);
	}
	//----- INTERFACE APENAS -----
	
	public void Criar(){
		Copos.removeAll(Copos);
		comboBox1.setSelectedItem(null);
		comboBox2.setSelectedItem(null);
		comboBox3.setSelectedItem(null);
		comboBox4.setSelectedItem(null);
		
		
		
		for(int i=0;i<Integer.parseInt(txtPessoas.getText());i++){
				Copos.add(new Copo());									//Cria os copos conforme o numero de pessoas
			}
		System.out.println(Copos);
		PB.add(PB1);
		PB.add(PB2);
		PB.add(PB3);
		PB.add(PB4);
	} 
	public void Esvaziar(){
		for(int i=0;i<Copos.size();i++){
			if(Copos.get(i).getLiquido()!= null && Copos.get(i).getContem()>0){
			Copos.get(i).esvaziar(Descer.nextInt((int) Copos.get(i).getContem())+1);	//Vai esvaziar uma quantidade RANDOM
			((JProgressBar) PB.get(i)).setValue((int) (Copos.get(i).getContem()));		// Valores nas Progress bar
			}
		}
		
	}
	public void Servir(){
					//Vai buscar os items selecionados nas ComboBox
		Copos.get(0).setLiquido(null);
		Combos.add(comboBox1.getSelectedItem());
		Combos.add(comboBox2.getSelectedItem());
		Combos.add(comboBox3.getSelectedItem());
		Combos.add(comboBox4.getSelectedItem());
		for(int i=0;i<Copos.size();i++){								//E adiciona o respetivo item/bebida a cada copo
			if(Combos.get(i)!= "Desconhecido"){
				Copos.get(i).setLiquido((String) Combos.get(i));;
				Copos.get(i).encher(Copos.get(i).getCapacidade());		// Capacidade está 
			}
		}
		for(int i=0;i<Copos.size();i++){								//Cores das progressBar conforme a bebida
			if(Combos.get(i)!= null){
				((JProgressBar) PB.get(i)).setValue((int) (Copos.get(i).getContem()));
				if(Combos.get(i)=="Cerveja"){
					((JProgressBar) PB.get(i)).setForeground(Color.YELLOW);
				}
				else if(Combos.get(i)=="Água"){
					((JProgressBar) PB.get(i)).setForeground(Color.blue);
				}
				else if(Combos.get(i)=="Sumo"){
					((JProgressBar) PB.get(i)).setForeground(Color.orange);
				}	
			}
		}
		for(int i=0;i<Copos.size();i++){
			if(Combos.get(i)!= null){
				btnEsvaziar.setVisible(true);
			}
		}
	}
}
