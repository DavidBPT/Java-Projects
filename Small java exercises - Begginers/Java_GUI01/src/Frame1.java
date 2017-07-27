import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNConta;
	private JTextField txtLevantamento;
	private JButton btnLevantamentos;  // só gera codigo, nao cria butao. Isto cria
	private JLabel lblInfo;
	private JButton btnLogIn;
	private boolean estado = false;
	
	private String conta = "222-1234";
	private double saldo = 1000.0;
	private int cont=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 frame = new Frame1();
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
	public Frame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 447, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNConta = new JTextField();
		txtNConta.setBounds(143, 39, 153, 25);
		contentPane.add(txtNConta);
		txtNConta.setColumns(10);
		
		txtLevantamento = new JTextField();
		txtLevantamento.setBounds(143, 75, 153, 25);
		contentPane.add(txtLevantamento);
		txtLevantamento.setColumns(10);
		
		JLabel lblNDeConta = new JLabel("N\u00BA de conta :");
		lblNDeConta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNDeConta.setBounds(26, 39, 98, 25);
		contentPane.add(lblNDeConta);
		
		JLabel lblQuantiaALevantar = new JLabel("Quantia a Levantar:");
		lblQuantiaALevantar.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQuantiaALevantar.setBounds(26, 75, 98, 25);
		contentPane.add(lblQuantiaALevantar);
		
		lblInfo = new JLabel("");
		lblInfo.setBounds(43, 166, 340, 42);
		contentPane.add(lblInfo);
		
		btnLogIn = new JButton("Log in");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(estado){
					estado=false;
					LogOut();
				}
				else{
					verificarConta();
					estado=true;
					
				}
			}
		});
		btnLogIn.setBounds(64, 130, 115, 25);
		contentPane.add(btnLogIn);
		
		// é necessario criar la em cima, para meter codigo envolvendo o botao
		btnLevantamentos = new JButton("Levantamentos");
		btnLevantamentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				levantamento();
			}
		});
		btnLevantamentos.setEnabled(false);
		btnLevantamentos.setBounds(217, 131, 153, 25);
		contentPane.add(btnLevantamentos);
	}
	private void verificarConta()
	{
		String aux = txtNConta.getText().trim();
		
		if(aux.equals(conta))
		{
			btnLevantamentos.setEnabled(true);
			lblInfo.setText("O seu saldo é de "+ saldo + " euros.");
			btnLogIn.setText("LogOut");
		}
		else
		{
			lblInfo.setText("Essa conta nao existe, tente novamente");
		}
		
	}
	private void levantamento()
	{	
		double aux = Double.parseDouble(txtLevantamento.getText());
		if(aux<=saldo)
		{
			saldo -= aux;
			lblInfo.setText("Levantamento efectuado. O saldo é de "+saldo+" euros.");
		}
		else{
			lblInfo.setText("Lamento mas nao tem saldo!");
			cont++;
		}
		if(cont==3){
			lblInfo.setText("Contacte alguem para o ajudar");
			btnLogIn.setEnabled(false);
			
		}
		
	}//private void Levantamento
	private void LogOut()
	{
			btnLevantamentos.setEnabled(false);
			btnLogIn.setText("LogIn");
			txtNConta.setText(null);
			txtLevantamento.setText(null);
			lblInfo.setText("Bem vindo ao banco CET 22");
	}
} //fim de classe
