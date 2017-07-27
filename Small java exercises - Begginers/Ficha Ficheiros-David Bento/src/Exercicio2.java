
import java.awt.EventQueue;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio2 extends JFrame {

	public JPanel contentPane;
	public static JTextArea txtArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio2 frame = new Exercicio2();
					frame.setVisible(true);
					FicheiroData();
					
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
		setBounds(100, 100, 302, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtArea = new JTextArea();
		txtArea.setBounds(10, 62, 266, 261);
		contentPane.add(txtArea);
		
		JButton btnNewButton = new JButton("Mostrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Publicar();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(70, 11, 144, 40);
		contentPane.add(btnNewButton);
	}
	// Não percebi o enunciado.
	
	
	public static void FicheiroData() throws IOException {
		
		DataOutputStream escrever = new DataOutputStream (new FileOutputStream("publicx.data"));
		String [] nomes = {"Albert","Stein","Camoes"};
		int [] anos = {1200,1200,2015};
		
		for (int i=0; i<anos.length;i++){
			escrever.writeChars(nomes[i]+","+anos[i]+"\n");
				
			}
		escrever.close();
	}
	
	public static void Publicar() throws IOException {
		
		DataInputStream in = new DataInputStream (new FileInputStream("publicx.data"));
		String autores = in.readUTF();
		try {
			while (autores != null){
			txtArea.append(autores);
			autores=in.readUTF();
			}
			
		}
		catch (IOException e){
			
		}
		in.close();
	}
}
