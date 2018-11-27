

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

public class controleView extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					controleView frame = new controleView();
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
	public controleView() {
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
