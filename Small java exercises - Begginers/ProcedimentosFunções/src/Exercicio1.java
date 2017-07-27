import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio1 extends JFrame {

	private JPanel contentPane;
	private static JTextField txtN1;
	private static JTextField txtN2;
	private JButton btnSomar;
	private static JTextField lblResultado;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio1 frame = new Exercicio1();
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
	public Exercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtN1 = new JTextField();
		txtN1.setBounds(63, 52, 122, 20);
		contentPane.add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setBounds(233, 52, 122, 20);
		contentPane.add(txtN2);
		txtN2.setColumns(10);
		
		btnSomar = new JButton("Raiz");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int inf,sup;
				inf=Integer.parseInt(txtN1.getText());
				sup=Integer.parseInt(txtN2.getText());
				Raiz(inf,sup);
			}
		});
		btnSomar.setBounds(163, 107, 89, 23);
		contentPane.add(btnSomar);
		
		lblResultado = new JTextField();
		lblResultado.setEditable(false);
		lblResultado.setBounds(63, 154, 292, 80);
		contentPane.add(lblResultado);
		lblResultado.setColumns(10);
	}
	public static void Raiz(int inf,int sup){
		
		
		for(int i=inf;i<=sup;i++){
			lblResultado.setText(lblResultado.getText()+" A raiz de "+i+" é "+Math.sqrt(i));
		}
		
			
		
	}
}
