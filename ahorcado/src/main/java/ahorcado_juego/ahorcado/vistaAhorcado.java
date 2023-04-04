package ahorcado_juego.ahorcado;

import java.awt.EventQueue;

import javax.swing.*; 
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import java.awt.Dimension;

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
		
		JLabel lblNegro = new JLabel("label para la palabra secreta");
		lblNegro.setBackground(Color.PINK);
		lblNegro.setBorder(new LineBorder(new Color(0, 0, 0), 3424));
		lblNegro.setBounds(52, 245, 256, 29);
		contentPane.add(lblNegro);
		
		JLabel lblAhorcado = new JLabel("");
		lblAhorcado.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		lblAhorcado.setBounds(376, 10, 354, 558);
		contentPane.add(lblAhorcado);
		
		JLabel lblTituloTeclado = new JLabel("Teclado");
		lblTituloTeclado.setBounds(23, 317, 61, 16);
		contentPane.add(lblTituloTeclado);
		
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
		
		
		/*BOTONES LETRAS*/
		JButton btnA = new JButton("A");
		btnA.setBounds(17, 345, 46, 46);
		contentPane.add(btnA);
		
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
		
		JButton btnH = new JButton("H");
		btnH.setBounds(17, 403, 46, 46);
		contentPane.add(btnH);
		
		JButton btnI = new JButton("I");
		btnI.setBounds(63, 403, 46, 46);
		contentPane.add(btnI);
		
		JButton btnJ = new JButton("J");
		btnJ.setBounds(109, 403, 46, 46);
		contentPane.add(btnJ);
		
		JButton btnK = new JButton("K");
		btnK.setBounds(156, 403, 46, 46);
		contentPane.add(btnK);
		
		JButton btnL = new JButton("L");
		btnL.setBounds(200, 403, 46, 46);
		contentPane.add(btnL);
		
		JButton btnM = new JButton("M");
		btnM.setBounds(246, 403, 46, 46);
		contentPane.add(btnM);
		
		JButton btnN = new JButton("N");
		btnN.setBounds(292, 403, 46, 46);
		contentPane.add(btnN);
		
		JButton btnÑ = new JButton("Ñ");
		btnÑ.setBounds(17, 461, 46, 46);
		contentPane.add(btnÑ);
		
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
		
		//BOTON PARA ACTIVAR LA PISTA
		JButton btnPista = new JButton("PISTA");
		btnPista.setBounds(119, 577, 117, 29);
		contentPane.add(btnPista);
		
		
		//Titulo de la palabra secreta. 
		JLabel lblTituloPalaabraS = new JLabel("Palabra secreta");
		lblTituloPalaabraS.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloPalaabraS.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		lblTituloPalaabraS.setVerticalAlignment(SwingConstants.TOP);
		lblTituloPalaabraS.setBounds(42, 221, 274, 67);
		contentPane.add(lblTituloPalaabraS);
		
		
		
		/*BOTONES DE LAS VIDAS O PISTAS*/
		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.setIcon(new ImageIcon("./../ahorcado/img/concepto.png"));
		btnNewButton_10.setBounds(42, 179, 32, 43);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_10_1 = new JButton("");
		btnNewButton_10_1.setIcon(new ImageIcon("./../ahorcado/img/concepto.png"));
		btnNewButton_10_1.setBounds(77, 179, 32, 43);
		contentPane.add(btnNewButton_10_1);
		
		JButton btnNewButton_10_2 = new JButton("");
		btnNewButton_10_2.setIcon(new ImageIcon("./../ahorcado/img/concepto.png"));
		btnNewButton_10_2.setBounds(109, 179, 32, 43);
		contentPane.add(btnNewButton_10_2);
		
		JButton btnNewButton_10_3 = new JButton("");
		btnNewButton_10_3.setIcon(new ImageIcon("./../ahorcado/img/concepto.png"));
		btnNewButton_10_3.setBounds(142, 179, 32, 43);
		contentPane.add(btnNewButton_10_3);
		
		JButton btnNewButton_10_4 = new JButton("");
		btnNewButton_10_4.setIcon(new ImageIcon("./../ahorcado/img/concepto.png"));
		btnNewButton_10_4.setBounds(174, 179, 32, 43);
		contentPane.add(btnNewButton_10_4);
	}
}
