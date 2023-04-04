package ahorcado_juego.ahorcado;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaAhorcado extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaAhorcado frame = new vistaAhorcado();
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
	public vistaAhorcado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 742, 649);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("label para la palabra secreta");
		lblNewLabel_2.setBackground(Color.PINK);
		lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		lblNewLabel_2.setBounds(23, 179, 341, 126);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblNewLabel.setBounds(376, 10, 354, 558);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Teclado");
		lblNewLabel_1.setBounds(23, 317, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JButton btnStart = new JButton("START");
		btnStart.setBounds(52, 21, 251, 67);
		contentPane.add(btnStart);
		
		JButton btnResolver = new JButton("RESOLVER");
		btnResolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnResolver.setBounds(52, 100, 251, 67);
		contentPane.add(btnResolver);
		
		JButton btnNewButton = new JButton("A");
		btnNewButton.setBounds(17, 345, 46, 46);
		contentPane.add(btnNewButton);
		
		JButton btnB = new JButton("B");
		btnB.setBounds(63, 345, 46, 46);
		contentPane.add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(109, 345, 46, 46);
		contentPane.add(btnC);
		
		JButton btnD = new JButton("D");
		btnD.setBounds(156, 345, 46, 46);
		contentPane.add(btnD);
		
		JButton btnE = new JButton("E");
		btnE.setBounds(200, 345, 46, 46);
		contentPane.add(btnE);
		
		JButton btnF = new JButton("F");
		btnF.setBounds(246, 345, 46, 46);
		contentPane.add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.setBounds(292, 345, 46, 46);
		contentPane.add(btnG);
		
		JButton btnNewButton_1 = new JButton("H");
		btnNewButton_1.setBounds(17, 403, 46, 46);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("I");
		btnNewButton_2.setBounds(63, 403, 46, 46);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("J");
		btnNewButton_3.setBounds(109, 403, 46, 46);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("K");
		btnNewButton_4.setBounds(156, 403, 46, 46);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("L");
		btnNewButton_5.setBounds(200, 403, 46, 46);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("M");
		btnNewButton_6.setBounds(246, 403, 46, 46);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("N");
		btnNewButton_7.setBounds(292, 403, 46, 46);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Ñ");
		btnNewButton_8.setBounds(17, 461, 46, 46);
		contentPane.add(btnNewButton_8);
		
		JButton btnO = new JButton("O");
		btnO.setBounds(63, 461, 46, 46);
		contentPane.add(btnO);
		
		JButton btnP = new JButton("P");
		btnP.setBounds(109, 461, 46, 46);
		contentPane.add(btnP);
		
		JButton btnQ = new JButton("Q");
		btnQ.setBounds(156, 461, 46, 46);
		contentPane.add(btnQ);
		
		JButton btnR = new JButton("R");
		btnR.setBounds(200, 461, 46, 46);
		contentPane.add(btnR);
		
		JButton btnS = new JButton("S");
		btnS.setBounds(246, 461, 46, 46);
		contentPane.add(btnS);
		
		JButton btnT = new JButton("T");
		btnT.setBounds(292, 461, 46, 46);
		contentPane.add(btnT);
		
		JButton btnU = new JButton("U");
		btnU.setBounds(17, 519, 46, 46);
		contentPane.add(btnU);
		
		JButton btnV = new JButton("V");
		btnV.setBounds(63, 519, 46, 46);
		contentPane.add(btnV);
		
		JButton btnW = new JButton("W");
		btnW.setBounds(109, 519, 46, 46);
		contentPane.add(btnW);
		
		JButton btnX = new JButton("X");
		btnX.setBounds(156, 519, 46, 46);
		contentPane.add(btnX);
		
		JButton btnY = new JButton("Y");
		btnY.setBounds(200, 519, 46, 46);
		contentPane.add(btnY);
		
		JButton btnZ = new JButton("Z");
		btnZ.setBounds(246, 519, 46, 46);
		contentPane.add(btnZ);
		
		JButton btnNewButton_9 = new JButton("PISTA");
		btnNewButton_9.setBounds(119, 577, 117, 29);
		contentPane.add(btnNewButton_9);
	}
}
