package Calculadora2Campos;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Toolkit;

public class CalculadoraComboBox extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField text_Entrada1;
	private JTextField text_Entrada2;
	private JTextField text_Resultado;
	private JButton btnCalcular;
	private JLabel lblAviso;
	private	JComboBox<String> comboBox = new JComboBox<String>();



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraComboBox frame = new CalculadoraComboBox();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculadoraComboBox() {
		super("Calculadora com ComboBox");
		setIconImage(Toolkit.getDefaultToolkit().getImage(CalculadoraComboBox.class.getResource("/com/sun/java/swing/plaf/windows/icons/image-delayed.png")));
		setTitle("Calculadora ComboBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 399, 205);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Somar", "Subtrair", "Multiplicar", "Dividir"}));
		comboBox.setForeground(Color.gray);
		comboBox.setBounds(272, 35, 88, 20);
		contentPane.add(comboBox);
		comboBox.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent arg0) {
				@SuppressWarnings("unused")
				int keyPressed = KeyEvent.VK_ENTER;
				calcular();
				//int keyPressed1 = KeyEvent.VK_BACK_SPACE;
				//reset();
				



			}


			@Override
			public void keyReleased(KeyEvent arg0) {
				

			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				
			}





		});

		JLabel lblValorEntrada = new JLabel("Valor Entrada 1");
		lblValorEntrada.setBounds(12, 37, 104, 16);
		contentPane.add(lblValorEntrada);


		text_Entrada1 = new JTextField();
		text_Entrada1.setForeground(Color.black);
		text_Entrada1.setBounds(127, 35, 114, 20);
		contentPane.add(text_Entrada1);
		text_Entrada1.setColumns(10);
		text_Entrada1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text_Entrada2.requestFocus();
			}
		});

		JLabel lblValorEntrada_1 = new JLabel("Valor Entrada 2");
		lblValorEntrada_1.setBounds(12, 73, 104, 16);
		contentPane.add(lblValorEntrada_1);

		text_Entrada2 = new JTextField();
		text_Entrada2.setForeground(Color.black);
		text_Entrada2.setColumns(10);
		text_Entrada2.setBounds(127, 71, 114, 20);
		contentPane.add(text_Entrada2);
		text_Entrada2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				comboBox.requestFocus();
			}
		});



		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(12, 123, 104, 16);
		contentPane.add(lblResultado);

		text_Resultado = new JTextField();
		text_Resultado.setColumns(10);
		text_Resultado.setBounds(127, 121, 114, 20);
		text_Resultado.setEditable(false);
		//text_Resultado.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(text_Resultado);

		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnNewButton.setBounds(272, 121, 81, 21);
		contentPane.add(btnNewButton);

		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnCalcular.setFocusable(true);
				calcular();
			}

		});
		btnCalcular.setBounds(272, 71, 81, 20);
		contentPane.add(btnCalcular);

		JLabel lblOperaes = new JLabel("Opera\u00E7\u00F5es");
		lblOperaes.setHorizontalAlignment(SwingConstants.CENTER);
		lblOperaes.setBounds(272, 12, 88, 16);
		contentPane.add(lblOperaes);

		lblAviso = new JLabel();
		lblAviso.setForeground(Color.red);
		//lblAviso.setText("Só é permitido números inteiros!");
		lblAviso.setHorizontalAlignment(SwingConstants.CENTER);
		lblAviso.setBounds(51, 9, 190, 16);
		contentPane.add(lblAviso);



	}
	protected void reset() {
		text_Entrada1.requestFocus();
		text_Entrada1.setText(null);
		text_Entrada2.setText(null);
		text_Resultado.setText(null);
		lblAviso.setText(null);
		text_Entrada1.setForeground(Color.black);
		text_Entrada2.setForeground(Color.black);
		
	}

	private void calcular() {
		String a = text_Entrada1.getText();
		String b = text_Entrada2.getText();
		String option = (String) comboBox.getSelectedItem();


		try {
			switch (option) {
			case "Somar":
				long soma = Integer.parseInt(a) + Integer.parseInt(b);
				text_Resultado.setText(String.valueOf(soma));
				lblAviso.setText("");
				text_Entrada1.setForeground(Color.black);
				text_Entrada2.setForeground(Color.black);
				break;
			case "Subtrair":
				long sub = Integer.parseInt(a) - Integer.parseInt(b);
				text_Resultado.setText(String.valueOf(sub));
				lblAviso.setText("");
				text_Entrada1.setForeground(Color.black);
				text_Entrada2.setForeground(Color.black);
				break;
			case "Multiplicar":
				long mult = Integer.parseInt(a) * Integer.parseInt(b);
				text_Resultado.setText(String.valueOf(mult));
				lblAviso.setText("");
				text_Entrada1.setForeground(Color.black);
				text_Entrada2.setForeground(Color.black);
				break;
			case "Dividir":
				long div = Integer.parseInt(a) / Integer.parseInt(b);
				text_Resultado.setText(String.valueOf(div));
				lblAviso.setText("");
				text_Entrada1.setForeground(Color.black);
				text_Entrada2.setForeground(Color.black);
				break;

			}

		} catch (Exception e) {
			Alerta();
		}
	}


	private boolean Alerta() {
		try{  
			Integer.parseInt(text_Entrada1.getText());              
		}catch(NumberFormatException ex){              
			lblAviso.setText("Só é permitido números inteiros!");
			text_Entrada1.setForeground(Color.red);
		}   
		try{  
			Integer.parseInt(text_Entrada2.getText());              
		}catch(NumberFormatException ex){              
			lblAviso.setText("Só é permitido números inteiros!");
			text_Entrada2.setForeground(Color.red);
			text_Entrada2.setBackground(Color.white);

		}
		return true;   

	}

}
