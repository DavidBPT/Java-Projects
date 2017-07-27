import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;

public class Exercicio8 {

	private JFrame frame;
	private JMenuBar menuBar;
	private JMenu MenuListar;
	private JMenu MenuPesquisar;
	private JCheckBoxMenuItem ckVendedor1;
	private JCheckBoxMenuItem ckProduto1;
	private JTextField txtPesquisar;
	private JButton btnMostrar;
	private JTextArea textArea;
	private JCheckBoxMenuItem ckProduto;
	private JCheckBoxMenuItem ckVendedor;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio8 window = new Exercicio8();
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
	public Exercicio8() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 663, 555);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 83, 627, 401);
		frame.getContentPane().add(textArea);
		
		txtPesquisar = new JTextField();
		txtPesquisar.setBounds(10, 11, 265, 32);
		frame.getContentPane().add(txtPesquisar);
		txtPesquisar.setColumns(10);
		
		btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Mostrar();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnMostrar.setBounds(300, 10, 99, 32);
		frame.getContentPane().add(btnMostrar);
		
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		MenuListar = new JMenu("Apresentar Vendas");
		menuBar.add("Vendedor", MenuListar);
		
		ckVendedor = new JCheckBoxMenuItem("Vendedor");
		ckVendedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ckVendedor.isSelected();
				ckVendedor1.setSelected(false);
				ckProduto.setSelected(false);
				ckProduto1.setSelected(false);
			}
		});
		MenuListar.add(ckVendedor);
		
		ckProduto = new JCheckBoxMenuItem("Produto");
		ckProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ckVendedor.setSelected(false);
				ckVendedor1.setSelected(false);
				ckProduto.isSelected();
				ckProduto1.setSelected(false);
			}
		});
		MenuListar.add(ckProduto);
		
		MenuPesquisar = new JMenu("Pesquisar");
		menuBar.add(MenuPesquisar);
		
		ckVendedor1 = new JCheckBoxMenuItem("Vendedor");
		ckVendedor1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ckVendedor.setSelected(false);
				ckVendedor1.isSelected();
				ckProduto1.setSelected(false);
				ckProduto.setSelected(false);
			}
		});
		MenuPesquisar.add(ckVendedor1);
		
		ckProduto1 = new JCheckBoxMenuItem("Produto");
		ckProduto1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ckVendedor.setSelected(false);
				ckVendedor1.setSelected(false);
				ckProduto1.isSelected();
				ckProduto.setSelected(false);
			}
		});
		MenuPesquisar.add(ckProduto1);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem);
		menuBar.add(mntmSair);
	}
	public void Mostrar() throws IOException{
		String linha,EMP;
		BufferedReader in;
			try {
				in = new BufferedReader(new FileReader("Vendedores.txt"));
				while((linha=in.readLine())!=null){
				int firstIndex=linha.indexOf(':');					// Primeiro  :
				int secondIndex=linha.indexOf(':',firstIndex+1);	// Segundo
				int thirdIndex=linha.indexOf(':',secondIndex+1);	// Terceiro  :
				int fourthIndex=linha.indexOf(':',thirdIndex+1);	// Quarto  :
				int fifthIndex=linha.indexOf(':',fourthIndex+1);	// Quinto  :
				
				if(ckVendedor.isSelected()){							//Vai buscar entre o segundo : e o terceiro :
					if(linha.contains(txtPesquisar.getText())){
						EMP=linha.substring(secondIndex,thirdIndex);
						if(EMP.contains((txtPesquisar.getText()))){
							textArea.append(linha+"\n");
						}
					}	
				}
				else if(ckProduto.isSelected()){						//Vai buscar entre o quarto : e o quinto :
					if(linha.contains(txtPesquisar.getText())){
						EMP=linha.substring(fourthIndex,fifthIndex+1);
						if(EMP.contains((txtPesquisar.getText()))){
							textArea.append(linha+"\n");
						}
				}
				}
				else if(ckVendedor1.isSelected()){						//Vai buscar entre o segundo : e o terceiro
					if(linha.contains(txtPesquisar.getText())){
						EMP=linha.substring(secondIndex,thirdIndex);
						if(EMP.contains((txtPesquisar.getText()))){
							textArea.append(EMP+"\n");
						}
					}
				}
				else if(ckProduto1.isSelected()){						//Vai buscar entre o quarto : e o quinto :
						if(linha.contains(txtPesquisar.getText())){
							EMP=linha.substring(fourthIndex,fifthIndex);
							if(EMP.contains((txtPesquisar.getText()))){
								textArea.append(EMP+"\n");
							}
						}	
					}			
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	} 
}