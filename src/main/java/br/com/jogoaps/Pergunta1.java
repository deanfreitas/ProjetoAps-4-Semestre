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
import javax.swing.JTextField;

public class Pergunta1 extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2410718494926058585L;
	private JButton imagemVoltar;
	private JButton respostaA;
	private JButton respostaB;
	private JButton respostaC;
	private JButton respostaD;
	private JButton imagemOK;
	private JPanel tela;
	private JLabel imagem; 
	private JLabel pergunta; 
	private JLabel nomeJogador;
	private JTextField nomejogador;
	private double certa1 = 0;
	private String nome;

	public Pergunta1() {

		setTitle("1º PERGUNTA");
		setSize(900, 600);
		setResizable(false);
		setLocation(50, 50);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("b.jpg"));
		imagem = new JLabel(icon);
		imagem.setLocation(0, 0);
		imagem.setSize(900, 600);

		pergunta = new JLabel("<html>1 - Qual reservatorio de água de são paulo em 2014,<br> tinha o nivel de 70,5% ?</html>");
		pergunta.setLocation(20, 20);
		pergunta.setSize(800, 200);
		pergunta.setFont(new Font("Arial", Font.BOLD, 25));
		pergunta.setForeground(Color.black);
		pergunta.setVisible(false);

		nomeJogador = new JLabel("Digite o Nome do Jogador: ");
		nomeJogador.setLocation(260, 100);
		nomeJogador.setSize(500, 200);
		nomeJogador.setFont(new Font("Showcard Gothic", Font.BOLD, 30));
		nomeJogador.setForeground(Color.black);

		nomejogador = new JTextField("");
		nomejogador.setSize(250, 40);
		nomejogador.setLocation(350, 230);
		nomejogador.setFont(new Font("Showcard Gothic", Font.BOLD, 30));
		nomejogador.setForeground(Color.orange);

		ImageIcon img2 = new ImageIcon(getClass().getClassLoader().getResource("v.png"));
		imagemVoltar = new JButton("", img2);
		imagemVoltar.setSize(120, 50);
		imagemVoltar.setLocation(380, 480);
		imagemVoltar.addActionListener(this);
		imagemVoltar.setFont(new Font("Tahoma", Font.BOLD, 22));
		imagemVoltar.setBackground(Color.red);
		imagemVoltar.setFocusable(false);
		imagemVoltar.setContentAreaFilled(false);
		imagemVoltar.setForeground(Color.red);
		imagemVoltar.setContentAreaFilled(false);
		imagemVoltar.setBorderPainted(false);

		respostaA = new JButton("A)  Alto Tietê ");
		respostaA.setSize(220, 50);
		respostaA.setLocation(40, 160);
		respostaA.addActionListener(this);
		respostaA.setFont(new Font("Tahoma", Font.BOLD, 22));
		respostaA.setBackground(Color.red);
		respostaA.setFocusable(false);
		respostaA.setContentAreaFilled(false);
		respostaA.setForeground(Color.black);
		respostaA.setBorderPainted(false);
		respostaA.setVisible(false);

		respostaB = new JButton("  B)  Rio Grande "); // verdade
		respostaB.setSize(220, 50);
		respostaB.setLocation(40, 220);
		respostaB.addActionListener(this);
		respostaB.setFont(new Font("Tahoma", Font.BOLD, 22));
		respostaB.setBackground(Color.red);
		respostaB.setFocusable(false);
		respostaB.setContentAreaFilled(false);
		respostaB.setForeground(Color.black);
		respostaB.setBorderPainted(false);
		respostaB.setVisible(false);

		respostaC = new JButton("C)  Rio Claro ");
		respostaC.setSize(230, 50);
		respostaC.setLocation(30, 280);
		respostaC.addActionListener(this);
		respostaC.setFont(new Font("Tahoma", Font.BOLD, 22));
		respostaC.setBackground(Color.red);
		respostaC.setFocusable(false);
		respostaC.setContentAreaFilled(false);
		respostaC.setForeground(Color.black);
		respostaC.setBorderPainted(false);
		respostaC.setVisible(false);

		respostaD = new JButton("   D) Guarapiranga ");
		respostaD.setSize(260, 50);
		respostaD.setLocation(30, 340);
		respostaD.addActionListener(this);
		respostaD.setFont(new Font("Tahoma", Font.BOLD, 22));
		respostaD.setBackground(Color.red);
		respostaD.setFocusable(false);
		respostaD.setContentAreaFilled(false);
		respostaD.setForeground(Color.black);
		respostaD.setBorderPainted(false);
		respostaD.setVisible(false);

		ImageIcon img4 = new ImageIcon(getClass().getClassLoader().getResource("o.png"));
		imagemOK = new JButton("", img4);
		imagemOK.setSize(120, 50);
		imagemOK.setLocation(400, 280);
		imagemOK.addActionListener(this);
		imagemOK.setFont(new Font("Tahoma", Font.BOLD, 22));
		imagemOK.setBackground(Color.red);
		imagemOK.setFocusable(false);
		imagemOK.setContentAreaFilled(false);
		imagemOK.setForeground(Color.red);
		imagemOK.setContentAreaFilled(false);
		imagemOK.setBorderPainted(false);

		tela = new JPanel();
		tela.setSize(900, 600);
		tela.setLocation(0, 0);
		tela.setBackground(Color.black);
		tela.setLayout(null);

		getContentPane().setLayout(null);

		tela.add(nomeJogador);
		tela.add(pergunta);
		tela.add(nomejogador);
		getContentPane().add(imagemVoltar);
		getContentPane().add(respostaA);
		getContentPane().add(respostaB);
		getContentPane().add(respostaC);
		getContentPane().add(respostaD);
		getContentPane().add(imagemOK);
		getContentPane().add(tela);

		tela.add(imagem);

	}

	public static void main(String arg[]) {
		new Pergunta1().setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == imagemVoltar) {
			try {
				new InicioJogo().setVisible(true);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			dispose();

		}
		if (e.getSource() == respostaA) {
			Pergunta2 obj3 = new Pergunta2(certa1, nome);
			obj3.setVisible(true);
			dispose();

		}
		if (e.getSource() == respostaB) {
			certa1 += 2.5;

			Pergunta2 obj3 = new Pergunta2(certa1, nome);
			obj3.setVisible(true);
			dispose();

		}
		if (e.getSource() == respostaC) {
			Pergunta2 obj3 = new Pergunta2(certa1, nome);
			obj3.setVisible(true);
			dispose();

		}
		if (e.getSource() == respostaD) {
			Pergunta2 obj3 = new Pergunta2(certa1, nome);
			obj3.setVisible(true);
			dispose();

		}
		if (e.getSource() == imagemOK) {
			pergunta.setVisible(true);
			respostaA.setVisible(true);
			respostaB.setVisible(true);
			respostaC.setVisible(true);
			respostaD.setVisible(true);

			imagemOK.setVisible(false);
			nomejogador.setVisible(false);
			nome = (nomejogador.getText());
			nomeJogador.setVisible(false);
		}

	}

}
