import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JLabel;

public class TVGUI {

	private JFrame frame;
	private static JTextField txtCanal;
	public static JButton btnOnOff,btnCup,btnCdw,btnGo,btnUp,btnDown;
	public static JProgressBar progressBar;
	public static JLabel lblImg;
	
	static TV tv2=new TV();
	
	static ImageIcon rtp1 = new ImageIcon("RTP1.png");
	static ImageIcon rtp2 = new ImageIcon("RTP2.png");
	static ImageIcon sic = new ImageIcon("SIC.png");
	static ImageIcon tvi = new ImageIcon("TVI.png");
	static ImageIcon sta = new ImageIcon("STATIC.png");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TVGUI window = new TVGUI();
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
	public TVGUI() {
		initialize();
		if(!tv2.getEstado()){
			BTNDisable();
		}
		else{
			BTNEnable();
		}
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnOnOff = new JButton("ON");
		btnOnOff.setFont(new Font("Calibri Light", Font.BOLD, 15));
		btnOnOff.setBackground(SystemColor.scrollbar);
		btnOnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!tv2.getEstado()){
					Ligar();
					Cores();
					}
				else{
					Desligar();
				}
			}
		});
		btnOnOff.setBounds(162, 11, 89, 66);
		frame.getContentPane().add(btnOnOff);
		
		btnCup = new JButton("+");
		btnCup.setFont(new Font("Calibri Light", Font.BOLD, 15));
		btnCup.setBackground(SystemColor.scrollbar);
		btnCup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tv2.mudaCanal(tv2.getCanal()+1);
				txtCanal.setText(""+tv2.getCanal());
				Imagem();
			}
		});
		btnCup.setBounds(10, 46, 89, 44);
		frame.getContentPane().add(btnCup);
		
		btnCdw = new JButton("-");
		btnCdw.setFont(new Font("Calibri Light", Font.BOLD, 15));
		btnCdw.setBackground(SystemColor.scrollbar);
		btnCdw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tv2.getCanal()!=0){
					tv2.mudaCanal(tv2.getCanal()-1);
					txtCanal.setText(""+tv2.getCanal());
					Imagem();
				}
			}
		});
		btnCdw.setBounds(10, 101, 89, 44);
		frame.getContentPane().add(btnCdw);
		
		txtCanal = new JTextField();
		txtCanal.setBounds(10, 173, 89, 38);
		frame.getContentPane().add(txtCanal);
		txtCanal.setColumns(10);
		
		btnGo = new JButton("Go to");
		btnGo.setFont(new Font("Calibri Light", Font.BOLD, 15));
		btnGo.setBackground(SystemColor.scrollbar);
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num;
				num=Integer.parseInt(txtCanal.getText());
				if(num>=0){
					tv2.mudaCanal(num);
					txtCanal.setText(""+tv2.getCanal());
					Imagem();
				}
				else{
					txtCanal.setText("Erro");
				}
			}
		});
		btnGo.setBounds(10, 227, 89, 23);
		frame.getContentPane().add(btnGo);
		
		btnUp = new JButton("UP");
		btnUp.setFont(new Font("Calibri Light", Font.BOLD, 15));
		btnUp.setBackground(SystemColor.scrollbar);
		btnUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tv2.getVolume()!=20){
					btnUp.setEnabled(true);
					btnDown.setEnabled(true);
					tv2.aumentaVolume(1);
					progressBar.setValue(tv2.getVolume());
					}
				else{
					btnUp.setEnabled(false);
					btnDown.setEnabled(true);
				}
				Cores();
			}
		});
		btnUp.setBounds(311, 53, 95, 66);
		frame.getContentPane().add(btnUp);
		
		btnDown = new JButton("DOWN");
		btnDown.setFont(new Font("Calibri Light", Font.BOLD, 15));
		btnDown.setBackground(SystemColor.scrollbar);
		btnDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tv2.getVolume()==0){
					btnUp.setEnabled(true);
					btnDown.setEnabled(false);
				}
				else{
					btnDown.setEnabled(true);
					btnUp.setEnabled(true);
					tv2.diminuiVolume(1);
					progressBar.setValue(tv2.getVolume());
				}
				Cores();
			}
		});
		btnDown.setBounds(311, 173, 95, 66);
		frame.getContentPane().add(btnDown);
		
		progressBar = new JProgressBar();
		progressBar.setToolTipText("Volume");
		progressBar.setEnabled(false);
		progressBar.setMaximum(20);
		progressBar.setForeground(Color.LIGHT_GRAY);
		progressBar.setBounds(311, 130, 95, 32);
		frame.getContentPane().add(progressBar);
		
		lblImg = new JLabel("");
		lblImg.setBounds(126, 88, 159, 152);
		frame.getContentPane().add(lblImg);
	}
	public static void BTNEnable(){
		if(tv2.getVolume()==0){
			btnDown.setEnabled(false);
		}
		else{
			btnDown.setEnabled(true);
		}
		if(tv2.getVolume()==20){
			btnUp.setEnabled(false);
		}
		else{
			btnUp.setEnabled(true);
		}
		btnOnOff.setEnabled(true);
		btnCup.setEnabled(true);
		btnCdw.setEnabled(true);
		btnGo.setEnabled(true);
		btnOnOff.setEnabled(true);
		txtCanal.setEditable(true);
		progressBar.setForeground(Color.GREEN);
	}
	public static void BTNDisable(){
		btnOnOff.setEnabled(false);
		btnCup.setEnabled(false);
		btnCdw.setEnabled(false);
		btnGo.setEnabled(false);
		btnUp.setEnabled(false);
		btnDown.setEnabled(false);
		btnOnOff.setEnabled(true);
		txtCanal.setEditable(false);
		progressBar.setForeground(Color.GRAY);
	}
	public static void Cores(){
		
		if(tv2.getVolume()>=10)
			progressBar.setForeground(Color.GREEN);
		if(tv2.getVolume()>=13)
		progressBar.setForeground(Color.YELLOW);
		if(tv2.getVolume()>=15)
			progressBar.setForeground(Color.ORANGE);
		if(tv2.getVolume()>=17)
			progressBar.setForeground(Color.RED);
	}
	public static void Imagem(){
		
		switch(tv2.getCanal()){
		case 1:
			lblImg.setIcon(rtp1);
			break;
		case 2:
			lblImg.setIcon(rtp2);
			break;
		case 3:
			lblImg.setIcon(sic);
			break;
		case 4:
			lblImg.setIcon(tvi);
			break;
			default:lblImg.setIcon(sta);
		}
	}
	public static void Ligar(){
		lblImg.setVisible(true);
		tv2.ligaTV();
		tv2.getVolume();
		btnOnOff.setText("OFF");
		txtCanal.setText(""+tv2.getCanal());
		progressBar.setValue(tv2.getVolume());
		Cores();
		BTNEnable();
		Imagem();
	}
	public static void Desligar(){
		lblImg.setVisible(false);
		tv2.desligarTV();
		tv2.getVolume();
		btnOnOff.setText("ON");
		txtCanal.setText("");
		progressBar.setValue(0);
		Cores();
		BTNDisable();
		Imagem();
	}
}
