import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PlayTamagotchi {

	private JFrame frame;
	private JLabel lblVida,lblHig,lblEnergy,lblMonster,lblFome,Background,lblFun,lblZzz,lblwantfood,poop1,poop2,poop3,lblGames;
	private JProgressBar Vida,Fome,Energia,Hig,Diversao;
	private JButton btnAlimentar,btnLimpar,btnBrincar;
	Tamagotchi Bicho = new Tamagotchi();
	int segundos=0;
	
	
	
	ImageIcon back = new ImageIcon("back.png");
	ImageIcon imgVida = new ImageIcon("heart.png");
	ImageIcon imgFood = new ImageIcon("food.png");
	ImageIcon imgFun = new ImageIcon("fun.png");
	ImageIcon imgHig = new ImageIcon("hygiene.png");
	ImageIcon imgEne = new ImageIcon("energy.png");
	ImageIcon imgMonster = new ImageIcon("monster.png");
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayTamagotchi window = new PlayTamagotchi();
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
	public PlayTamagotchi() {
		initialize();
			Bicho.Energia(Bicho,Energia,Hig,Fome,btnAlimentar,btnBrincar,btnLimpar,Background,lblMonster,lblZzz); //Perder e ganhar Energia
			Bicho.FicarFome(Bicho,Fome,lblwantfood); //Ficar com fome
			Bicho.PerderFun(Bicho, Diversao); //
			Bicho.Sujar(Bicho, Hig);
			Bicho.Vida(Bicho, Vida,btnAlimentar, btnBrincar,btnLimpar,Background,lblMonster);
			Bicho.Alertas(Bicho, Fome, lblwantfood,poop1,poop2,poop3,lblGames); // Imagens a aparecer
			
			
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 690, 564);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Vida = new JProgressBar();
		Vida.setForeground(Color.RED);
		Vida.setBounds(33, 11, 146, 15);
		frame.getContentPane().add(Vida);
		Vida.setValue(Bicho.getVida());
		
		lblVida = new JLabel(""); 
		lblVida.setBounds(10, 11, 20, 15);
		frame.getContentPane().add(lblVida);
		lblVida.setIcon(imgVida);
		
		Fome = new JProgressBar();
		Fome.setBounds(33, 30, 146, 15);
		frame.getContentPane().add(Fome);
		Fome.setValue(Bicho.getFome());
		
		lblFome = new JLabel("");
		lblFome.setBounds(11, 30, 20, 15);
		frame.getContentPane().add(lblFome);
		lblFome.setIcon(imgFood);
		
		Energia = new JProgressBar();
		Energia.setForeground(Color.ORANGE);
		Energia.setBounds(33, 49, 146, 15);
		frame.getContentPane().add(Energia);
		Energia.setValue(Bicho.getEnergia());
		
		lblEnergy = new JLabel("");
		lblEnergy.setBounds(10, 50, 20, 15);
		frame.getContentPane().add(lblEnergy);
		lblEnergy.setIcon(imgEne);
		
		Diversao = new JProgressBar();
		Diversao.setBounds(33, 90, 146, 15);
		frame.getContentPane().add(Diversao);
		Diversao.setValue(Bicho.getDiversao());
		
		lblFun = new JLabel("");
		lblFun.setBounds(10, 90, 20, 15);
		frame.getContentPane().add(lblFun);
		lblFun.setIcon(imgFun);
		
		Hig = new JProgressBar();
		Hig.setForeground(Color.BLUE);
		Hig.setBounds(33, 70, 146, 14);
		frame.getContentPane().add(Hig);
		Hig.setValue(Bicho.getHigiene());
		
		lblwantfood = new JLabel("");
		lblwantfood.setBounds(438, 144, 136, 107);
		frame.getContentPane().add(lblwantfood);
		
		lblHig = new JLabel("");
		lblHig.setBounds(10, 69, 20, 15);
		frame.getContentPane().add(lblHig);
		lblHig.setIcon(imgHig);
		
		lblZzz = new JLabel("");
		lblZzz.setBounds(189, 49, 200, 185);
		frame.getContentPane().add(lblZzz);
		
		btnAlimentar = new JButton("Alimentar");
		btnAlimentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Bicho.Alimentar(Bicho,Fome,Energia,lblwantfood);
				
			}
		});
		btnAlimentar.setBounds(33, 390, 89, 35);
		frame.getContentPane().add(btnAlimentar);
		
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Bicho.Limpar(Bicho, Hig,Energia);
			}
		});
		btnLimpar.setBounds(33, 436, 89, 35);
		frame.getContentPane().add(btnLimpar);
		
		btnBrincar = new JButton("Brincar");
		btnBrincar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Bicho.Brincar(Bicho, Diversao,Energia);
			}
		});
		btnBrincar.setBounds(33, 482, 89, 35);
		frame.getContentPane().add(btnBrincar);
		
		poop1 = new JLabel("");
		poop1.setBounds(499, 463, 50, 54);
		frame.getContentPane().add(poop1);
		
		poop2 = new JLabel("");
		poop2.setBounds(489, 413, 50, 54);
		frame.getContentPane().add(poop2);
		
		poop3 = new JLabel("");
		poop3.setBounds(537, 433, 50, 54);
		frame.getContentPane().add(poop3);
		
		lblGames = new JLabel("");
		lblGames.setBounds(43, 155, 136, 107);
		frame.getContentPane().add(lblGames);
		
		lblMonster = new JLabel("");
		lblMonster.setBounds(184, 221, 300, 300);
		frame.getContentPane().add(lblMonster);
		lblMonster.setIcon(imgMonster);
		
		
		Background = new JLabel("");
		Background.setBounds(0, 0, 684, 541);
		frame.getContentPane().add(Background);
		Background.setIcon(back);
		
		
		
	}
}
