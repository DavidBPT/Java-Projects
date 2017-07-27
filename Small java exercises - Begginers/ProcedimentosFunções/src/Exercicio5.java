import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Exercicio5 extends JFrame {

	private JPanel contentPane;
	private static JTextField txtNomes;
	private JTextArea textArea;
	
	String Nomes;
	static int contA=0;
	static int contB=0;
	static int contC=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio5 frame = new Exercicio5();
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
	public Exercicio5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNomes = new JTextField();
		txtNomes.setBounds(157, 49, 86, 20);
		contentPane.add(txtNomes);
		txtNomes.setColumns(10);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Nomes=txtNomes.getText();
				char c = (Nomes).charAt(0);
				Verificar(c);
				txtNomes.setText("");
				
			}
		});
		btnAdicionar.setBounds(75, 91, 89, 23);
		contentPane.add(btnAdicionar);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(contA+" A "+contB+" B "+contC +" C");
			}
		});
		btnMostrar.setBounds(247, 91, 89, 23);
		contentPane.add(btnMostrar);
		
		textArea = new JTextArea();
		textArea.setBounds(75, 142, 260, 109);
		contentPane.add(textArea);
	}
	
	public static void Verificar(char c){
		c=Character.toUpperCase(c);
		if (c == 'A'){
			contA++;
		}
		else if(c == 'B'){
			contB++;
		}
		else if(c == 'C'){
			contC++;
		}
	}
}
