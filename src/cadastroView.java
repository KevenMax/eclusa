

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class cadastroView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblRio;
	private JTextField textField_1;
	private JLabel lblCapacidadeMxima;
	private JLabel lblCapacidadeMnimam;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblVazoms;
	private JSeparator separator;
	private JTextField textField_4;
	private JLabel lblNewLabel;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JLabel lblLancha;
	private JTextField textField_11;
	private JTextField textField_12;
	private JLabel lblPetroleiro;
	private JTextField textField_13;
	private JTextField textField_14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cadastroView frame = new cadastroView();
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
	public cadastroView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGerenciamentoDeEclusa = new JLabel("Gerenciamento de Eclusa - Cadastros");
		lblGerenciamentoDeEclusa.setBounds(34, 27, 508, 29);
		lblGerenciamentoDeEclusa.setFont(new Font("Ubuntu Light", Font.PLAIN, 30));
		contentPane.add(lblGerenciamentoDeEclusa);
		
		JLabel txtMar = new JLabel("Mar:");
		txtMar.setBounds(45, 89, 70, 15);
		contentPane.add(txtMar);
		
		textField = new JTextField();
		textField.setBounds(84, 87, 125, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblRio = new JLabel("Rio:");
		lblRio.setBounds(286, 87, 70, 15);
		contentPane.add(lblRio);
		
		textField_1 = new JTextField();
		textField_1.setBounds(325, 87, 131, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblCapacidadeMxima = new JLabel("Capacidade Máxima(M³):");
		lblCapacidadeMxima.setBounds(45, 130, 179, 15);
		contentPane.add(lblCapacidadeMxima);
		
		lblCapacidadeMnimam = new JLabel("Capacidade Mínima(M³):");
		lblCapacidadeMnimam.setBounds(286, 130, 179, 15);
		contentPane.add(lblCapacidadeMnimam);
		
		textField_2 = new JTextField();
		textField_2.setBounds(45, 150, 170, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(286, 150, 170, 19);
		contentPane.add(textField_3);
		
		lblVazoms = new JLabel("Vazão(M³/s):");
		lblVazoms.setBounds(45, 180, 102, 15);
		contentPane.add(lblVazoms);
		
		separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(12, 119, 557, 15);
		contentPane.add(separator);
		
		textField_4 = new JTextField();
		textField_4.setBounds(45, 200, 170, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		lblNewLabel = new JLabel("Status:");
		lblNewLabel.setBounds(286, 180, 70, 15);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seca", "Cheio"}));
		comboBox.setSelectedIndex(1);
		comboBox.setBounds(286, 200, 170, 19);
		contentPane.add(comboBox);
		
		JLabel lblComprimento = new JLabel("Comprimento:");
		lblComprimento.setBounds(45, 230, 125, 15);
		contentPane.add(lblComprimento);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(45, 250, 170, 19);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(286, 250, 170, 19);
		contentPane.add(textField_6);
		
		JLabel lblLargura = new JLabel("Largura:");
		lblLargura.setBounds(286, 231, 70, 15);
		contentPane.add(lblLargura);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.GRAY);
		separator_1.setBounds(12, 289, 557, 15);
		contentPane.add(separator_1);
		
		JLabel lblPreos = new JLabel("Preços");
		lblPreos.setFont(new Font("Dialog", Font.BOLD, 15));
		lblPreos.setBounds(228, 300, 70, 15);
		contentPane.add(lblPreos);
		
		JLabel lblCargueiro = new JLabel("Cargueiro:");
		lblCargueiro.setBounds(108, 341, 94, 15);
		contentPane.add(lblCargueiro);
		
		textField_7 = new JTextField();
		textField_7.setBounds(95, 364, 114, 19);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblValorFixo = new JLabel("Valor Fixo:");
		lblValorFixo.setBounds(12, 364, 103, 15);
		contentPane.add(lblValorFixo);
		
		JLabel lblValorrea = new JLabel("Valor Área:");
		lblValorrea.setBounds(12, 399, 84, 15);
		contentPane.add(lblValorrea);
		
		textField_8 = new JTextField();
		textField_8.setBounds(95, 399, 114, 19);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(220, 397, 114, 19);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(220, 364, 114, 19);
		contentPane.add(textField_10);
		
		JLabel lblVeleiro = new JLabel("Veleiro:");
		lblVeleiro.setBounds(245, 341, 94, 15);
		contentPane.add(lblVeleiro);
		
		lblLancha = new JLabel("Lancha:");
		lblLancha.setBounds(361, 341, 94, 15);
		contentPane.add(lblLancha);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(345, 364, 114, 19);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(345, 397, 114, 19);
		contentPane.add(textField_12);
		
		lblPetroleiro = new JLabel("Petroleiro:");
		lblPetroleiro.setBounds(480, 341, 94, 15);
		contentPane.add(lblPetroleiro);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(471, 364, 114, 19);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(471, 397, 114, 19);
		contentPane.add(textField_14);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(468, 440, 117, 25);
		contentPane.add(btnSalvar);
		
	}
}
