import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Exercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtInf;
	private JTextField txtSup;
	private JTextArea txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio2 frame = new Exercicio2();
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
	public Exercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtInf = new JTextField();
		txtInf.setBounds(38, 48, 86, 20);
		contentPane.add(txtInf);
		txtInf.setColumns(10);
		
		txtSup = new JTextField();
		txtSup.setBounds(307, 48, 86, 20);
		contentPane.add(txtSup);
		txtSup.setColumns(10);
		
		JButton btnRaiz = new JButton("Raiz");
		btnRaiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int inf,sup;
				double resultado=0;
				inf=Integer.parseInt(txtInf.getText());
				sup=Integer.parseInt(txtSup.getText());
				resultado= Raiz(inf,sup,resultado);
				
				txtResultado.setText(txtResultado.getText()+resultado+"\n");
				
			}
		});
		btnRaiz.setBounds(152, 95, 115, 23);
		contentPane.add(btnRaiz);
		
		txtResultado = new JTextArea();
		txtResultado.setBounds(38, 132, 350, 119);
		contentPane.add(txtResultado);
	}
		private static double Raiz(int inf,int sup,double resultado){
			
			for(int i=inf;i<=sup;i++){
				String s= " "+ Math.sqrt(i);
			}
			return resultado;
			
			
		}
}
