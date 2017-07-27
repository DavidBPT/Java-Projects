import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.awt.event.ActionEvent;

public class Ex2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum;
	private JLabel lblCh;
	private JLabel lblTexto;
	private JLabel lblChave;
	private JButton btnGerarChave;
	
	Random Numeros = new Random(3546);
	int num,chav,cont=0;
	int x=0,y=0;
	int Estrelas[] = new int [2];
	int ChaveN[] = new int [5];
	int Chave[] = new int [5];
	boolean wat=false;
	boolean fill=true;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex2 frame = new Ex2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ex2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNum = new JTextField();
		txtNum.setBounds(10, 175, 260, 27);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		lblCh = new JLabel("Chave do Euro-Milh\u00F5es");
		lblCh.setBounds(10, 213, 204, 38);
		contentPane.add(lblCh);
		
		lblTexto = new JLabel("Resultado");
		lblTexto.setBounds(10, 98, 240, 35);
		contentPane.add(lblTexto);
		
		lblChave = new JLabel("Chave");
		lblChave.setBounds(10, 21, 260, 66);
		contentPane.add(lblChave);
		
		btnGerarChave = new JButton("Gerar Chave");
		btnGerarChave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GerarChave();
					
			
			}});
		btnGerarChave.setBounds(280, 21, 144, 66);
		contentPane.add(btnGerarChave);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arrays.sort(ChaveN);
				if(Arrays.equals(Chave, ChaveN)){
					lblTexto.setText("Yay");
				}
				else{
					lblTexto.setText("Sucka");
				}
				
				
			}
		});
		btnValidar.setBounds(335, 137, 89, 23);
		contentPane.add(btnValidar);
		
		JButton btnOk = new JButton("Adicionar");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adicionar();
					
		}
		});
		btnOk.setBounds(273, 175, 121, 27);
		contentPane.add(btnOk);
	}
	private void GerarChave()
	{
		
		for(int i=0;i<5;i++)
		{
			chav=Numeros.nextInt(50)+1;
			if(chav!=0 && Chave[0]!=chav && Chave[1]!=chav && Chave[2]!=chav && Chave[3]!=chav && Chave[4]!=chav){
				Chave[i]=chav;
			}
			else i--;
		}	
		
		for(int i=0;i<2;i++)
		{
			chav=Numeros.nextInt(11)+1;
			if(chav!=0 && Estrelas[0]!=chav && Estrelas[1]!=chav){
				Estrelas[i]=chav;
			}
		}	
		Arrays.sort(Chave);
		Arrays.sort(Estrelas);
		lblCh.setText(Arrays.toString(Chave)+Arrays.toString(Estrelas));
	}

	private void Adicionar()
	{
		num=Integer.parseInt(txtNum.getText());
		if(num>=1 && num <=50){
			if(x!=ChaveN.length)
			{
				ChaveN[x]=num;
				x++;
			}
		if(y!=Estrelas.length)
		{
			Estrelas[y]=num;
			y++;
		}
		}
		else{
	}lblChave.setText(Arrays.toString(ChaveN)+Arrays.toString(Estrelas));
	
}
}

