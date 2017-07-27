import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Exercicio1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNum;
	private JLabel lblShow;
	private JButton btnGerarNmero;
	Random Gerar = new Random();
	int gerado,num,cont=0;
	private JButton btnNewButton;
	

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
		
		txtNum = new JTextField();
		txtNum.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtNum.setBounds(10, 156, 311, 63);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		lblShow = new JLabel("");
		lblShow.setHorizontalAlignment(SwingConstants.CENTER);
		lblShow.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblShow.setBounds(10, 11, 414, 73);
		contentPane.add(lblShow);
		
		btnGerarNmero = new JButton("Gerar n\u00FAmero");
		btnGerarNmero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				gerado=Gerar.nextInt(100+1);
				cont=0;
				//lblShow.setText(""+gerado);
			}
		});
		btnGerarNmero.setBounds(142, 108, 141, 23);
		contentPane.add(btnGerarNmero);
		
		btnNewButton = new JButton("Validar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblShow.setText("");	
				cont++;
				num=Integer.parseInt(txtNum.getText());
				if(gerado>num){
					lblShow.setText("Demasiado baixo");
				}
				else if(gerado<num){
					lblShow.setText("Demasiado alto");
				}
				else{
					lblShow.setText("Yay, acertou na "+cont+"º tentativa");
				}
			}
		});
		btnNewButton.setBounds(331, 156, 93, 63);
		contentPane.add(btnNewButton);
	}
}
