import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Map;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Point;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Component;

public class Testa_Segmento extends JFrame{
	
	
	private JFrame frame;
	private JTextField txtX,txtY,txtX2,txtY2;
	private JLabel lblX,lblX2,lblY,lblY2,lblDeclive;
	private JPanel panel;
	private Ponto2D p1;
	private Ponto2D p2;
	private JButton btnDesenhar;
	private Segmento seg;
	private JTextField txtSEG;
	private JButton btnDeslocaY;
	private JButton deslocaY;
	private JLabel lblComp;
	private JLabel lblComprimento;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Testa_Segmento window = new Testa_Segmento();
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
	public Testa_Segmento() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 563, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtX = new JTextField();
		txtX.setText("0");
		txtX.setBounds(360, 12, 58, 20);
		frame.getContentPane().add(txtX);
		txtX.setColumns(10);
		
		txtY = new JTextField();
		txtY.setText("0");
		txtY.setBounds(482, 12, 58, 20);
		frame.getContentPane().add(txtY);
		txtY.setColumns(10);
		
		lblX = new JLabel("x");
		lblX.setBounds(337, 14, 19, 17);
		frame.getContentPane().add(lblX);
		
		lblY = new JLabel("y");
		lblY.setBounds(459, 13, 13, 18);
		frame.getContentPane().add(lblY);
		
		txtX2 = new JTextField();
		txtX2.setText("0");
		txtX2.setColumns(10);
		txtX2.setBounds(360, 41, 58, 20);
		frame.getContentPane().add(txtX2);
		
		lblY2 = new JLabel("y");
		lblY2.setBounds(459, 42, 13, 18);
		frame.getContentPane().add(lblY2);
		
		txtY2 = new JTextField();
		txtY2.setText("0");
		txtY2.setColumns(10);
		txtY2.setBounds(482, 43, 58, 18);
		frame.getContentPane().add(txtY2);
		
		lblX2 = new JLabel("x");
		lblX2.setBounds(337, 43, 19, 17);
		frame.getContentPane().add(lblX2);
		
		panel = new JPanel();
		panel.setBounds(new Rectangle(209, 180, 0, 0));
		panel.setBounds(10, 12, 290, 180);
		frame.getContentPane().add(panel);
		
		lblDeclive = new JLabel("Declive");
		lblDeclive.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeclive.setBounds(10, 195, 290, 20);
		frame.getContentPane().add(lblDeclive);
		
		btnDesenhar = new JButton("Desenhar");
		btnDesenhar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				get();
				desenha();
				seg = new Segmento(p1,p2);
				mostra();
				CD();
			}
		});
		btnDesenhar.setBounds(335, 72, 205, 20);
		frame.getContentPane().add(btnDesenhar);
		
		
		
		deslocaY = new JButton("Desloca segmento para cima"); //Apenas funciona em consola 
		deslocaY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				seg.deslocaSeg(+Double.parseDouble(txtSEG.getText()),+Double.parseDouble(txtSEG.getText()));
				System.out.println(seg.daInicio());
				System.out.println(seg.daFim());
				System.out.println(seg.daDeclive());
				System.out.println(""+seg.compSegmento());
			}
		});
		deslocaY.setBounds(335, 118, 205, 23);
		frame.getContentPane().add(deslocaY);
		
		btnDeslocaY = new JButton("Desloca segmento para baixo"); //Apenas funciona em consola 
		btnDeslocaY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seg.deslocaSeg(-Double.parseDouble(txtSEG.getText()),-Double.parseDouble(txtSEG.getText()));
				System.out.println(seg.daInicio());
				System.out.println(seg.daFim());
				System.out.println(seg.daDeclive());
				System.out.println(""+seg.compSegmento());
			}
		});
		btnDeslocaY.setBounds(335, 169, 205, 23);
		frame.getContentPane().add(btnDeslocaY);
		
		txtSEG = new JTextField();
		txtSEG.setBounds(336, 144, 204, 20);
		frame.getContentPane().add(txtSEG);
		txtSEG.setColumns(10);
		
		lblComp = new JLabel("Comp");
		lblComp.setHorizontalAlignment(SwingConstants.CENTER);
		lblComp.setBounds(108, 226, 97, 24);
		frame.getContentPane().add(lblComp);
		
		lblComprimento = new JLabel("Comprimento:");
		lblComprimento.setHorizontalAlignment(SwingConstants.CENTER);
		lblComprimento.setBounds(10, 226, 97, 24);
		frame.getContentPane().add(lblComprimento);
	}
	public void mostra(){
		txtX.setText(""+p1.getX());
		txtY.setText(""+p1.getY());
		txtX2.setText(""+p2.getX());
		txtY2.setText(""+p2.getY());
	}
	public void desenha(){
		Graphics g = panel.getGraphics();
		g.drawLine((int)p1.getX()+145,-(int)p1.getY()+80,(int)p2.getX()+145,-(int)p2.getY()+80);
	}
	public void CD(){
		lblDeclive.setText(seg.daDeclive());
		lblComp.setText(""+seg.compSegmento());
	}
	public void get(){
		if(Double.parseDouble(txtX.getText())>144){
			txtX.setText(""+144);
		}
		if(Double.parseDouble(txtX.getText())<-144){
			txtX.setText(""+-144);
		}
		if(Double.parseDouble(txtX2.getText())>144){
			txtX2.setText(""+144);
		}
		if(Double.parseDouble(txtX2.getText())<-144){
			txtX2.setText(""+-144);
		}
		if(Double.parseDouble(txtY.getText())>89){
			txtY.setText(""+89);
		}
		if(Double.parseDouble(txtY.getText())<-89){
			txtY.setText(""+-89);
		}
		if(Double.parseDouble(txtY2.getText())>89){
			txtY2.setText(""+89);
		}
		if(Double.parseDouble(txtY2.getText())<-89){
			txtY2.setText(""+-89);
		}
		p1 = new Ponto2D(Double.parseDouble(txtX.getText()),Double.parseDouble(txtY.getText()));
		p2 = new Ponto2D(Double.parseDouble(txtX2.getText()),Double.parseDouble(txtY2.getText()));
		
	}
}