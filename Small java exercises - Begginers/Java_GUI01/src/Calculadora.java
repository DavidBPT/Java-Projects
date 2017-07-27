import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JButton btn9;
	private JButton btn8;
	private JButton btn7;
	private JButton btn6;
	private JButton btn5;
	private JButton btn4;
	private JButton btn3;
	private JButton btn2;
	private JButton btn1;
	private JButton btn0;
	private JButton btnIgu;
	private JButton btnSoma;
	private JButton btnDiv;
	private JButton btnMult;
	private JButton btnMen;
	private JButton btnNeg;
	private JButton btnVirg;
	private JButton btnAp1;
	private JButton btnC;
	private JButton btnQuadrado;
	private JButton btnCasas;
	
	private String estado;
	double a=0,b=0,total;
	private JTextField lblTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setTitle("Tha calculator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 408, 441);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btn7 = new JButton("7");
		btn7.setFont(new Font("Calibri Light", Font.BOLD, 20));
		btn7.setForeground(SystemColor.textText);
		btn7.setBackground(SystemColor.scrollbar);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTexto.setText(lblTexto.getText()+"7");	
			}
		});
		btn7.setBounds(10, 110, 70, 48);
		contentPane.add(btn7);
		
		btn8 = new JButton("8");
		btn8.setForeground(SystemColor.textText);
		btn8.setFont(new Font("Calibri Light", Font.BOLD, 20));
		btn8.setBackground(SystemColor.scrollbar);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTexto.setText(lblTexto.getText()+"8");
			}
		});
		btn8.setBounds(85, 110, 70, 48);
		contentPane.add(btn8);
		
		btn9 = new JButton("9");
		btn9.setForeground(SystemColor.textText);
		btn9.setFont(new Font("Calibri Light", Font.BOLD, 20));
		btn9.setBackground(SystemColor.scrollbar);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTexto.setText(lblTexto.getText()+"9");
			}
		});
		btn9.setBounds(160, 110, 70, 48);
		contentPane.add(btn9);
		
		btn4 = new JButton("4");
		btn4.setForeground(SystemColor.textText);
		btn4.setFont(new Font("Calibri Light", Font.BOLD, 20));
		btn4.setBackground(SystemColor.scrollbar);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTexto.setText(lblTexto.getText()+"4");
			}
		});
		btn4.setBounds(10, 165, 70, 48);
		contentPane.add(btn4);
		
		btn5 = new JButton("5");
		btn5.setForeground(SystemColor.textText);
		btn5.setFont(new Font("Calibri Light", Font.BOLD, 20));
		btn5.setBackground(SystemColor.scrollbar);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTexto.setText(lblTexto.getText()+"5");
			}
		});
		btn5.setBounds(85, 165, 70, 48);
		contentPane.add(btn5);
		
		btn6 = new JButton("6");
		btn6.setForeground(SystemColor.textText);
		btn6.setFont(new Font("Calibri Light", Font.BOLD, 20));
		btn6.setBackground(SystemColor.scrollbar);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTexto.setText(lblTexto.getText()+"6");
			}
		});
		btn6.setBounds(160, 165, 70, 48);
		contentPane.add(btn6);
		
		btn1 = new JButton("1");
		btn1.setForeground(SystemColor.textText);
		btn1.setFont(new Font("Calibri Light", Font.BOLD, 20));
		btn1.setBackground(SystemColor.scrollbar);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTexto.setText(lblTexto.getText()+"1");
			}
		});
		btn1.setBounds(10, 220, 70, 48);
		contentPane.add(btn1);
		
		btn2 = new JButton("2");
		btn2.setForeground(SystemColor.textText);
		btn2.setFont(new Font("Calibri Light", Font.BOLD, 20));
		btn2.setBackground(SystemColor.scrollbar);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTexto.setText(lblTexto.getText()+"2");
			}
		});
		btn2.setBounds(85, 220, 70, 48);
		contentPane.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setForeground(SystemColor.textText);
		btn3.setFont(new Font("Calibri Light", Font.BOLD, 20));
		btn3.setBackground(SystemColor.scrollbar);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTexto.setText(lblTexto.getText()+"3");
			}
		});
		btn3.setBounds(160, 220, 70, 48);
		contentPane.add(btn3);
		
		btnIgu = new JButton("=");
		btnIgu.setForeground(SystemColor.textText);
		btnIgu.setFont(new Font("Calibri Light", Font.BOLD, 20));
		btnIgu.setBackground(SystemColor.scrollbar);
		btnIgu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Operacoes();
			}
		});
		btnIgu.setBounds(310, 275, 83, 48);
		contentPane.add(btnIgu);
		
		btnDiv = new JButton("/");
		btnDiv.setForeground(SystemColor.textText);
		btnDiv.setFont(new Font("Calibri Light", Font.BOLD, 20));
		btnDiv.setBackground(SystemColor.scrollbar);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				estado="/";
				a= Double.parseDouble(lblTexto.getText());
				total=total+a;
				lblTexto.setText("");
			}
		});
		btnDiv.setBounds(235, 110, 70, 48);
		contentPane.add(btnDiv);
		
		btnMult = new JButton("X");
		btnMult.setForeground(SystemColor.textText);
		btnMult.setFont(new Font("Calibri Light", Font.BOLD, 20));
		btnMult.setBackground(SystemColor.scrollbar);
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				estado="X";
				a= Double.parseDouble(lblTexto.getText());
				total=total+a;
				lblTexto.setText("");
			}
		});
		btnMult.setBounds(235, 165, 70, 48);
		contentPane.add(btnMult);
		
		btnMen = new JButton("-");
		btnMen.setForeground(SystemColor.textText);
		btnMen.setFont(new Font("Calibri Light", Font.BOLD, 20));
		btnMen.setBackground(SystemColor.scrollbar);
		btnMen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				estado="-";
				a= Double.parseDouble(lblTexto.getText());
				total=total+a;
				lblTexto.setText("");
			}
		});
		btnMen.setBounds(235, 220, 70, 48);
		contentPane.add(btnMen);
		
		btnSoma = new JButton("+");
		btnSoma.setForeground(SystemColor.textText);
		btnSoma.setFont(new Font("Calibri Light", Font.BOLD, 20));
		btnSoma.setBackground(SystemColor.scrollbar);
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				estado="+";
				a= Double.parseDouble(lblTexto.getText());
				total=total+a;
				lblTexto.setText("");
			}
		});
		btnSoma.setBounds(235, 275, 70, 48);
		contentPane.add(btnSoma);
		
		btnNeg = new JButton("\u00B1");
		btnNeg.setForeground(SystemColor.textText);
		btnNeg.setFont(new Font("Calibri Light", Font.BOLD, 20));
		btnNeg.setBackground(SystemColor.scrollbar);
		btnNeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double neg= Double.parseDouble(lblTexto.getText());
				String neg1 = Double.toString(neg*(-1));
				lblTexto.setText(neg1);
			}
		});
		btnNeg.setBounds(10, 275, 70, 48);
		contentPane.add(btnNeg);
		
		btn0 = new JButton("0");
		btn0.setForeground(SystemColor.textText);
		btn0.setFont(new Font("Calibri Light", Font.BOLD, 20));
		btn0.setBackground(SystemColor.scrollbar);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblTexto.setText(lblTexto.getText()+"0");
			}
		});
		btn0.setBounds(85, 275, 70, 48);
		contentPane.add(btn0);
		
		btnVirg = new JButton(",");
		btnVirg.setForeground(SystemColor.textText);
		btnVirg.setFont(new Font("Calibri Light", Font.BOLD, 20));
		btnVirg.setBackground(SystemColor.scrollbar);
		btnVirg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTexto.setText(lblTexto.getText()+".");
			}
		});
		btnVirg.setBounds(160, 275, 70, 48);
		contentPane.add(btnVirg);
		
		btnAp1 = new JButton("<--");
		btnAp1.setForeground(SystemColor.textText);
		btnAp1.setFont(new Font("Calibri Light", Font.BOLD, 20));
		btnAp1.setBackground(SystemColor.scrollbar);
		btnAp1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblTexto.setText(lblTexto.getText().substring(0, lblTexto.getText ().length() - 1));
			}
		});
		btnAp1.setBounds(310, 22, 83, 77);
		contentPane.add(btnAp1);
		
		btnC = new JButton("C"); //Limpa tudo
		btnC.setForeground(SystemColor.textText);
		btnC.setFont(new Font("Calibri Light", Font.BOLD, 20));
		btnC.setBackground(SystemColor.scrollbar);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total=0;
				lblTexto.setText("");
			}
		});
		btnC.setBounds(310, 165, 83, 48);
		contentPane.add(btnC);
		
		btnQuadrado = new JButton("x\u00B2");
		btnQuadrado.setForeground(SystemColor.textText);
		btnQuadrado.setFont(new Font("Calibri Light", Font.BOLD, 20));
		btnQuadrado.setBackground(SystemColor.scrollbar);
		btnQuadrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double quadrado= Double.parseDouble(lblTexto.getText());
				quadrado=Math.pow(quadrado,2);
				String quadrado1 =Double.toString(quadrado);
				lblTexto.setText(quadrado1);
			}
		});
		btnQuadrado.setBounds(310, 220, 83, 48);
		contentPane.add(btnQuadrado);
		
		btnCasas = new JButton("0,00");
		btnCasas.setForeground(SystemColor.textText);
		btnCasas.setFont(new Font("Calibri Light", Font.BOLD, 20));
		btnCasas.setBackground(SystemColor.scrollbar);
		btnCasas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double a= Double.parseDouble(lblTexto.getText());
				String text = Double.toString(Math.abs(a));
				int Inteiros = text.indexOf('.');
				int Decimais = text.length() - Inteiros - 1;
				Decimais--;
				BigDecimal bd= new BigDecimal(a).setScale(Decimais,RoundingMode.HALF_EVEN);
				lblTexto.setText(""+bd);
			}
		});
		btnCasas.setBounds(310, 110, 83, 48);
		contentPane.add(btnCasas);
		
		lblTexto = new JTextField();
		lblTexto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTexto.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblTexto.setForeground(Color.WHITE);
		lblTexto.setBackground(Color.BLACK);
		lblTexto.setEditable(false);
		lblTexto.setBounds(10, 22, 295, 77);
		contentPane.add(lblTexto);
		lblTexto.setColumns(10);
		
		JButton btnNewButton = new JButton("+0.00");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Double a= Double.parseDouble(lblTexto.getText());
				String text = Double.toString(Math.abs(a));
				int Inteiros = text.indexOf('.');
				int Decimais = text.length() - Inteiros - 1;
				Decimais--;
				BigDecimal bd= new BigDecimal(a).setScale(Decimais,RoundingMode.HALF_EVEN);
				lblTexto.setText(""+bd);
			}
		});
		btnNewButton.setBounds(10, 334, 70, 48);
		contentPane.add(btnNewButton);
	}
	private void Operacoes(){
		double b=0;
			 b= Double.parseDouble(lblTexto.getText());
		if (estado=="+"){
			if(total!=0){
				total= total+b;
			}
			else{
				total= a+b;
			}
				String resultado = Double.toString(total);
				lblTexto.setText(resultado);
				}
		else if(estado=="-"){
			if(total!=0){
				total= total-b;
			}
			else{
				total= a-b;
			}
			String resultado = Double.toString(total);	
			lblTexto.setText(resultado);
		}
		else if(estado=="/"){
			if(b!=0){
			if(total>0){
				total= total/b;
			}
			else{
				total= a/b;
			}
			String resultado = Double.toString(total);
			lblTexto.setText(resultado);}
			else{
				lblTexto.setText("Impossivel");	
			}
		}
		else if(estado=="X"){
			if(total>0){
				total= total*b;
			}
			else{
				total= a*b;
			}
			String resultado = Double.toString(total);
			lblTexto.setText(resultado);
		}
		total=0;
		}
	}