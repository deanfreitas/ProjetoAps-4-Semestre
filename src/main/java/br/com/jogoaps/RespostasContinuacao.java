package br.com.jogoaps;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RespostasContinuacao extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3447064178368191755L;
	JButton B1, B2, B3;
	JPanel P1;
	JLabel L1, L21, L22, L23, L24, L25, L26, L27, L28, L29, L30, L31, L32, L33,
			L34, L35, L36, L37, L38, L39, L40;

	public RespostasContinuacao() {
		setTitle("RESPOSTA DAS PERGUNTAS PARTE 2");
		setSize(900, 600);
		setResizable(false);
		setLocation(50, 50);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("resp.jpg"));
		L1 = new JLabel(icon);
		L1.setLocation(0, 0);
		L1.setSize(900, 600);

		L21 = new JLabel("21 - ( D )  Papel");
		L21.setLocation(10, 0);
		L21.setSize(200, 200);
		L21.setFont(new Font("LCD", Font.BOLD, 14));
		L21.setForeground(Color.red);

		L22 = new JLabel("22 - ( B )  Vidro ");
		L22.setLocation(10, 20);
		L22.setSize(200, 200);
		L22.setFont(new Font("LCD", Font.BOLD, 14));
		L22.setForeground(Color.blue);

		L23 = new JLabel("23 - ( A )  Metal");
		L23.setLocation(10, 40);
		L23.setSize(500, 200);
		L23.setFont(new Font("LCD", Font.BOLD, 14));
		L23.setForeground(Color.yellow);

		L24 = new JLabel("24 - ( D )  400 anos");
		L24.setLocation(10, 60);
		L24.setSize(200, 200);
		L24.setFont(new Font("LCD", Font.BOLD, 14));
		L24.setForeground(Color.green);

		L25 = new JLabel("25 - ( B )  Politica Nacional de Educação Ambiental");
		L25.setLocation(10, 80);
		L25.setSize(400, 200);
		L25.setFont(new Font("LCD", Font.BOLD, 14));
		L25.setForeground(Color.red);

		L26 = new JLabel("26 - ( D )  Reciclagem");
		L26.setLocation(10, 100);
		L26.setSize(500, 200);
		L26.setFont(new Font("LCD", Font.BOLD, 14));
		L26.setForeground(Color.blue);

		L27 = new JLabel(
				"27 - ( A )  atenda as necessidades do presente. sem comprometer o futuro");
		L27.setLocation(10, 120);
		L27.setSize(600, 200);
		L27.setFont(new Font("LCD", Font.BOLD, 14));
		L27.setForeground(Color.yellow);

		L28 = new JLabel("28 - ( D )  Positivo");
		L28.setLocation(10, 140);
		L28.setSize(500, 200);
		L28.setFont(new Font("LCD", Font.BOLD, 14));
		L28.setForeground(Color.green);

		L29 = new JLabel(
				"29 - ( B )  CONAMA - Conselho Nacional do Meio Ambiente");
		L29.setLocation(10, 160);
		L29.setSize(500, 200);
		L29.setFont(new Font("LCD", Font.BOLD, 14));
		L29.setForeground(Color.red);

		L30 = new JLabel("30 - ( D )  Poluicao ambiental");
		L30.setLocation(10, 180);
		L30.setSize(500, 200);
		L30.setFont(new Font("LCD", Font.BOLD, 14));
		L30.setForeground(Color.blue);

		L31 = new JLabel(
				"31 - ( A )  Agressoes a natureza, Habitacao Impropria");
		L31.setLocation(10, 200);
		L31.setSize(500, 200);
		L31.setFont(new Font("LCD", Font.BOLD, 14));
		L31.setForeground(Color.yellow);

		L32 = new JLabel(
				"32 - ( A ) Desenvolver processos de reutilizacao da agua");
		L32.setLocation(10, 220);
		L32.setSize(500, 200);
		L32.setFont(new Font("LCD", Font.BOLD, 14));
		L32.setForeground(Color.green);

		L33 = new JLabel(
				"33 - ( D )  Degradacao dos mananciais e desperdicio no consumo");
		L33.setLocation(10, 240);
		L33.setSize(500, 200);
		L33.setFont(new Font("LCD", Font.BOLD, 14));
		L33.setForeground(Color.red);

		L34 = new JLabel(
				"34 - ( B )  A qualidade da agua e sua quantidade disponivel para o consumo ");
		L34.setLocation(10, 260);
		L34.setSize(600, 200);
		L34.setFont(new Font("LCD", Font.BOLD, 14));
		L34.setForeground(Color.blue);

		L35 = new JLabel(
				"35 - ( B )  Latas de aluminio como material para fabricacao de lingotes");
		L35.setLocation(10, 280);
		L35.setSize(500, 200);
		L35.setFont(new Font("LCD", Font.BOLD, 14));
		L35.setForeground(Color.yellow);

		L36 = new JLabel("36 - ( B )  220 Litros");
		L36.setLocation(10, 300);
		L36.setSize(500, 200);
		L36.setFont(new Font("LCD", Font.BOLD, 14));
		L36.setForeground(Color.green);

		L37 = new JLabel("37 - ( A )  11,5 litros de agua");
		L37.setLocation(10, 320);
		L37.setSize(500, 200);
		L37.setFont(new Font("LCD", Font.BOLD, 14));
		L37.setForeground(Color.red);

		L38 = new JLabel("38 - ( A )  600 litros de agua");
		L38.setLocation(10, 340);
		L38.setSize(500, 200);
		L38.setFont(new Font("LCD", Font.BOLD, 14));
		L38.setForeground(Color.blue);

		L39 = new JLabel("39 - ( C )  500 Caminhoes");
		L39.setLocation(10, 360);
		L39.setSize(500, 200);
		L39.setFont(new Font("LCD", Font.BOLD, 14));
		L39.setForeground(Color.yellow);

		L40 = new JLabel("40 - ( C )  3 dias");
		L40.setLocation(10, 380);
		L40.setSize(500, 200);
		L40.setFont(new Font("LCD", Font.BOLD, 14));
		L40.setForeground(Color.green);

		ImageIcon img2 = new ImageIcon(getClass().getClassLoader().getResource("v.png"));
		B1 = new JButton("", img2);
		B1.setSize(120, 50);
		B1.setLocation(380, 480);
		B1.addActionListener(this);
		B1.setFont(new Font("arial", Font.BOLD, 22));
		B1.setBackground(Color.red);
		B1.setFocusable(false);
		B1.setContentAreaFilled(false);
		B1.setForeground(Color.red);
		B1.setContentAreaFilled(false);
		B1.setBorderPainted(false);

		ImageIcon img3 = new ImageIcon(getClass().getClassLoader().getResource("sd.png"));
		B2 = new JButton("", img3);
		B2.setSize(150, 50);
		B2.setLocation(230, 480);
		B2.addActionListener(this);
		B2.setFont(new Font("arial", Font.BOLD, 22));
		B2.setBackground(Color.red);
		B2.setFocusable(false);
		B2.setContentAreaFilled(false);
		B2.setForeground(Color.red);
		B2.setContentAreaFilled(false);
		B2.setBorderPainted(false);

		ImageIcon img4 = new ImageIcon(getClass().getClassLoader().getResource("se.png"));
		B3 = new JButton("", img4);
		B3.setSize(150, 50);
		B3.setLocation(530, 480);
		B3.addActionListener(this);
		B3.setFont(new Font("arial", Font.BOLD, 22));
		B3.setBackground(Color.red);
		B3.setFocusable(false);
		B3.setContentAreaFilled(false);
		B3.setForeground(Color.red);
		B3.setContentAreaFilled(false);
		B3.setBorderPainted(false);

		P1 = new JPanel();
		P1.setSize(900, 600);
		P1.setLocation(0, 0);
		P1.setBackground(Color.white);
		P1.setLayout(null);

		getContentPane().setLayout(null);

		P1.add(L21);
		P1.add(L22);
		P1.add(L23);
		P1.add(L24);
		P1.add(L25);
		P1.add(L26);
		P1.add(L27);
		P1.add(L28);
		P1.add(L29);
		P1.add(L30);
		P1.add(L31);
		P1.add(L32);
		P1.add(L33);
		P1.add(L34);
		P1.add(L35);
		P1.add(L36);
		P1.add(L37);
		P1.add(L38);
		P1.add(L39);
		P1.add(L40);
		getContentPane().add(B1);
		getContentPane().add(B2);
		getContentPane().add(B3);
		getContentPane().add(P1);
		P1.add(L1);

	}

	public static void main(String arg[]) {
		new RespostasContinuacao().setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == B1) {
			try {
				new InicioJogo().setVisible(true);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			dispose();
		}

		if (e.getSource() == B2) {
			Respostas obj43 = new Respostas();
			obj43.setVisible(true);
			dispose();

		}

	}

}
