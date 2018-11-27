

import java.awt.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class ControleView extends JFrame {

	private JPanel contentPane;
	private JLabel lblEmbarcao;
	private JLabel lblCondutor;
	private JTextField txtCondutor;
	private JLabel lblPais;
	private JTextField txtPais;
	private JLabel lblSentido;
	private JComboBox txtSentido;
	private JLabel lblComprimento;
	private JTextField txtComprimento;
	private JLabel lblLargura;
	private JTextField txtLargura;
	private JLabel lblPesoMximo;
	private JTextField txtPesoMaximo;
	private JLabel lblPortoDeOrigem;
	private JTextField txtPortoOrigem;
	private JLabel lblPortoDeDestino;
	private JTextField txtPortoDestino;
	private JLabel lblComportas;
	private JSeparator separator;
	private JLabel lblQuantidadeDeContainerspessoas;
	private JTextField txtQntdContainersPessoas;
	private JLabel lblPesoTotal;
	private JTextField textField;
	private JButton btnSalvar;
	private JLabel lblRio;
	private JButton btnAbrir;
	private JButton btnFechar;
	private JLabel lblMar;
	private JButton btnAbrirComporta;
	private JButton btnFecharComporta;
	private JButton btnEncher;
	private JButton btnSecar;
	private JLabel lblInerir;
	private JButton btnMarPEclusa;
	private JButton btnRioPEclusa;
	private JButton btnRemoverEmbarcao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControleView frame = new ControleView();
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
	public ControleView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGerenciamentoEclusa = new JLabel("Gerenciamento de Eclusa - Controle");
		lblGerenciamentoEclusa.setFont(new Font("Ubuntu Light", Font.PLAIN, 30));
		lblGerenciamentoEclusa.setBounds(26, 22, 508, 29);
		contentPane.add(lblGerenciamentoEclusa);
		
		JComboBox txtEmbarcacao = new JComboBox();

		
		txtEmbarcacao.setModel(new DefaultComboBoxModel(new String[] {"Cargueiro", "Lancha", "Petroleiro", "Veleiro"}));
		txtEmbarcacao.setBounds(25, 100, 114, 19);
		contentPane.add(txtEmbarcacao);
		
		lblEmbarcao = new JLabel("Embarcação:");
		lblEmbarcao.setBounds(25, 80, 90, 15);
		contentPane.add(lblEmbarcao);
		
		lblCondutor = new JLabel("Condutor:");
		lblCondutor.setBounds(160, 80, 90, 15);
		contentPane.add(lblCondutor);
		
		txtCondutor = new JTextField();
		txtCondutor.setBounds(160, 100, 114, 19);
		contentPane.add(txtCondutor);
		txtCondutor.setColumns(10);
		
		lblPais = new JLabel("País:");
		lblPais.setBounds(290, 80, 70, 15);
		contentPane.add(lblPais);
		
		txtPais = new JTextField();
		txtPais.setBounds(290, 100, 127, 19);
		contentPane.add(txtPais);
		txtPais.setColumns(10);
		
		lblSentido = new JLabel("Sentido:");
		lblSentido.setBounds(430, 80, 70, 15);
		contentPane.add(lblSentido);
		
		txtSentido = new JComboBox();
		txtSentido.setModel(new DefaultComboBoxModel(new String[] {"RIO->MAR", "MAR->RIO"}));
		txtSentido.setBounds(430, 100, 127, 19);
		contentPane.add(txtSentido);
		
		lblComprimento = new JLabel("Comprimento:");
		lblComprimento.setBounds(26, 131, 114, 15);
		contentPane.add(lblComprimento);
		
		txtComprimento = new JTextField();
		txtComprimento.setBounds(26, 150, 114, 19);
		contentPane.add(txtComprimento);
		txtComprimento.setColumns(10);
		
		lblLargura = new JLabel("Largura:");
		lblLargura.setBounds(160, 131, 70, 15);
		contentPane.add(lblLargura);
		
		txtLargura = new JTextField();
		txtLargura.setColumns(10);
		txtLargura.setBounds(160, 150, 114, 19);
		contentPane.add(txtLargura);
		
		lblPesoMximo = new JLabel("Peso Máximo:");
		lblPesoMximo.setBounds(290, 131, 97, 15);
		contentPane.add(lblPesoMximo);
		
		txtPesoMaximo = new JTextField();
		txtPesoMaximo.setBounds(290, 150, 267, 19);
		contentPane.add(txtPesoMaximo);
		txtPesoMaximo.setColumns(10);
		
		lblPortoDeOrigem = new JLabel("Porto de Origem:");
		lblPortoDeOrigem.setBounds(26, 181, 127, 15);
		contentPane.add(lblPortoDeOrigem);
		
		txtPortoOrigem = new JTextField();
		txtPortoOrigem.setColumns(10);
		txtPortoOrigem.setBounds(26, 200, 248, 19);
		contentPane.add(txtPortoOrigem);
		
		lblPortoDeDestino = new JLabel("Porto de Destino:");
		lblPortoDeDestino.setBounds(290, 181, 127, 15);
		contentPane.add(lblPortoDeDestino);
		
		txtPortoDestino = new JTextField();
		txtPortoDestino.setColumns(10);
		txtPortoDestino.setBounds(288, 200, 269, 19);
		contentPane.add(txtPortoDestino);
		
		lblComportas = new JLabel("Eclusa");
		lblComportas.setFont(new Font("Dialog", Font.BOLD, 15));
		lblComportas.setBounds(253, 317, 134, 15);
		contentPane.add(lblComportas);
		
		separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(26, 304, 557, 15);
		contentPane.add(separator);
		
		lblQuantidadeDeContainerspessoas = new JLabel("Quantidade de Containers/Pessoas:");
		lblQuantidadeDeContainerspessoas.setBounds(26, 225, 267, 15);
		contentPane.add(lblQuantidadeDeContainerspessoas);
		
		txtQntdContainersPessoas = new JTextField();
		txtQntdContainersPessoas.setColumns(10);
		txtQntdContainersPessoas.setBounds(26, 242, 248, 19);
		contentPane.add(txtQntdContainersPessoas);
		
		lblPesoTotal = new JLabel("Peso Total(KG):");
		lblPesoTotal.setBounds(290, 225, 114, 15);
		contentPane.add(lblPesoTotal);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(290, 242, 267, 19);
		contentPane.add(textField);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(440, 273, 117, 25);
		contentPane.add(btnSalvar);
		
		lblRio = new JLabel("RIO:");
		lblRio.setFont(new Font("Dialog", Font.BOLD, 13));
		lblRio.setBounds(80, 317, 70, 15);
		contentPane.add(lblRio);
		
		btnAbrir = new JButton("Abrir Comporta");
		btnAbrir.setFont(new Font("Ubuntu", Font.BOLD, 15));
		btnAbrir.setForeground(new Color(255, 255, 255));
		btnAbrir.setBackground(new Color(72, 61, 139));
		btnAbrir.setBounds(26, 335, 160, 20);
		contentPane.add(btnAbrir);
		
		btnFechar = new JButton("Fechar Comporta");
		btnFechar.setFont(new Font("Ubuntu", Font.BOLD, 15));
		btnFechar.setBackground(new Color(72, 61, 139));
		btnFechar.setForeground(new Color(255, 255, 255));
		btnFechar.setBounds(26, 362, 160, 20);
		contentPane.add(btnFechar);
		
		lblMar = new JLabel("MAR:");
		lblMar.setBounds(80, 400, 70, 15);
		contentPane.add(lblMar);
		
		btnAbrirComporta = new JButton("Abrir Comporta");
		btnAbrirComporta.setForeground(Color.WHITE);
		btnAbrirComporta.setFont(new Font("Ubuntu", Font.BOLD, 15));
		btnAbrirComporta.setBackground(new Color(72, 61, 139));
		btnAbrirComporta.setBounds(26, 420, 161, 20);
		contentPane.add(btnAbrirComporta);
		
		btnFecharComporta = new JButton("Fechar Comporta");
		btnFecharComporta.setForeground(Color.WHITE);
		btnFecharComporta.setFont(new Font("Ubuntu", Font.BOLD, 15));
		btnFecharComporta.setBackground(new Color(72, 61, 139));
		btnFecharComporta.setBounds(26, 444, 161, 20);
		contentPane.add(btnFecharComporta);
		
		btnEncher = new JButton("Encher ");
		btnEncher.setBounds(225, 340, 117, 25);
		contentPane.add(btnEncher);
		
		btnSecar = new JButton("Secar");
		btnSecar.setBounds(225, 425, 117, 25);
		contentPane.add(btnSecar);
		
		lblInerir = new JLabel("Inserir:");
		lblInerir.setBounds(430, 317, 70, 15);
		contentPane.add(lblInerir);
		
		btnMarPEclusa = new JButton("Mar p/ Eclusa");
		btnMarPEclusa.setBounds(404, 340, 130, 25);
		contentPane.add(btnMarPEclusa);
		
		btnRioPEclusa = new JButton("Rio p/ Eclusa");
		btnRioPEclusa.setBounds(404, 372, 130, 25);
		contentPane.add(btnRioPEclusa);
		
		btnRemoverEmbarcao = new JButton("Remover");
		btnRemoverEmbarcao.setForeground(new Color(255, 255, 255));
		btnRemoverEmbarcao.setBackground(new Color(220, 20, 60));
		btnRemoverEmbarcao.setBounds(404, 427, 130, 25);
		contentPane.add(btnRemoverEmbarcao);
		
		txtEmbarcacao.addItemListener(new java.awt.event.ItemListener() {
		public void itemStateChanged(java.awt.event.ItemEvent evt) {
			if(txtEmbarcacao.getSelectedItem().toString().equals("Lancha") || txtEmbarcacao.getSelectedItem().toString().equals("Veleiro")) {
				txtPortoOrigem.setEnabled(false);	
				txtPortoDestino.setEnabled(false);
			}else {
				txtPortoOrigem.setEnabled(true);	
				txtPortoDestino.setEnabled(true);
			}
        }
	});
		
	}
}
