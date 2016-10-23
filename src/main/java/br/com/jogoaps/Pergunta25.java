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

public class Pergunta25 extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8478018947220508466L;
	private JButton imagemSair;
	private JButton respostaA;
	private JButton respostaB;
	private JButton respostaC;
	private JButton respostaD;
	private JPanel tela;
	private JLabel imagem;
	private JLabel pergunta;
	private double pontuacao = 0;
	private String nomeJogador;

	public Pergunta25(double pontuacao, String nomeJogador) {
		this.pontuacao = pontuacao;
		this.nomeJogador = nomeJogador;
		setTitle("25º PERGUNTA");
		setSize(900, 600);
		setResizable(false);
		setLocation(50, 50);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("c1.jpg"));
		imagem = new JLabel(icon);
		imagem.setLocation(0, 0);
		imagem.setSize(900, 600);

		pergunta = new JLabel("25 - O que significa a sigla PNEA ?  ");
		pergunta.setLocation(20, 20);
		pergunta.setSize(800, 200);
		pergunta.setFont(new Font("arial", Font.BOLD, 20));
		pergunta.setForeground(Color.black);

		ImageIcon img3 = new ImageIcon(getClass().getClassLoader().getResource("b.png"));
		imagemSair = new JButton("", img3);
		imagemSair.setSize(120, 50);
		imagemSair.setLocation(380, 480);
		imagemSair.addActionListener(this);
		imagemSair.setFont(new Font("arial", Font.BOLD, 22));
		imagemSair.setBackground(Color.red);
		imagemSair.setFocusable(false);
		imagemSair.setContentAreaFilled(false);
		imagemSair.setForeground(Color.red);
		imagemSair.setContentAreaFilled(false);
		imagemSair.setBorderPainted(false);

		respostaA = new JButton("A)  Programa Nacional de Estudo Ambiental  ");
		respostaA.setSize(600, 50);
		respostaA.setLocation(20, 160);
		respostaA.addActionListener(this);
		respostaA.setFont(new Font("arial", Font.BOLD, 22));
		respostaA.setBackground(Color.red);
		respostaA.setFocusable(false);
		respostaA.setContentAreaFilled(false);
		respostaA.setForeground(Color.black);
		respostaA.setBorderPainted(false);

		respostaB = new JButton(
				"B)  Política Nacional de Educação Ambiental    ");// verdade
		respostaB.setSize(600, 50);
		respostaB.setLocation(25, 220);
		respostaB.addActionListener(this);
		respostaB.setFont(new Font("arial", Font.BOLD, 22));
		respostaB.setBackground(Color.red);
		respostaB.setFocusable(false);
		respostaB.setContentAreaFilled(false);
		respostaB.setForeground(Color.black);
		respostaB.setBorderPainted(false);

		respostaC = new JButton("C)  Programa Nacional da Escola Amiga    ");
		respostaC.setSize(600, 50);
		respostaC.setLocation(0, 280);
		respostaC.addActionListener(this);
		respostaC.setFont(new Font("arial", Font.BOLD, 22));
		respostaC.setBackground(Color.green);
		respostaC.setFocusable(false);
		respostaC.setContentAreaFilled(false);
		respostaC.setForeground(Color.black);
		respostaC.setBorderPainted(false);

		respostaD = new JButton(
				"D)  Política Nacional de Estudos Administrativos   ");
		respostaD.setSize(600, 50);
		respostaD.setLocation(40, 340);
		respostaD.addActionListener(this);
		respostaD.setFont(new Font("arial", Font.BOLD, 22));
		respostaD.setBackground(Color.red);
		respostaD.setFocusable(false);
		respostaD.setContentAreaFilled(false);
		respostaD.setForeground(Color.black);
		respostaD.setBorderPainted(false);

		tela = new JPanel();
		tela.setSize(900, 600);
		tela.setLocation(0, 0);
		tela.setBackground(Color.black);
		tela.setLayout(null);

		getContentPane().setLayout(null);

		tela.add(pergunta);

		getContentPane().add(imagemSair);
		getContentPane().add(respostaA);
		getContentPane().add(respostaB);
		getContentPane().add(respostaC);
		getContentPane().add(respostaD);
		getContentPane().add(tela);
		tela.add(imagem);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == respostaA) {

			Pergunta26 obj27 = new Pergunta26(pontuacao, nomeJogador);
			obj27.setVisible(true);
			dispose();
		}
		if (e.getSource() == respostaB) {
			pontuacao += 2.5;
			Pergunta26 obj27 = new Pergunta26(pontuacao, nomeJogador);
			obj27.setVisible(true);
			dispose();
		}
		if (e.getSource() == respostaC) {

			Pergunta26 obj27 = new Pergunta26(pontuacao, nomeJogador);
			obj27.setVisible(true);
			dispose();
		}
		if (e.getSource() == respostaD) {

			Pergunta26 obj27 = new Pergunta26(pontuacao, nomeJogador);
			obj27.setVisible(true);
			dispose();
		}
		if (e.getSource() == imagemSair) {
			System.exit(0);

		}
	}
}
