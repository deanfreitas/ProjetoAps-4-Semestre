package br.com.jogoaps;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Respostas extends JFrame implements ActionListener {
	JButton B1, B2, B3;
	JPanel P1;
	JLabel L1, L2, L3, L4, L5, L6, L7, L8, L9, L10, L11, L12, L13, L14, L15,
			L16, L17, L18, L19, L20, L21;

	public Respostas() {
		setTitle("RESPOSTA DAS PERGUNTAS PARTE 1");
		setSize(900, 600);
		setResizable(false);
		setLocation(50, 50);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon icon = new ImageIcon("./src/resp.jpg");
		L1 = new JLabel(icon);
		L1.setLocation(0, 0);
		L1.setSize(900, 600);

		L2 = new JLabel("1 - ( B )  Rio Grande");
		L2.setLocation(10, 0);
		L2.setSize(200, 200);
		L2.setFont(new Font("LCD", Font.BOLD, 14));
		L2.setForeground(Color.red);

		L3 = new JLabel("2 - ( B )  94,3%");
		L3.setLocation(10, 20);
		L3.setSize(200, 200);
		L3.setFont(new Font("LCD", Font.BOLD, 14));
		L3.setForeground(Color.blue);

		L4 = new JLabel(
				"3 - ( C )  Bolsas de sangue, material perfuro cortante, sangues, etc.");
		L4.setLocation(10, 40);
		L4.setSize(500, 200);
		L4.setFont(new Font("LCD", Font.BOLD, 14));
		L4.setForeground(Color.yellow);

		L5 = new JLabel("4 - ( B )  Ter um planeta saudavel;");
		L5.setLocation(10, 60);
		L5.setSize(200, 200);
		L5.setFont(new Font("LCD", Font.BOLD, 14));
		L5.setForeground(Color.green);

		L6 = new JLabel("5 - ( C )  Poluicao do solo.");
		L6.setLocation(10, 80);
		L6.setSize(200, 200);
		L6.setFont(new Font("LCD", Font.BOLD, 14));
		L6.setForeground(Color.red);

		L7 = new JLabel(
				"6 - ( C )  E qualquer materia de atividade humana que contenha radionuclideos.");
		L7.setLocation(10, 100);
		L7.setSize(600, 200);
		L7.setFont(new Font("LCD", Font.BOLD, 14));
		L7.setForeground(Color.blue);

		L8 = new JLabel(
				"7 - ( A )  Desmatamento e imprudencia no trato com o solo");
		L8.setLocation(10, 120);
		L8.setSize(500, 200);
		L8.setFont(new Font("LCD", Font.BOLD, 14));
		L8.setForeground(Color.yellow);

		L9 = new JLabel(
				"8 - ( B )  Emissao desenfreada de gases, crescimento populacional");
		L9.setLocation(10, 140);
		L9.setSize(500, 200);
		L9.setFont(new Font("LCD", Font.BOLD, 14));
		L9.setForeground(Color.green);

		L10 = new JLabel(
				"9 - ( A )  Capacidade de intergir com o presente, contribuindo com o futuro; ");
		L10.setLocation(10, 160);
		L10.setSize(630, 200);
		L10.setFont(new Font("LCD", Font.BOLD, 14));
		L10.setForeground(Color.red);

		L11 = new JLabel("10 - ( B )  Reduzir, Reutilizar, Reciclar;");
		L11.setLocation(10, 180);
		L11.setSize(500, 200);
		L11.setFont(new Font("LCD", Font.BOLD, 14));
		L11.setForeground(Color.blue);

		L12 = new JLabel("11 - ( B )  Queimadas, desmatamentos, industrias;");
		L12.setLocation(10, 200);
		L12.setSize(500, 200);
		L12.setFont(new Font("LCD", Font.BOLD, 14));
		L12.setForeground(Color.yellow);

		L13 = new JLabel(
				"12 - ( C )  Radioativos, quimicos, comuns, biologicos");
		L13.setLocation(10, 220);
		L13.setSize(500, 200);
		L13.setFont(new Font("LCD", Font.BOLD, 14));
		L13.setForeground(Color.green);

		L14 = new JLabel("13 - ( D )  Lixo organico");
		L14.setLocation(10, 240);
		L14.setSize(500, 200);
		L14.setFont(new Font("LCD", Font.BOLD, 14));
		L14.setForeground(Color.red);

		L15 = new JLabel("14 - ( A )  aterros sanitarios ");
		L15.setLocation(10, 260);
		L15.setSize(500, 200);
		L15.setFont(new Font("LCD", Font.BOLD, 14));
		L15.setForeground(Color.blue);

		L16 = new JLabel("15 - ( D )  20 mil toneladas ");
		L16.setLocation(10, 280);
		L16.setSize(500, 200);
		L16.setFont(new Font("LCD", Font.BOLD, 14));
		L16.setForeground(Color.yellow);

		L17 = new JLabel("16 - ( A )  26.703,24 (Km²)");
		L17.setLocation(10, 300);
		L17.setSize(500, 200);
		L17.setFont(new Font("LCD", Font.BOLD, 14));
		L17.setForeground(Color.green);

		L18 = new JLabel("17 - ( A )  Mais de 100 anos");
		L18.setLocation(10, 320);
		L18.setSize(500, 200);
		L18.setFont(new Font("LCD", Font.BOLD, 14));
		L18.setForeground(Color.red);

		L19 = new JLabel("18 - ( B )  Mais de 100 anos");
		L19.setLocation(10, 340);
		L19.setSize(500, 200);
		L19.setFont(new Font("LCD", Font.BOLD, 14));
		L19.setForeground(Color.blue);

		L20 = new JLabel("19 - ( D )  3,7 mil toneladas ");
		L20.setLocation(10, 360);
		L20.setSize(500, 200);
		L20.setFont(new Font("LCD", Font.BOLD, 14));
		L20.setForeground(Color.yellow);

		L21 = new JLabel("20 - ( C )  Plastico ");
		L21.setLocation(10, 380);
		L21.setSize(500, 200);
		L21.setFont(new Font("LCD", Font.BOLD, 14));
		L21.setForeground(Color.green);

		ImageIcon img2 = new ImageIcon("./src/v.png");
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

		ImageIcon img3 = new ImageIcon("./src/sd.png");
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

		ImageIcon img4 = new ImageIcon("./src/se.png");
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

		P1.add(L2);
		P1.add(L3);
		P1.add(L4);
		P1.add(L5);
		P1.add(L6);
		P1.add(L7);
		P1.add(L8);
		P1.add(L9);
		P1.add(L10);
		P1.add(L11);
		P1.add(L12);
		P1.add(L13);
		P1.add(L14);
		P1.add(L15);
		P1.add(L16);
		P1.add(L17);
		P1.add(L18);
		P1.add(L19);
		P1.add(L20);
		P1.add(L21);
		getContentPane().add(B1);
		getContentPane().add(B2);
		getContentPane().add(B3);
		getContentPane().add(P1);
		P1.add(L1);

	}

	public static void main(String arg[]) {
		new Respostas().setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == B1) {
			new InicioJogo().setVisible(true);
			dispose();

		}
		if (e.getSource() == B3) {
			RespostasContinuacao obj44 = new RespostasContinuacao();
			obj44.setVisible(true);
			dispose();

		}

	}

}
