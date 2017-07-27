import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
//import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Exercicio1 {

	private JFrame frame;
	public static JTextArea txtD;
	private final Action action_1 = new SwingAction();
	private JTextField txtSigla;
	private JTextField txtNome;
	private JTextField txtData;
	private JTextField txtEmail;
	private JTextField txtProcura;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JButton btnNovoProfessor;
	private JButton btn_Pesquisar;
	private JButton btnNewButton;
	private JMenu mnNovo;
	private JLayeredPane Dados;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					Exercicio1 window = new Exercicio1();
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
	public Exercicio1() {
		initialize();
		Começo();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 620, 327);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		// NÃO IMPLEMENTADO. Não tinha a certeza se era para incluir um botão pesquisar.---------
		btn_Pesquisar = new JButton("Pesquisar");
		btn_Pesquisar.setEnabled(false);
		btn_Pesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					//Pesquisar();
			}
		});
		//---------------------------------------------------------------------------------------
		btn_Pesquisar.setBounds(449, 86, 143, 41);
		frame.getContentPane().add(btn_Pesquisar);
		
		btnNovoProfessor = new JButton("Guardar Dados");
		btnNovoProfessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					GuardarDados();
				}
		});
		btnNovoProfessor.setAction(action_1);
		btnNovoProfessor.setBounds(449, 291, 143, 41);
		frame.getContentPane().add(btnNovoProfessor);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 422, 253);
		frame.getContentPane().add(tabbedPane);
		
		Dados = new JLayeredPane();
		Dados.setToolTipText("Mostra os dados");
		tabbedPane.addTab("Dados", null, Dados, null);
		
		JTextArea txtD = new JTextArea();
		txtD.setEditable(false);
		txtD.setBounds(10, 11, 397, 203);
		Dados.add(txtD);
		
		btnNewButton = new JButton("Mostrar Dados");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FileReader reader;
				try {
					reader = new FileReader("fichas_profs.txt");
					try {
						txtD.read(reader,"fichas_profs.txt");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(449, 34, 143, 41);
		frame.getContentPane().add(btnNewButton);
		
		label = new JLabel("Sigla");
		label.setBounds(10, 283, 42, 28);
		frame.getContentPane().add(label);
		
		label_1 = new JLabel("Nome");
		label_1.setBounds(10, 325, 42, 28);
		frame.getContentPane().add(label_1);
		
		label_2 = new JLabel("Data de Contrata\u00E7\u00E3o");
		label_2.setBounds(191, 283, 119, 28);
		frame.getContentPane().add(label_2);
		
		label_3 = new JLabel("Email");
		label_3.setBounds(191, 325, 111, 28);
		frame.getContentPane().add(label_3);
		
		txtSigla = new JTextField();
		txtSigla.setBounds(49, 291, 132, 24);
		frame.getContentPane().add(txtSigla);
		txtSigla.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(49, 322, 132, 24);
		frame.getContentPane().add(txtNome);
		
		txtData = new JTextField();
		txtData.setColumns(10);
		txtData.setBounds(321, 283, 111, 28);
		frame.getContentPane().add(txtData);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(232, 322, 200, 24);
		frame.getContentPane().add(txtEmail);
		
		txtProcura = new JTextField();
		txtProcura.setEditable(false);
		txtProcura.setEnabled(false);
		txtProcura.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtProcura.setText(null);
			}
		});
		txtProcura.setText("Insira o Nome");
		txtProcura.setColumns(10);
		txtProcura.setBounds(449, 138, 143, 24);
		frame.getContentPane().add(txtProcura);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		mnNovo = new JMenu("Novo Professor");
		mnNovo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				novo();
			}
		});
		menuBar.add(mnNovo);
	}
	private class SwingAction extends AbstractAction {
		private static final long serialVersionUID = 1L;
		public SwingAction() {
			putValue(NAME, "Guardar dados");
			putValue(SHORT_DESCRIPTION, "Adicionar dados para um novo professor");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	public void GuardarDados(){
		try{
			PrintWriter escrever = new PrintWriter (new FileWriter("fichas_profs.txt",true));
			
			if(!txtSigla.getText().isEmpty()){
				escrever.write((txtSigla.getText()+";"));
			}
			if(!txtNome.getText().isEmpty()){
				escrever.write(txtNome.getText()+";");
			}
			if(!txtData.getText().isEmpty()){
				escrever.write(txtData.getText()+";");
			}
			if(!txtEmail.getText().isEmpty()){
				escrever.write(txtEmail.getText()+";\n");
			}
			escrever.close();
			novo();
			
			}
			catch (IOException e1){
				Começo();
				txtD.setText(txtD.getText()+"Erro.");
			}
	}
	
	/*NÃO IMPLEMENTADO. Não tinha a certeza se era para incluir um botão pesquisar----
	public void Pesquisar(){
		
		String Linha;
		BufferedReader in;
			try {
				in = new BufferedReader(new FileReader ("fichas_profs.txt"));
					while((Linha=in.readLine()) != null){
						if(Linha.contains(txtProcura.getText())){
							System.out.println(Linha);
							txtD.setText(Linha);
						}
						
					 }
					in.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} ------------------------------------------------------------------------------*/ 
	public void novo(){
		frame.setBounds(100, 100, 622, 416);
		
	}
	public void Começo(){
		frame.setBounds(100, 100, 620, 327);
		txtEmail.setText(null);
		txtNome.setText(null);
		txtSigla.setText(null);
		txtData.setText(null);
	}
}