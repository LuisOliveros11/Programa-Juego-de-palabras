import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JTextField;

public class Teclado {

	private JFrame frame;
	private JTextField textField;
	public ArrayList<JLabel> labels = new ArrayList<JLabel>(); 
	public String[] palabras = {"porcelana", "lombriz", "trompeta", "saludo amigo", "booleano", 
			                    "lentes", "mouse", "estadio", "caja", "bombon"};
	Random rand = new Random();
	JLabel lblNewLabel = new JLabel("0");
	Timer tiempo;
	int segundos = 0;
	float r, g, b;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teclado window = new Teclado();
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
	public Teclado() {
		initialize();
		tiempo = new Timer(1000, cronometro);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setForeground(Color.BLACK);
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel(palabras[rand.nextInt(9)]);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(lblNewLabel_1, BorderLayout.CENTER);
		
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(lblNewLabel, BorderLayout.EAST);
		
		textField = new JTextField();
		panel.add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		JLabel lblNewLabel_31 = new JLabel("Palabra a escribir: ");
		lblNewLabel_31.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblNewLabel_31, BorderLayout.WEST);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_2 = new JLabel("_______");
		lblNewLabel_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblNewLabel_2);
		labels.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("<--");
		lblNewLabel_3.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.add(lblNewLabel_3);
		labels.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(3, 9, 0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("Q");
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_4);
		labels.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("W");
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_5);
		labels.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("E");
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_6);
		labels.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("R");
		lblNewLabel_7.setOpaque(true);
		lblNewLabel_7.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_7);
		labels.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("T");
		lblNewLabel_8.setOpaque(true);
		lblNewLabel_8.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_8);
		labels.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Y");
		lblNewLabel_9.setOpaque(true);
		lblNewLabel_9.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_9);
		labels.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("U");
		lblNewLabel_10.setOpaque(true);
		lblNewLabel_10.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_10);
		labels.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("I");
		lblNewLabel_11.setOpaque(true);
		lblNewLabel_11.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_11);
		labels.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("O");
		lblNewLabel_12.setOpaque(true);
		lblNewLabel_12.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_12);
		labels.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("P");
		lblNewLabel_13.setOpaque(true);
		lblNewLabel_13.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_13);
		labels.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("A");
		lblNewLabel_14.setOpaque(true);
		lblNewLabel_14.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_14);
		labels.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("S");
		lblNewLabel_15.setOpaque(true);
		lblNewLabel_15.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_15);
		labels.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("D");
		lblNewLabel_16.setOpaque(true);
		lblNewLabel_16.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_16);
		labels.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("F");
		lblNewLabel_17.setOpaque(true);
		lblNewLabel_17.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_17);
		labels.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("G");
		lblNewLabel_18.setOpaque(true);
		lblNewLabel_18.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_18);
		labels.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("H");
		lblNewLabel_19.setOpaque(true);
		lblNewLabel_19.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_19);
		labels.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("J");
		lblNewLabel_20.setOpaque(true);
		lblNewLabel_20.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_20);
		labels.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("K");
		lblNewLabel_21.setOpaque(true);
		lblNewLabel_21.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_21);
		labels.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("L");
		lblNewLabel_22.setOpaque(true);
		lblNewLabel_22.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_22);
		labels.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("\u00D1");
		lblNewLabel_23.setOpaque(true);
		lblNewLabel_23.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_23);
		labels.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("Z");
		lblNewLabel_24.setOpaque(true);
		lblNewLabel_24.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_24);
		labels.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("X");
		lblNewLabel_25.setOpaque(true);
		lblNewLabel_25.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_25);
		labels.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("C");
		lblNewLabel_26.setOpaque(true);
		lblNewLabel_26.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_26);
		labels.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("V");
		lblNewLabel_27.setOpaque(true);
		lblNewLabel_27.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_27.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_27);
		labels.add(lblNewLabel_27);
		
		JLabel lblNewLabel_28 = new JLabel("B");
		lblNewLabel_28.setOpaque(true);
		lblNewLabel_28.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_28.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_28);
		labels.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("N");
		lblNewLabel_29.setOpaque(true);
		lblNewLabel_29.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_29);
		labels.add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("M");
		lblNewLabel_30.setOpaque(true);
		lblNewLabel_30.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_30.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_30);
		labels.add(lblNewLabel_30);
		
		textField.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
			@Override
			public void keyPressed(KeyEvent e) {
				tiempo.start();
				for (Iterator iterator = labels.iterator(); iterator.hasNext();) {
					JLabel jLabel = (JLabel) iterator.next();
					if(jLabel.getText().equals(String.valueOf(e.getKeyChar()).toUpperCase())) {
						r = rand.nextFloat();
						g = rand.nextFloat();
						b = rand.nextFloat();
						jLabel.setBackground(new Color(r, g, b));
					}else {
						jLabel.setBackground(Color.LIGHT_GRAY);
					}
				}
				if(e.getKeyCode() == 32) {
					r = rand.nextFloat();
					g = rand.nextFloat();
					b = rand.nextFloat();
					lblNewLabel_2.setBackground(new Color(r, g, b));
				}else if(e.getKeyCode() == 8) {
					r = rand.nextFloat();
					g = rand.nextFloat();
					b = rand.nextFloat();
					lblNewLabel_3.setBackground(new Color(r, g, b));
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
				if(textField.getText().equals(lblNewLabel_1.getText())) {
					tiempo.stop();
					JOptionPane.showMessageDialog(null, "Tiempo transcurrido: " + lblNewLabel.getText() + " segundos");
					segundos = 0;
					lblNewLabel.setText(segundos + "");
					lblNewLabel_1.setText(palabras[rand.nextInt(9)]);
					textField.setText("");
					tiempo.start();
				}
			}
		});
		textField.setFocusable(true);
		textField.requestFocus();
	}
	
	public void Actualizarcronometro() {
		String tiempo_txt = String.valueOf(segundos);
		lblNewLabel.setText(tiempo_txt);
	}
	
	private ActionListener cronometro = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			segundos++;
			Actualizarcronometro();
		}
	};
}
