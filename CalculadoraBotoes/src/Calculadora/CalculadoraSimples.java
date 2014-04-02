package Calculadora;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import java.awt.Toolkit;

public class CalculadoraSimples {

	private JFrame frame;
	private JTextField txtResult;
	private long a = 0;
	private long b = 0;
	private int op = 0;
	private long resultado = 0;
	private StringBuilder calc1 = new StringBuilder();
	private StringBuilder calc2 = new StringBuilder();
	private JButton btn1,btn2,btn3,btn4,btn5,btn6,
	btn7,btn8,btn9,btn0,btnResult,btnSoma,
	btnSubtrai,btnMult,btnDividir,btnC;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraSimples window = new CalculadoraSimples();
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
	public CalculadoraSimples() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void calcular() {
		if (a != 0) {
			b = Integer.parseInt(calc2.toString());

			switch (op) {
			case 1:
				resultado = a/b;
				txtResult.setText(String.valueOf(resultado));
				break;
			case 2:
				resultado = a*b;
				txtResult.setText(String.valueOf(resultado));
				break;
			case 3:
				resultado = a-b;
				txtResult.setText(String.valueOf(resultado));
				break;
			case 4:
				resultado = a+b;
				txtResult.setText(String.valueOf(resultado));
				break;

			default:
				break;
			}
		}
	}



	private void initialize() {
	
		frame = new JFrame("Calculadora Simples");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(CalculadoraSimples.class.getResource("/com/sun/java/swing/plaf/windows/icons/image-delayed.png")));
		frame.setResizable(false);
		frame.setBounds(100, 100, 250, 270);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btn1 = new JButton("7");
		btn1.setBounds(10, 79, 45, 25);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calc1.append("7");
				calc2.append("7");
				txtResult.setText(calc1.toString());
			}
		});

		btn2 = new JButton("8");
		btn2.setBounds(61, 79, 45, 25);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc1.append("8");
				calc2.append("8");
				txtResult.setText(calc1.toString());
			}
		});

		btn3 = new JButton("9");
		btn3.setBounds(112, 79, 45, 25);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc1.append("9");
				calc2.append("9");
				txtResult.setText(calc1.toString());
			}
		});

		btn4 = new JButton("4");
		btn4.setBounds(10, 115, 45, 25);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calc1.append("4");
				calc2.append("4");
				txtResult.setText(calc1.toString());
			}
		});

		btn5 = new JButton("5");
		btn5.setBounds(61, 115, 45, 25);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc1.append("5");
				calc2.append("5");
				txtResult.setText(calc1.toString());
			}
		});

		btn6 = new JButton("6");
		btn6.setBounds(112, 115, 45, 25);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc1.append("6");
				calc2.append("6");
				txtResult.setText(calc1.toString());
			}
		});

		btn7 = new JButton("1");
		btn7.setBounds(10, 151, 45, 25);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc1.append("1");
				calc2.append("1");
				txtResult.setText(calc1.toString());
			}
		});

		btn8 = new JButton("2");
		btn8.setBounds(61, 151, 45, 25);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc1.append("2");
				calc2.append("2");
				txtResult.setText(calc1.toString());
			}
		});

		btn9 = new JButton("3");
		btn9.setBounds(112, 151, 45, 25);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc1.append("3");
				calc2.append("3");
				txtResult.setText(calc1.toString());
			}
		});

		btn0 = new JButton("0");
		btn0.setBounds(61, 187, 45, 25);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc1.append("0");
				calc2.append("0");
				txtResult.setText(calc1.toString());
			}
		});

		txtResult = new JTextField();
		txtResult.setEditable(false);
		txtResult.setBackground(Color.white);
		txtResult.setBounds(10, 20, 216, 41);
		txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResult.setFont(new Font("Calibri", Font.PLAIN, 22));
		txtResult.setColumns(10);

		btnResult = new JButton("=");
		btnResult.setBounds(112, 187, 45, 25);
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
				cancelaBotoes();
				frame.getRootPane().setDefaultButton(btnC);  
			}


		});

		btnSoma = new JButton("+");
		btnSoma.setFont(new Font(null,Font.BOLD,14));
		btnSoma.setBounds(175, 188, 51, 23);
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (calc1.length() != 0) {
					a = Integer.parseInt(calc1.toString());
					calc1.append("+");
					calc2 = new StringBuilder();
					op = 4;
					btnSoma.setEnabled(false);
					btnSubtrai.setEnabled(false);
					btnMult.setEnabled(false);
					btnDividir.setEnabled(false);
				}
			}
		});

		btnSubtrai = new JButton("-");
		btnSubtrai.setFont(new Font(null,Font.BOLD,16));
		btnSubtrai.setBounds(175, 152, 51, 23);
		btnSubtrai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (calc1.length() != 0) {
					a = Integer.parseInt(calc1.toString());
					calc1.append("-");
					calc2 = new StringBuilder();
					op = 3;
					btnSoma.setEnabled(false);
					btnSubtrai.setEnabled(false);
					btnMult.setEnabled(false);
					btnDividir.setEnabled(false);
				}
			}
		});

		btnMult = new JButton("*");
		btnMult.setFont(new Font(null,Font.BOLD,17));
		btnMult.setBounds(175, 116, 51, 23);
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (calc1.length() != 0) {
					a = Integer.parseInt(calc1.toString());
					calc1.append("*");
					calc2 = new StringBuilder();
					op = 2;
					btnSoma.setEnabled(false);
					btnSubtrai.setEnabled(false);
					btnMult.setEnabled(false);
					btnDividir.setEnabled(false);
				}
			}
		});

		btnDividir = new JButton("/");
		btnDividir.setFont(new Font(null,Font.BOLD,15));
		btnDividir.setBounds(175, 80, 51, 23);
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (calc1.length() != 0) {
					a = Integer.parseInt(calc1.toString());
					calc1.append("/");
					calc2 = new StringBuilder();
					op = 1;
					btnSoma.setEnabled(false);
					btnSubtrai.setEnabled(false);
					btnMult.setEnabled(false);
					btnDividir.setEnabled(false);
				}
			}
		});

		btnC = new JButton("C");
		btnC.setForeground(Color.red);
		btnC.setBounds(10, 187, 45, 25);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtResult.setText(null);
				a = 0;
				b = 0;
				op = 0;
				resultado = 0;
				calc1 = new StringBuilder();
				ativaBotoes();
				frame.getRootPane().setDefaultButton(null);  

			}
		});


		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(txtResult);
		frame.getContentPane().add(btn7);
		frame.getContentPane().add(btnC);
		frame.getContentPane().add(btn0);
		frame.getContentPane().add(btnResult);
		frame.getContentPane().add(btnSoma);
		frame.getContentPane().add(btn8);
		frame.getContentPane().add(btn9);
		frame.getContentPane().add(btnSubtrai);
		frame.getContentPane().add(btn4);
		frame.getContentPane().add(btn5);
		frame.getContentPane().add(btn6);
		frame.getContentPane().add(btnMult);
		frame.getContentPane().add(btn1);
		frame.getContentPane().add(btn2);
		frame.getContentPane().add(btn3);
		frame.getContentPane().add(btnDividir);
	}
	private void cancelaBotoes() {
		btn1.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
		btn0.setEnabled(false);
		btnResult.setEnabled(false);
		btnSoma.setEnabled(false);
		btnSubtrai.setEnabled(false);
		btnMult.setEnabled(false);
		btnDividir.setEnabled(false);
	}
	private  void ativaBotoes() {
		btn1.setEnabled(true);
		btn2.setEnabled(true);
		btn3.setEnabled(true);
		btn4.setEnabled(true);
		btn5.setEnabled(true);
		btn6.setEnabled(true);
		btn7.setEnabled(true);
		btn8.setEnabled(true);
		btn9.setEnabled(true);
		btn0.setEnabled(true);
		btnResult.setEnabled(true);
		btnSoma.setEnabled(true);
		btnSubtrai.setEnabled(true);
		btnMult.setEnabled(true);
		btnDividir.setEnabled(true);

	}




}
