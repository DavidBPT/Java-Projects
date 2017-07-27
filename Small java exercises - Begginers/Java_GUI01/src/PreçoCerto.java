import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PreçoCerto extends JFrame {

	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JButton btnSpin;
	private JLabel lblVencedor;
	
	double preco=50;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PreçoCerto frame = new PreçoCerto();
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
	public PreçoCerto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtA = new JTextField();
		txtA.setBounds(77, 44, 86, 20);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		JLabel lblJogadorA = new JLabel("Jogador A");
		lblJogadorA.setBounds(10, 46, 86, 17);
		contentPane.add(lblJogadorA);
		
		JLabel lblJogadorB = new JLabel("Jogador B");
		lblJogadorB.setBounds(10, 80, 86, 20);
		contentPane.add(lblJogadorB);
		
		JLabel lblJogadorC = new JLabel("Jogador C");
		lblJogadorC.setBounds(10, 116, 86, 20);
		contentPane.add(lblJogadorC);
		
		txtB = new JTextField();
		txtB.setBounds(77, 80, 86, 20);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		txtC = new JTextField();
		txtC.setBounds(77, 116, 86, 20);
		contentPane.add(txtC);
		txtC.setColumns(10);
		
		btnSpin = new JButton("Spin");
		btnSpin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				QuemGanha();
		}});
		btnSpin.setBounds(234, 145, 89, 23);
		contentPane.add(btnSpin);
		
		lblVencedor = new JLabel("VENCEDOR");
		lblVencedor.setBounds(50, 187, 318, 44);
		contentPane.add(lblVencedor);
	}
	private void QuemGanha(){

		double a = Double.parseDouble(txtA.getText());
		double b = Double.parseDouble(txtB.getText());
		double c = Double.parseDouble(txtC.getText());
		
		if(a>preco)
			a=0;
		if(b>preco)
			b=0;
		if(c>preco)
			c=0;
		if(a>=b && a>=c && a<=preco)
			lblVencedor.setText("VENCEDOR A");
		else
			if(b>=a && b>=c && b<=preco)
				lblVencedor.setText("VENCEDOR B");
			else
				if(c>=a && c>=b && c<=preco)
					lblVencedor.setText("VENCEDOR C");

	}
}
